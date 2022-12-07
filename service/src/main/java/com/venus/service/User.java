package com.venus.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author mabl02 (mabl02@rd.netease.com)
 * @date 2022/12/4 13:03
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Long id;

    private String nickname;

    /**
     * 用户名，不允许重复
     */
    private String username;

    private String password;

    private String email;

    /**
     * 用户头像
     */
    private String icon;

    /**
     * 用户类型：0 普通用户  1 管理员用户  2 su用户
     */
    private Integer type;

    private Date createTime;

    private Date updateTime;

    private Integer member;
}
