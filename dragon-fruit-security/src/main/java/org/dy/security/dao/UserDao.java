package org.dy.security.dao;


import org.dy.security.domain.po.UserPo;

/**
 * @author caiwl
 * @date 2020/8/20 17:09
 */
public interface UserDao {
    /**
     * 根据用户名查询用户信息
     * @param username 用户名
     * @return 用户信息
     */
    UserPo loadUserByUsername(String username);
}
