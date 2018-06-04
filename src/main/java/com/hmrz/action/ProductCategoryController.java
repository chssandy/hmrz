/**
 * 文 件 名:  ProductCategoryController.java
 * 描       述:  商品类别管理
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
import com.hmrz.pojo.ProductCategoryBean;
import com.hmrz.search.ProductCategorySearch;
import com.hmrz.service.ProductCategoryService;

@Controller
@RequestMapping("/product/category")
public class ProductCategoryController extends BaseController
{
    @Autowired
    private ProductCategoryService service;
    
    /**
     * <pre>
     * 产品类别列表
     * </pre> 
     * @param search
     * @return
     * @throws HmrzException [参数说明]
     * @author sandy 2015年5月14日 下午1:54:50
     * @throws IOException 
     */
    @ResponseBody
    @RequestMapping(value = "/getList")
    public Map<String, Object> getProductCategoryList(ProductCategorySearch search) throws HmrzException
    {
        int count = service.getProductCategoryCount(search);
        List<ProductCategoryBean> list =null;
        if (count > 0)
        {
            list = service.getProductCategoryList(search);
        }
        return buildResult(doPage(count, list, search));
    }
    
    /**
     * <pre>
     * 保存产品类别
     * </pre> 
     * @param ProductCategoryBean 前台封装的产品类别
     * @return
     * @throws HmrzException [参数说明]
     * @author sandy 2015-5-22
     */
    @RequestMapping(value = {"/add"}, method = {RequestMethod.POST})
    @ResponseBody
    public Map<String, Object> addBrand(ProductCategoryBean bean, HttpServletRequest request) throws HmrzException
    {
        Map<String, Object> jsonMap = new HashMap<String, Object>();
        bean.setCreate_user(getOperator(request));
        ProductCategorySearch search = new ProductCategorySearch();
        search.setCategory_name_search(bean.getCategory_name());
        if(service.getProductCategory(search)!=null)
        {
        	jsonMap.put("result", "exist");
        }else
        {
	        String returnId = service.addProductCategory(bean);
	        if (StringUtils.isEmpty(returnId))
	        {
	            jsonMap.put("result", "fail");
	        }else{
	        	jsonMap.put("result", "success");
	        }
	        addOpeatorLog(request,
	                "/product/category/add",
	                "新增产品类别",
	                StaticVariables.LOG_INSERT,
	                bean.toString(),
	                !StringUtils.isEmpty(returnId),
	                StaticVariables.PLATFORM_WEB);
        }
        return buildResult(jsonMap);
    }
    
    /**
     * <pre>i
     * 删除产品类别，假删除
     * </pre> 
     * @param id 要删除的用户id或用逗号分隔的多个id串
     * @throws HmrzException [参数说明]
     * @author sandy 2015年5月22日 下午3:18:31
     */
    @ResponseBody
    @RequestMapping(value = "/del")
    public void delBrand(String id, HttpServletRequest request) throws HmrzException
    {
    	 service.delProductCategory(id);
         addOpeatorLog(request,
                 "/product/category/del",
                 "删除产品类别",
                 StaticVariables.LOG_DELETE,
                 "id:" + id,
                 true,
                 StaticVariables.PLATFORM_WEB);
    }
    
    /**
     * 根据category_id获取产品类别信息
     * @param category_id
     * @return
     * @throws HmrzException [参数说明]
     * @author sandy 2015年11月02日 下午4:19:58
     */
    @ResponseBody
    @RequestMapping(value = {"/get/{category_id}"})
    public Map<String, Object> getBrand(@PathVariable String category_id) throws HmrzException
    {
    	ProductCategorySearch search = new ProductCategorySearch();
    	search.setCategory_id_search(category_id);
        ProductCategoryBean bean = service.getProductCategory(search);
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
    Map<String, Object> modifyBrand(HttpServletRequest request, ProductCategoryBean bean) throws HmrzException
    {
    	ProductCategorySearch search = new ProductCategorySearch();
        search.setCategory_name_search(bean.getCategory_name());
        if(service.getProductCategoryCount(search)>0)
        {
        	return buildResult(2);
        }
        boolean success = service.modifyProductCategory(bean);
        addOpeatorLog(request,
                "/product/category/modify",
                "修改产品类别",
                StaticVariables.LOG_UPDATE,
                bean.toString(),
                success,
                StaticVariables.PLATFORM_WEB);
        return buildResult(success ? 0 : 1);
    }
    
}
