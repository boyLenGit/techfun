package com.venus.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author mabl02 (mabl02@rd.netease.com)
 * @date 2022/12/6 19:34
 */
@RestController
@RequestMapping("/hardware")
public class HardwareController {
    @Autowired
    private HardwareService hardwareService;

    /**
     * 得到图卡列表
     *
     * @param request          请求
     * @param model            模型
     * @param manufacturer     制造商
     * @param releaseTimeStart 发布时间-开始时间，格式YYYY-MM
     * @param releaseTimeEnd   发布时间-结束时间，格式YYYY-MM
     * @param memoryType       内存类型
     * @param pageNum          分页-当前页码
     * @param pageSize         页面大小
     * @return {@link WebRes}<{@link ?}>
     */
    @GetMapping("/graphcard/list")
    public WebRes<?> getGraphCardList(HttpServletRequest request,
                                      @RequestParam(value = "model", required = false) String model,
                                      @RequestParam(value = "manufacturer", required = false) String manufacturer,
                                      @RequestParam(value = "releaseTimeStart", required = false) String releaseTimeStart,
                                      @RequestParam(value = "releaseTimeEnd", required = false) String releaseTimeEnd,
                                      @RequestParam(value = "memoryType", required = false) String memoryType,
                                      @RequestParam(value = "pageNum", required = false, defaultValue = "1") Integer pageNum,
                                      @RequestParam(value = "pageSize", required = false, defaultValue = "10") Integer pageSize){
        List<GraphCardEntity> cardList = hardwareService.getGraphCardList(model, manufacturer, releaseTimeStart, releaseTimeEnd, memoryType, pageNum - 1, pageSize);
        return WebRes.success(cardList);
    }
}
