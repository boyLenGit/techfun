package com.venus.service;

import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * @author mabl02 (mabl02@rd.netease.com)
 * @date 2022/12/4 15:45
 */
@Repository
public interface HardwareMapper {
    /**
     * 获取显卡列表
     *
     * @param model        模型
     * @param manufacturer 制造商
     * @param startIndex   开始指数
     * @param pageSize     页面大小
     * @param memoryType   内存类型
     * @return {@link List}<{@link GraphCardEntity}>
     */
    List<GraphCardEntity> getGraphCardListByPage(String model, String manufacturer, Date releaseTimeStart, Date releaseTimeEnd, String memoryType, Integer startIndex, Integer pageSize);

    /**
     * 获取显卡列表-只返回少部分内容，用于显卡列表
     *
     * @param model        模型
     * @param manufacturer 制造商
     * @param startIndex   开始指数
     * @param pageSize     页面大小
     * @param memoryType   内存类型
     * @return {@link List}<{@link GraphCardEntity}>
     */
    List<GraphCardEntity> getGraphCardListByPageLite(String model, String manufacturer, Date releaseTimeStart, Date releaseTimeEnd, String memoryType, Integer startIndex, Integer pageSize);

}
