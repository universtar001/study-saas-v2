package study.saas.common.util;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @author rocky.maple
 * @date 2019-08-25 11:50
 * 线程安全的时间处理
 */
public class DateUtilsV2 {

    public static DateTimeFormatter defaultFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public static DateTimeFormatter generalFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static DateTimeFormatter monthFormatter = DateTimeFormatter.ofPattern("yyyyMM");

    public static DateTimeFormatter chineseFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");

    public static DateTimeFormatter chineseFormatterSimple = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
    /**
     * 格式: ISO8601规范
     */
    static DateTimeFormatter dateFormatterISO = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");

    /**
     * date 转 localDateTime
     *
     * @param date 时间
     * @return localDateTime
     */
    public static LocalDateTime dateToLocalDateTime(Date date) {
        Instant instant = date.toInstant();
        ZoneId zone = ZoneId.systemDefault();
        return LocalDateTime.ofInstant(instant, zone);
    }

    /**
     * String ->LocalDateTime
     *
     * @param date      时间
     * @param formatter 格式
     * @return
     */
    public static LocalDateTime stringToLocalDateTime(String date, DateTimeFormatter formatter) {
        return LocalDateTime.parse(date, formatter);
    }

    /**
     * LocalDateTime -> String
     *
     * @param date      时间
     * @param formatter 格式
     * @return
     */
    public static String localDateTimeToString(LocalDateTime date, DateTimeFormatter formatter) {
        return date.format(formatter);
    }

    /**
     * localDateTime 转Date
     *
     * @param localDateTime 时间
     * @return date
     */
    public static Date localDateTimeToDate(LocalDateTime localDateTime) {
        ZoneId zone = ZoneId.systemDefault();
        Instant instant = localDateTime.atZone(zone).toInstant();
        return Date.from(instant);
    }

    /**
     * LocalTime 转Date
     *
     * @param localTime 时间
     * @return date
     */
    public static Date localTimeToDate(LocalTime localTime) {
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        ZoneId zone = ZoneId.systemDefault();
        Instant instant = localDateTime.atZone(zone).toInstant();
        return Date.from(instant);
    }
}
