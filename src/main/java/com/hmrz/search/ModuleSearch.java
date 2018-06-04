package com.hmrz.search;

/**
 * 
 * 搜索分页bean 
 * @author  yl
 * @data  2014-4-17
 */
public class ModuleSearch extends Page
{
    private static final long serialVersionUID = 1590897596246649352L;
    
    private String pattern;
    
    /**
     * 是否包含根节点，true：是，false：否
     */
    private boolean IsIncludeRoot = true;
    
    /**
     * 是否只获取根菜单
     */
    private boolean onlyRoot = false;
    
    public String getPattern()
    {
        return pattern;
    }
    
    public void setPattern(String pattern)
    {
        this.pattern = pattern;
    }
    
    public boolean isIsIncludeRoot()
    {
        return IsIncludeRoot;
    }
    
    public void setIsIncludeRoot(boolean isIncludeRoot)
    {
        IsIncludeRoot = isIncludeRoot;
    }
    
    public boolean isOnlyRoot()
    {
        return onlyRoot;
    }
    
    public void setOnlyRoot(boolean onlyRoot)
    {
        this.onlyRoot = onlyRoot;
    }
}
