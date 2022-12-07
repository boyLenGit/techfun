package com.venus.service.utils;


import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author mabl02 (mabl02@rd.netease.com)
 * @date 2022/7/20 11:36
 */
public class TimeUtils {
    public static void main(String[] args) {
        System.out.println(timestampToHH(YYMMDDToTimestamp("2022-12-12")));;
    }

    /**
     * 字符串"年-月-日  时:分:秒"转换为1670818332000
     *
     * @param time 时间
     * @return {@link Timestamp}
     */
    public static Long YYMMDDHHMMSSToTimestamp(String time){
        if (time == null) {
            return 0L;
        }
        return Timestamp.valueOf(time).getTime();
    }

    /**
     * 字符串"年-月-日"转换为1670818332000
     *
     * @param time 时间
     * @return {@link Timestamp}
     */
    public static Long YYMMDDToTimestamp(String time){
        if (time == null) {
            return 0L;
        }
        return Timestamp.valueOf(time+" 00:00:00").getTime();
    }

    /**
     * 字符串"年-月-日"转换为1670818332000
     *
     * @param time 时间
     * @return {@link Timestamp}
     */
    public static Long YYMMDDToTimestamp(String time, String hhmmss){
        if (time == null) {
            return 0L;
        }
        return Timestamp.valueOf(time + " " + hhmmss).getTime();
    }

    /**
     * 时间戳转换为年-月-日 时:分:秒
     *
     * @param timestamp 时间戳
     * @return {@link String}
     */
    public static String timestampToYYMMDDHHMMSS(Long timestamp){
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(timestamp));
    }

    /**
     * 时间戳转换为年月日时分秒
     *
     * @param timestamp 时间戳
     * @return {@link String}
     */
    public static String timestampToYYMMDDHHMMSSNoLine(Long timestamp){
        return new SimpleDateFormat("yyyyMMddHHmmss").format(new Date(timestamp));
    }

    /**
     * 时间戳转换为年-月-日 时:分:秒
     *
     * @param timestamp 时间戳
     * @return {@link String}
     */
    public static String timestampToHH(Long timestamp){
        return new SimpleDateFormat("HH").format(new Date(timestamp));
    }

    /**
     * 时间戳转换为年-月-日
     *
     * @param timestamp 时间戳
     * @return {@link String}
     */
    public static String timestampToYYMMDD(Long timestamp){
        return new SimpleDateFormat("yyyy-MM-dd").format(new Date(timestamp));
    }

    /**
     * 时间戳转换为年-月-日
     *
     * @param timestamp 时间戳
     * @return {@link String}
     */
    public static String timestampToYYMM(Long timestamp){
        return new SimpleDateFormat("yyyy-MM").format(new Date(timestamp));
    }

    /**
     * 时间戳转换为时-分-秒
     *
     * @param timestamp 时间戳
     * @return {@link String}
     */
    public static String timestampToHHMMSS(Long timestamp){
        return new SimpleDateFormat("HH:mm:ss").format(new Date(timestamp));
    }

    /**
     * 时间戳转换为时分秒
     *
     * @param timestamp 时间戳
     * @return {@link String}
     */
    public static String timestampToHHMMSSNoDot(Long timestamp){
        return new SimpleDateFormat("HHmmss").format(new Date(timestamp));
    }

    /**
     * 获取当前时分秒
     *
     * @return {@link String}
     */
    public static String getNowHHMMSSNoDot(){
        return timestampToHHMMSSNoDot(getNowTimeStamp());
    }

    /**
     * 现在时间戳/1000后的结果
     *
     * @return {@link Long}
     */
    public static Long getNowTimeStampDivide1000L(){
        return System.currentTimeMillis() / 1000L;
    }

    /**
     * 获取当前时间，格式时间戳
     *
     * @return {@link Long}
     */
    public static Long getNowTimeStamp(){
        return System.currentTimeMillis();
    }

    /**
     * 时间戳转换为秒
     *
     * @return {@link Long}
     */
    public static Long TimeStampToSecond(Long timeStamp){
        return timeStamp / 1000L;
    }

    /**
     * 时间戳转换为分钟
     *
     * @return {@link Long}
     */
    public static Long TimeStampToMinute(Long timeStamp){
        return timeStamp / 1000L / 60L;
    }

    /**
     * 时间戳转换为小时
     *
     * @return {@link Long}
     */
    public static Long TimeStampToHour(Long timeStamp){
        return timeStamp / 1000L / 60L / 60L;
    }

    /**
     * 时间戳转换为天
     *
     * @return {@link Long}
     */
    public static Long TimeStampToDay(Long timeStamp){
        return timeStamp / 1000L / 60L / 60L / 24L;
    }

    /**
     * 根据时间 和时间格式 校验是否正确
     * @param length 校验的长度
     * @param sDate 校验的日期
     * @param format 校验的格式
     * @return
     */
    public static boolean isLegalDate(int length, String sDate,String format) {
        int legalLen = length;
        if ((sDate == null) || (sDate.length() != legalLen)) {
            return false;
        }
        DateFormat formatter = new SimpleDateFormat(format);
        try {
            Date date = formatter.parse(sDate);
            return sDate.equals(formatter.format(date));
        } catch (Exception e) {
            return false;
        }
    }
}
