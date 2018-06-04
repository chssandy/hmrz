/**
 * 文 件 名:  FormFieldsConstants.java
 * 描    述:  <表单元素类型>
 * 创 建 人:  sandy
 * 创建时间:  2015年05月08日
 * 修改内容:  <修改内容>
 */
package com.hmrz.common.constants;

public class TaskConstants
{ 
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
    
    /**==========================业务类别========================================
     * 业务类别：监测
     */
    public static String BUSINESS_TYPE_MONITOR = "1";  
    /**
     * 业务类别：微信分享
     */
    public static String BUSINESS_TYPE_SHARE_WX = "2";  
    /**
     * 业务类别：采集-找媒体
     */
    public static String BUSINESS_TYPE_COLLECT_MEDIA = "3";  
    /**
     * 业务类别：商超督察
     */
    public static String BUSINESS_TYPE_INSPECTE = "4";  
    /**
     * 业务类别：采集-商超采集
     */
    public static String BUSINESS_TYPE_COLLECT_SUPERMARKET = "5";  
    /**
     * 业务类别：调研
     */
    public static String BUSINESS_TYPE_SURVEY = "6";
    /**
     * 业务类别：上报
     */
    public static String BUSINESS_TYPE_REPORT = "7";
    /**
     * 业务类别：监播
     */
    public static String BUSINESS_TYPE_SUPERVISE = "8";
    
    /**
     * ==========================业务类别 END========================================
     */
    
    /**==========================业务类别 字符串格式========================================
     * 业务类别：监测
     */
    public static String TASK_BIZ_MONITOR = "monitor";  
    /**
     * 业务类别：微信分享
     */
    public static String TASK_BIZ_SHARE_WX = "share_wx";  
    /**
     * 业务类别：采集-找媒体-商超采集
     */
    public static String TASK_BIZ_COLLECT_MEDIA = "media";  
    /**
     * 业务类别：商超督察
     */
    public static String TASK_BIZ_INSPECTE = "inspecte";  
    /**
     * 业务类别：调研
     */
    public static String TASK_BIZ_SURVEY = "survey";
    /**
     * ==========================业务类别 END========================================
     */
    
}
