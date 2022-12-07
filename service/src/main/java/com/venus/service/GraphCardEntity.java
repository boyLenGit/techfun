package com.venus.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 显卡
 * @author kirky
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GraphCardEntity {

    private Long id;

    /**
     * 图标
     */
    private String icon;

    /**
     * 型号:GeForce RTX 3080Ti
     */
    private String model;

    /**
     * 厂商:AMD/NVIDIA/INTEL/国产
     */
    private String manufacturer;

    /**
     * 制程工艺
     */
    private String processTechnology;

    /**
     * 发布时间
     */
    private Date releaseTime;

    /**
     * 发布时间
     */
    private String releaseTimeFormat;

    /**
     * 晶体管
     */
    private Integer transistors;

    /**
     * 晶体管数 单位
     */
    private String transistorsUnit;

    /**
     * 核心大小
     */
    private String dieSize;

    /**
     * 核心大小单位：mm^2
     */
    private String dieSizeUnit;

    /**
     * 浮点数
     */
    private Long flops;

    /**
     * 浮点单位：TFLOPS
     */
    private String flopsUnit;

    // *********************** 芯片 ***********************
    /**
     * 核心代号:GA102-225
     */
    private String coreName;

    /**
     * 基础频率
     */
    private Integer baseClock;

    /**
     * 加速频率
     */
    private Integer boostClock;

    /**
     * 频率单位
     */
    private String clockUnit;

    /**
     * cuda核心数
     */
    private Integer cudaCoreNum;

    /**
     * tensor核心数
     */
    private Integer tensorCores;

    /**
     * RT Core数量
     */
    private Integer rtCores;

    /**
     * 流处理器数
     */
    private Integer processors;

    /**
     * l1高速缓存
     */
    private Integer l1Cache;

    /**
     * l1高速缓存单位
     */
    private String l1CacheUnit;

    /**
     * l2高速缓存
     */
    private Integer l2Cache;

    /**
     * l2高速缓存单位
     */
    private String l2CacheUnit;


    // *********************** 显存 ***********************
    /**
     * 显存大小
     */
    private Integer memorySize;

    /**
     * 显存单位:GB MB KB
     */
    private String memorySizeUnit;

    /**
     * 显存类型:	GDDR6X
     */
    private String memoryType;

    /**
     * 内存频率
     */
    private Integer memoryClock;

    /**
     * 内存频率单位
     */
    private String memoryClockUnit;

    /**
     * 显存位宽
     */
    private Integer memoryBusWidth;

    /**
     * 显存带宽
     */
    private String memoryWidth;

    /**
     * 显存带宽单位
     */
    private String memoryWidthUnit;


    // *********************** 电源 ***********************
    /**
     * 电源接口:8pin+8pin+8pin
     */
    private String powerInput;

    /**
     * 供电模式:8pin+8pin+8pin
     */
    private String powerMode;

    /**
     * 功耗
     */
    private Integer power;

    /**
     * 最大功耗
     */
    private Integer maxPower;

    /**
     * 功耗单位
     */
    private String powerUnit;

    /**
     * TDP，用的是功耗单位
     */
    private Integer tdp;

    // *********************** 接口 ***********************
    /**
     * 接口类型:PCI Express 4.0 16X
     */
    private String powerInputType;

    /**
     * io接口
     */
    private String ioInterface;

    /**
     * 其他属性
     */
    private String otherAttribute;
}
