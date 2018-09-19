/**
 * 文 件 名:  OpusController.java
 * 描       述:  设计作品管理
 * 创 建 人:  sandy
 * 创建时间:  2018年6月4
 * 日
 * 修改内容:  <修改内容>
 */
package com.hmrz.action;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hmrz.common.BaseController;
import com.hmrz.common.constants.StaticVariables;
import com.hmrz.common.exception.HmrzException;
import com.hmrz.pojo.OpusBean;
import com.hmrz.search.OpusSearch;
import com.hmrz.service.OpusService;

@Controller
@RequestMapping("/opus/opus")
public class OpusController extends BaseController
{
    @Autowired
    private OpusService service;
    
    /**
     * <pre>
     * 设计作品列表
     * </pre> 
     * @param search
     * @return
     * @throws HmrzException [参数说明]
     * @author sandy 2015年5月14日 下午1:54:50
     * @throws IOException 
     */
    @ResponseBody
    @RequestMapping(value = "/getList")
    public Map<String, Object> getProductCategoryList(OpusSearch search) throws HmrzException
    {
        int count = service.getCount(search);
        List<OpusBean> list =null;
        if (count > 0)
        {
            list = service.getList(search);
        }
        return buildResult(doPage(count, list, search));
    }
    
    /**
     * <pre>
     * 保存设计作品
     * </pre> 
     * @param OpusBean 前台封装的设计作品
     * @return
     * @throws HmrzException [参数说明]
     * @author sandy 2015-5-22
     */
    @RequestMapping(value = {"/add"}, method = {RequestMethod.POST})
    @ResponseBody
    public Map<String, Object> addOpus(OpusBean bean, HttpServletRequest request) throws HmrzException
    {
        Map<String, Object> jsonMap = new HashMap<String, Object>();
        bean.setCreate_user(getOperator(request));
        
        String returnId = service.addOpus(bean);
        if (StringUtils.isEmpty(returnId))
        {
            jsonMap.put("result", "fail");
        }else{
        	jsonMap.put("result", "success");
        }
        addOpeatorLog(request,
                "/opus/opus/add",
                "新增设计作品",
                StaticVariables.LOG_INSERT,
                bean.toString(),
                !StringUtils.isEmpty(returnId),
                StaticVariables.PLATFORM_WEB);
        return buildResult(jsonMap);
    }
    
    /**
     * <pre>i
     * 删除设计作品，假删除
     * </pre> 
     * @param id 要删除的用户id或用逗号分隔的多个id串
     * @throws HmrzException [参数说明]
     * @author sandy 2015年5月22日 下午3:18:31
     */
    @ResponseBody
    @RequestMapping(value = "/del")
    public void delOpus(String id, HttpServletRequest request) throws HmrzException
    {
    	 service.delOpus(id);
         addOpeatorLog(request,
                 "/opus/opus/del",
                 "删除设计作品",
                 StaticVariables.LOG_DELETE,
                 "id:" + id,
                 true,
                 StaticVariables.PLATFORM_WEB);
    }
    
    /**
     * 根据opus_id获取产品类别信息
     * @param opus_id
     * @return
     * @throws HmrzException [参数说明]
     * @author sandy 2015年11月02日 下午4:19:58
     */
    @ResponseBody
    @RequestMapping(value = {"/get/{opus_id}"})
    public Map<String, Object> getCase(@PathVariable String opus_id) throws HmrzException
    {
    	OpusSearch search = new OpusSearch();
    	search.setOpus_id_search(opus_id);
        OpusBean bean = service.getOpus(search);
        return buildResult(bean);
    }
    
    /**
     * 修改设计作品
     * @param bean
     * @return
     * @throws HmrzException [参数说明]
     * @author sandy 2015年11月02日 下午4:19:58
     */
    @ResponseBody
    @RequestMapping("/modify")
    Map<String, Object> modifyCase(HttpServletRequest request, OpusBean bean) throws HmrzException
    {
    	OpusSearch search = new OpusSearch();
        search.setOpus_id_search(bean.getOpus_id());
        if(service.getCount(search)>0)
        {
        	return buildResult(2);
        }
        boolean success = service.modifyOpus(bean);
        addOpeatorLog(request,
                "/opus/opus/modify",
                "修改设计作品",
                StaticVariables.LOG_UPDATE,
                bean.toString(),
                success,
                StaticVariables.PLATFORM_WEB);
        return buildResult(success ? 0 : 1);
    }
    
}
