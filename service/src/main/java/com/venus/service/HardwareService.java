package com.venus.service;

import com.gryffindor.techgeek.service.utils.TimeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author mabl02 (mabl02@rd.netease.com)
 * @date 2022/12/6 19:30
 */
@Service
public class HardwareService {
    @Autowired
    private HardwareMapper hardwareMapper;

    public List<GraphCardEntity> getGraphCardList(String model, String manufacturer, String releaseTimeStart, String releaseTimeEnd, String memoryType, Integer pageNum, Integer pageSize){
        Integer startIndex = pageNum * pageSize;
        Date releaseDateStart = new Date();
        releaseDateStart.setTime(TimeUtils.YYMMDDToTimestamp(releaseTimeStart));
        Date releaseDateEnd = new Date();
        releaseDateEnd.setTime(TimeUtils.YYMMDDToTimestamp(releaseTimeEnd));
        // 查
        List<GraphCardEntity> cardList = hardwareMapper.getGraphCardListByPage(model, manufacturer, releaseDateStart, releaseDateEnd, memoryType, startIndex, pageSize);
        for (GraphCardEntity entity: cardList){
            Date releaseTime = entity.getReleaseTime();
            entity.setReleaseTimeFormat(TimeUtils.timestampToYYMM(releaseTime.getTime()));
        }
        return cardList;
    }
}
