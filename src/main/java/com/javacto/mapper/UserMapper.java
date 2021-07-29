package com.javacto.mapper;

import com.javacto.po.User;

import java.util.List;

/**
 * describe
 * 作者：曾昭武  adam8831
 */
public interface UserMapper {
    /**
     * 查询所有
     */
    public List<User> queryUserAll();
    /**
     * 根据id查询
     */
    public User findById(int uid);

    /**
     * 添加用户
     */
    public int insertUser(User user);
    /**
     * 修改用户
     */
    public int updateUser(User user);
    /**
     * 删除用户
     */
    public int deleteUser(int uid);

}
