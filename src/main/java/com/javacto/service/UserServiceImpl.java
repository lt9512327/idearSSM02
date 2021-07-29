package com.javacto.service;

import com.javacto.mapper.UserMapper;
import com.javacto.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * describe
 * 作者：曾昭武  adam8831
 */
@Service
@Transactional
public class UserServiceImpl implements UserService{

    @Resource
    private UserMapper userMapper;

    /**
     * 查询所有
     */
    public List<User> queryUserAll(){
        return userMapper.queryUserAll();
    }
    /**
     * 根据id查询
     */
    public User findById(int uid){
        return userMapper.findById(uid);
    }

    /**
     * 添加用户
     */
    public int insertUser(User user){
        return userMapper.insertUser(user);
    }
    /**
     * 修改用户
     */
    public int updateUser(User user){
        return userMapper.updateUser(user);
    }
    /**
     * 删除用户
     */
    public int deleteUser(int uid){
        return userMapper.deleteUser(uid);
    }
}
