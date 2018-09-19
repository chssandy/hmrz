/**
 * 文 件 名:  CaseController.java
 * 描       述:  案例管理
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
import com.hmrz.pojo.CaseBean;
import com.hmrz.search.CaseSearch;
import com.hmrz.service.CaseService;

@Controller
@RequestMapping("/case/case")
public class CaseController extends BaseController
{
    @Autowired
    private CaseService service;
    
    /**
     * <pre>
     * 案例列表
     * </pre> 
     * @param search
     * @return
     * @throws HmrzException [参数说明]
     * @author sandy 2015年5月14日 下午1:54:50
     * @throws IOException 
     */
    @ResponseBody
    @RequestMapping(value = "/getList")
    public Map<String, Object> getProductCategoryList(CaseSearch search) throws HmrzException
    {
        int count = service.getCount(search);
        List<CaseBean> list =null;
        if (count > 0)
        {
            list = service.getList(search);
        }
        return buildResult(doPage(count, list, search));
    }
    
    /**
     * <pre>
     * 保存案例
     * </pre> 
     * @param CaseBean 前台封装的案例
     * @return
     * @throws HmrzException [参数说明]
     * @author sandy 2015-5-22
     */
    @RequestMapping(value = {"/add"}, method = {RequestMethod.POST})
    @ResponseBody
    public Map<String, Object> addCase(CaseBean bean, HttpServletRequest request) throws HmrzException
    {
        Map<String, Object> jsonMap = new HashMap<String, Object>();
        bean.setCreate_user(getOperator(request));
        
        String returnId = service.addCase(bean);
        if (StringUtils.isEmpty(returnId))
        {
            jsonMap.put("result", "fail");
        }else{
        	jsonMap.put("result", "success");
        }
        addOpeatorLog(request,
                "/case/case/add",
                "新增案例",
                StaticVariables.LOG_INSERT,
                bean.toString(),
                !StringUtils.isEmpty(returnId),
                StaticVariables.PLATFORM_WEB);
        return buildResult(jsonMap);
    }
    
    /**
     * <pre>i
     * 删除案例，假删除
     * </pre> 
     * @param id 要删除的用户id或用逗号分隔的多个id串
     * @throws HmrzException [参数说明]
     * @author sandy 2015年5月22日 下午3:18:31
     */
    @ResponseBody
    @RequestMapping(value = "/del")
    public void delCase(String id, HttpServletRequest request) throws HmrzException
    {
    	 service.delCase(id);
         addOpeatorLog(request,
                 "/case/case/del",
                 "删除案例",
                 StaticVariables.LOG_DELETE,
                 "id:" + id,
                 true,
                 StaticVariables.PLATFORM_WEB);
    }
    
    /**
     * 根据case_id获取产品类别信息
     * @param case_id
     * @return
     * @throws HmrzException [参数说明]
     * @author sandy 2015年11月02日 下午4:19:58
     */
    @ResponseBody
    @RequestMapping(value = {"/get/{case_id}"})
    public Map<String, Object> getCase(@PathVariable String case_id) throws HmrzException
    {
    	CaseSearch search = new CaseSearch();
    	search.setCase_id_search(case_id);
        CaseBean bean = service.getCase(search);
        return buildResult(bean);
    }
    
    /**
     * 修改产品类别信息
     * @param bean
     * @return
     * @throws HmrzException [参数说明]
     * @author sandy 2015年11月02日 下午4:19:58
     */
    @ResponseBody
    @RequestMapping("/modify")
    Map<String, Object> modifyCase(HttpServletRequest request, CaseBean bean) throws HmrzException
    {
    	CaseSearch search = new CaseSearch();
        search.setName_search(bean.getName());
        if(service.getCount(search)>0)
        {
        	return buildResult(2);
        }
        boolean success = service.modifyCase(bean);
        addOpeatorLog(request,
                "/case/case/modify",
                "修改案例",
                StaticVariables.LOG_UPDATE,
                bean.toString(),
                success,
                StaticVariables.PLATFORM_WEB);
        return buildResult(success ? 0 : 1);
    }
    
}
