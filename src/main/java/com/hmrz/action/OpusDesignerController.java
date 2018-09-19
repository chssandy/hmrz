/**
 * 文 件 名:  OpusDesignerController.java
 * 描       述:  设计师管理
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
import com.hmrz.pojo.OpusDesignerBean;
import com.hmrz.search.OpusDesignerSearch;
import com.hmrz.service.OpusDesignerService;

@Controller
@RequestMapping("/opus/designer")
public class OpusDesignerController extends BaseController
{
    @Autowired
    private OpusDesignerService service;
    
    /**
     * <pre>
     * 设计师列表
     * </pre> 
     * @param search
     * @return
     * @throws HmrzException [参数说明]
     * @author sandy 2015年5月14日 下午1:54:50
     * @throws IOException 
     */
    @ResponseBody
    @RequestMapping(value = "/getList")
    public Map<String, Object> getProductCategoryList(OpusDesignerSearch search) throws HmrzException
    {
        int count = service.getCount(search);
        List<OpusDesignerBean> list =null;
        if (count > 0)
        {
            list = service.getList(search);
        }
        return buildResult(doPage(count, list, search));
    }
    
    /**
     * <pre>
     * 保存设计师
     * </pre> 
     * @param OpusDesignerBean 前台封装的设计师
     * @return
     * @throws HmrzException [参数说明]
     * @author sandy 2015-5-22
     */
    @RequestMapping(value = {"/add"}, method = {RequestMethod.POST})
    @ResponseBody
    public Map<String, Object> addOpusDesigner(OpusDesignerBean bean, HttpServletRequest request) throws HmrzException
    {
        Map<String, Object> jsonMap = new HashMap<String, Object>();
        bean.setCreate_user(getOperator(request));
        
        String returnId = service.addOpusDesigner(bean);
        if (StringUtils.isEmpty(returnId))
        {
            jsonMap.put("result", "fail");
        }else{
        	jsonMap.put("result", "success");
        }
        addOpeatorLog(request,
                "/opus/designer/add",
                "新增设计师",
                StaticVariables.LOG_INSERT,
                bean.toString(),
                !StringUtils.isEmpty(returnId),
                StaticVariables.PLATFORM_WEB);
        return buildResult(jsonMap);
    }
    
    /**
     * <pre>i
     * 删除设计师，假删除
     * </pre> 
     * @param id 要删除的用户id或用逗号分隔的多个id串
     * @throws HmrzException [参数说明]
     * @author sandy 2015年5月22日 下午3:18:31
     */
    @ResponseBody
    @RequestMapping(value = "/del")
    public void delOpusDesigner(String id, HttpServletRequest request) throws HmrzException
    {
    	 service.delOpusDesigner(id);
         addOpeatorLog(request,
                 "/opus/designer/del",
                 "删除设计师",
                 StaticVariables.LOG_DELETE,
                 "id:" + id,
                 true,
                 StaticVariables.PLATFORM_WEB);
    }
    
    /**
     * 根据designer_id获取产品类别信息
     * @param designer_id
     * @return
     * @throws HmrzException [参数说明]
     * @author sandy 2015年11月02日 下午4:19:58
     */
    @ResponseBody
    @RequestMapping(value = {"/get/{designer_id}"})
    public Map<String, Object> getOpusDesigner(@PathVariable String designer_id) throws HmrzException
    {
    	OpusDesignerSearch search = new OpusDesignerSearch();
    	search.setDesigner_id_search(designer_id);
        OpusDesignerBean bean = service.getOpusDesigner(search);
        return buildResult(bean);
    }
    
    /**
     * 修改设计师
     * @param bean
     * @return
     * @throws HmrzException [参数说明]
     * @author sandy 2015年11月02日 下午4:19:58
     */
    @ResponseBody
    @RequestMapping("/modify")
    Map<String, Object> modifyOpusDesigner(HttpServletRequest request, OpusDesignerBean bean) throws HmrzException
    {
    	OpusDesignerSearch search = new OpusDesignerSearch();
        search.setDesigner_id_search(bean.getDesigner_id());
        if(service.getCount(search)>0)
        {
        	return buildResult(2);
        }
        boolean success = service.modifyOpusDesigner(bean);
        addOpeatorLog(request,
                "/opus/designer/modify",
                "修改设计师",
                StaticVariables.LOG_UPDATE,
                bean.toString(),
                success,
                StaticVariables.PLATFORM_WEB);
        return buildResult(success ? 0 : 1);
    }
    
}
