/**
 * 文 件 名:  FormFieldsConstants.java
 * 描    述:  <表单元素类型>
 * 创 建 人:  sandy
 * 创建时间:  2015年05月08日
 * 修改内容:  <修改内容>
 */
package com.hmrz.common.constants;

public class FormFieldsConstants
{
    /**
     * 单行文本
     */
    public static int FORM_INPUT = 1;
    
    /**
     * 多行文本
     * 
     */
    public static int FORM_TEXTAREA = 2;
   
    /**
     * 单选框
     */
    public static int FORM_RADIO = 3;

    /**
     * 复选框
     */
    public static int FORM_CHECKBOX = 4;
    
    /**
     * 下拉列表
     */
    public static int FORM_SELECT = 5;
    
    /**
     * 时间
     */
    public static int FORM_TIME = 6;
    
    /**
     * 日期
     */
    public static int FORM_DATE = 7;

    /**
     * 数字
     */
    public static int FORM_NUMBER = 8;
    
    /**
     * 邮箱
     */
    public static int FORM_EMAIL = 9;
    
    /**
     * 地址
     */
    public static int FORM_ADDRESS = 10;
    
    /**
     * 网址
     */
    public static int FORM_WEBSITE = 11;
    
    /**
     * 价格
     */
    public static int FORM_PRICE = 12;
    
    /**
     * 上传文件
     */
    public static int FORM_FILE = 13;
    
    /**
     * 图片
     */
    public static int FORM_IMAGE= 14;
    
    /**
     * 是否为模板（是）
     */
    public static String IS_MODEL="1";
    /**
     * 是否为模板（否）
     */
    public static String IS_NOT_MODEL="0";
    /**
     * 系统人员发布
     */
    public static String CREATE_TYPE_SYSTEM="0";
    /**
     * 商户发布
     */
    public static String CREATE_TYPE_VENDOR="1";
    /**
     * 用户发布
     */
    public static String CREATE_TYPE_USER="2";
    
    /**
     * 任务状态：草稿  
     */
    public static String STATUS_DRAFT="0";
    /**
     * 任务状态:待审核 
     */
    public static String STATUS_AUDIT="1";
    /**
     * 任务状态:发布
     */
    public static String STATUS_PUBLISHED="2";
    /**
     * 任务状态:驳回 
     */
    public static String STATUS_REJECTED="3";
    /**
     * 任务状态:全部完成 
     */
    public static String STATUS_FINISHED="4";
    /**
     * 任务状态:半完成
     */
    public static String STATUS_HALF_FINISHED="5";
    /**
     * 任务状态:零完成（无人执行）
     */
    public static String STATUS_ZERO_FINISHED="6";
    /**
     * 任务状态:关闭
     */
    public static String STATUS_OVERDUE="7";
    
    /**
     * 申请人任务状态：未申请
     */
    public static int USER_TASK_STATUS_NOT_APPLY = -1;
    
    /**
     * 申请人任务状态：待指派
     */
    public static int USER_TASK_STATUS_TO_BE_ASSIGNED = 0;
    
    /**
     * 申请人任务状态：待执行
     */
    public static int USER_TASK_STATUS_TO_BE_EXECUTE = 1;
    
    /**
     * 申请人任务状态：待上传
     */
    public static int USER_TASK_STATUS_TO_BE_UPLOAD = 2;
    
    /**
     * 申请人任务状态：待审核
     */
    public static int USER_TASK_STATUS_TO_BE_AUDIT = 3;
    
    /**
     * 申请人任务状态：完成
     */
    public static int USER_TASK_STATUS_COMMIT = 4;
    
    /**
     * 申请人任务状态：验收未通过
     */
    public static int USER_TASK_STATUS_REJECT = 5;
    
    /**
     * 申请人任务状态：放弃
     */
    public static int USER_TASK_STATUS_ABANDON = 6;
    
}
