/**
 * 文 件 名:  ProductController.java
 * 描       述:  产品管理
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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hmrz.common.BaseController;
import com.hmrz.common.constants.StaticVariables;
import com.hmrz.common.exception.HmrzException;
import com.hmrz.pojo.ProductBean;
import com.hmrz.search.ProductSearch;
import com.hmrz.service.ProductService;

@Controller
@RequestMapping("/product/product")
public class ProductController extends BaseController
{
    @Autowired
    private ProductService service;
    
    /**
     * <pre>
     * 产品列表
     * </pre> 
     * @param search
     * @return
     * @throws HmrzException [参数说明]
     * @author sandy 2015年5月14日 下午1:54:50
     * @throws IOException 
     */
    @ResponseBody
    @RequestMapping(value = "/getList")
    public Map<String, Object> getProductCategoryList(ProductSearch search) throws HmrzException
    {
        int count = service.getCount(search);
        List<ProductBean> list =null;
        if (count > 0)
        {
            list = service.getList(search);
        }
        return buildResult(doPage(count, list, search));
    }
    
    /**
     * <pre>
     * 保存产品
     * </pre> 
     * @param ProductBean 前台封装的产品
     * @return
     * @throws HmrzException [参数说明]
     * @author sandy 2015-5-22
     */
    @RequestMapping(value = {"/add"}, method = {RequestMethod.POST})
    @ResponseBody
    public Map<String, Object> addProduct(@RequestBody ProductBean bean, HttpServletRequest request) throws HmrzException
    {
        Map<String, Object> jsonMap = new HashMap<String, Object>();
        bean.setCreate_user(getOperator(request));
        
        String returnId = service.addProduct(bean);
        if (StringUtils.isEmpty(returnId))
        {
            jsonMap.put("result", "fail");
        }else{
        	jsonMap.put("result", "success");
        }
        addOpeatorLog(request,
                "/Product/Product/add",
                "新增产品",
                StaticVariables.LOG_INSERT,
                bean.toString(),
                !StringUtils.isEmpty(returnId),
                StaticVariables.PLATFORM_WEB);
        return buildResult(jsonMap);
    }
    
    /**
     * <pre>i
     * 删除产品，假删除
     * </pre> 
     * @param id 要删除的用户id或用逗号分隔的多个id串
     * @throws HmrzException [参数说明]
     * @author sandy 2015年5月22日 下午3:18:31
     */
    @ResponseBody
    @RequestMapping(value = "/del")
    public void delProduct(String id, HttpServletRequest request) throws HmrzException
    {
    	 service.delProduct(id);
         addOpeatorLog(request,
                 "/Product/Product/del",
                 "删除产品",
                 StaticVariables.LOG_DELETE,
                 "id:" + id,
                 true,
                 StaticVariables.PLATFORM_WEB);
    }
    
    /**
     * 根据Product_id获取产品类别信息
     * @param Product_id
     * @return
     * @throws HmrzException [参数说明]
     * @author sandy 2015年11月02日 下午4:19:58
     */
    @ResponseBody
    @RequestMapping(value = {"/get/{Product_id}"})
    public Map<String, Object> getProduct(@PathVariable String Product_id) throws HmrzException
    {
    	ProductSearch search = new ProductSearch();
    	search.setProduct_id_search(Product_id);
        ProductBean bean = service.getProduct(search);
        return buildResult(bean);
    }
    
    /**
     * 修改产品信息
     * @param bean
     * @return
     * @throws HmrzException [参数说明]
     * @author sandy 2015年11月02日 下午4:19:58
     */
    @ResponseBody
    @RequestMapping("/modify")
    Map<String, Object> modifyProduct(HttpServletRequest request, ProductBean bean) throws HmrzException
    {
    	ProductSearch search = new ProductSearch();
    	search.setProduct_id_search(bean.getProduct_id());
        if(service.getCount(search)>0)
        {
        	return buildResult(2);
        }
        boolean success = service.modifyProduct(bean);
        addOpeatorLog(request,
                "/product/product/modify",
                "修改产品",
                StaticVariables.LOG_UPDATE,
                bean.toString(),
                success,
                StaticVariables.PLATFORM_WEB);
        return buildResult(success ? 0 : 1);
    }
    
}
