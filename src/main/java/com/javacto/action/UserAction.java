package com.javacto.action;

import com.javacto.po.User;
import com.javacto.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * describe
 * 作者：曾昭武  adam8831
 */
@Controller
@RequestMapping("/user")
public class UserAction {
    @Resource
    private UserService userService;
    @RequestMapping("queryUserAll")
    public   String queryUserAll(Model model){
        //1.调用查询方法
        List<User> list = userService.queryUserAll();
        model.addAttribute("list",list);
        return "userList";
    }
    @RequestMapping("/goAddUser")
    public  String goAddUser(){
        return "addUser";
    }
    @RequestMapping("addUser")
    public String addUser(User user){
        userService.insertUser(user);
        return "redirect:/user/queryUserAll.do";
    }
    /**
     * 删除
     * @param uid
     * @return
     */
    @RequestMapping("/deleteUser/{uid}")
    public String deleteUser(@PathVariable("uid") Integer uid){
        userService.deleteUser(uid);
        return "redirect:/user/queryUserAll.do";
    }
}
