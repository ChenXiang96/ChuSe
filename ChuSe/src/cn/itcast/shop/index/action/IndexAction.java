package cn.itcast.shop.index.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 访问首页action
 * @author lenovo
 *
 */
public class IndexAction extends ActionSupport {

	/**
	 * 访问首页方法
	 */
    public String execute(){
    	
    	return "index";
    }
}
