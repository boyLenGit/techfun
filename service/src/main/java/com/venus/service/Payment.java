package com.venus.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author mabl02 (mabl02@rd.netease.com)
 * @date 2022/12/4 13:07
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment {
    private Long id;

    private Long paymentId;

    private String username;

    private Date createTime;

    private Date updateTime;
}
