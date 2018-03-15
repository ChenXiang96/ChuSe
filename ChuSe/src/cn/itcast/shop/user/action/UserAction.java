package cn.itcast.shop.user.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 用户模块的Action类
 * @author lenovo
 *
 */
public class UserAction extends ActionSupport{
/**
 * 跳转到菜谱页面的方法
 */
    public String gallery(){
   	  return "galleryPage";
    }

}
