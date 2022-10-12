package study.saas.common.util;

import study.saas.common.enumutil.ExceptionEnum;
import study.saas.common.exceptions.DescribeException;
import org.springframework.util.StringUtils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

/**
 * @author Peter on 2017-03-14.
 */
public class DateUtils {

    static SimpleDateFormat defaultFormatter = new SimpleDateFormat("yyyy-MM-dd");

    static SimpleDateFormat generalFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    static SimpleDateFormat monthFormatter = new SimpleDateFormat("yyyyMM");

    static SimpleDateFormat chineseFormatter = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");

    static SimpleDateFormat chineseFormatterSimple = new SimpleDateFormat("yyyy年MM月dd日");

    static SimpleDateFormat generalFormatterTZ = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");

    static java.time.format.DateTimeFormatter formatter = java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public static Date stringToTime(String dateStr) {
        if (dateStr == null || dateStr.length() == 0 || dateStr == "") {
            return null;
        }
        Date date;
        try {
            date = generalFormatter.parse(dateStr);
        } catch (ParseException e) {
            throw new DescribeException(ExceptionEnum.UNVIABLE_DATE);
        }
        return date;
    }


    public static Long stringToTimeStamp(String dateStr) {
        if (dateStr == null || dateStr.length() == 0) {
            return null;
        }
        Date date;
        try {
            date = generalFormatter.parse(dateStr);
        } catch (ParseException e) {
            throw new DescribeException(ExceptionEnum.UNVIABLE_DATE);
        }
        return date.getTime();
    }

    public static Date stringToDate(String dateStr) {
        if (dateStr == null || dateStr.length() == 0) {
            return null;
        }
        return localDateToDate(LocalDate.parse(dateStr, formatter));
    }

    public static Date localDateToDate(LocalDate localDate) {
        return Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }

    public static Date localDateTimeToDate(LocalDateTime localDateTime) {
        return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
    }

    public static LocalDateTime dateToLocalDateTime(Date date) {
        return LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
    }


    public static String dateToString(Date date) {

        if (date == null) {
            return "";
        }

        return defaultFormatter.format(date);
    }

    public static String dateToGeneralString(Date date) {

        if (StringUtils.isEmpty(date)) {
            return "";
        }

        return generalFormatter.format(date);
    }

    public static String dateToGeneralStringByObject(Object date) {

        if (StringUtils.isEmpty(date)) {
            return "";
        }
        String resultDate;
        try {
            resultDate = generalFormatter.format(date);
        } catch (IllegalArgumentException e) {
            if (e.getMessage().contains("Cannot format given Object as a Date")) {
                Long dateLong = Long.parseLong(date.toString());
                resultDate = generalFormatter.format(dateLong);
            } else {
                throw e;
            }

        }
        return resultDate;
    }

    public static String dateToChinese(Date date) {

        if (StringUtils.isEmpty(date)) {
            return "";
        }

        return chineseFormatter.format(date);
    }

    public static String dateToChineseSimple(Date date) {

        if (StringUtils.isEmpty(date)) {
            return "";
        }

        return chineseFormatterSimple.format(date);
    }

    public static String dateToGeneralStringTZ(Date date) {

        if (StringUtils.isEmpty(date)) {
            return "";
        }

        return generalFormatterTZ.format(date);
    }


    public static String getThisMonth() {
        Date date = new Date();
        return monthFormatter.format(date);
    }


    public static int dayOfMonth(Date date) {

        return toLocalDate(date).getDayOfMonth();

    }

    public static LocalDate plusDays(LocalDate localDate) {
        return localDate.plusDays(1);
    }

    public static Date plusDays(Date date) {
        return toDate(toLocalDate(date).plusDays(1));
    }

    public static Date plusDays(Date date, int days) {
        return toDate(toLocalDate(date).plusDays(days));
    }

    public static Date precisePlusDays(Date date, int days) {
        return new Date(date.getTime() + days * 24 * 60 * 60 * 1000);
    }

    public static Date precisePlusMinutes(Date date, int minutes) {
        return new Date(date.getTime() + minutes * 60 * 1000);
    }

    public static Date toDate(LocalDate localDate) {
        return Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }

    public static LocalDate toLocalDate(Date date) {

        if (date instanceof java.sql.Date) {
            return ((java.sql.Date) date).toLocalDate();
        }

        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

    public static String getSystemDateStamp() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        String timeStamp = sdf.format(date);
        return timeStamp;

    }

    public static String getSystemTimeSimple() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String timeStamp = sdf.format(date);
        return timeStamp;

    }


    public static Long getTimeDifference(String date1, String date2) throws ParseException {
        long beginTime = defaultFormatter.parse(date1).getTime();
        long endTime = defaultFormatter.parse(date2).getTime();
        return endTime - beginTime;
    }

    public static Long getTimeDifference(String date1) throws ParseException {
        long beginTime = defaultFormatter.parse(date1).getTime();
        long endTime = System.currentTimeMillis();
        return endTime - beginTime;
    }

    public static String getDateFromTimeStampStr(String timeStampStr) {
        if (StringUtil.isEmpty(timeStampStr))
            return null;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        long lt = new Long(timeStampStr);
        Date date = new Date(lt);
        return simpleDateFormat.format(date);
    }

    public static String getDateTimeFromTimeStampStr(String timeStampStr) {
        if (StringUtil.isEmpty(timeStampStr))
            return null;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long lt = new Long(timeStampStr);
        Date date = new Date(lt);
        return simpleDateFormat.format(date);

    }

    public static Date getDateByDateStr(String dataFormate, String dataStr) {

        if (StringUtil.isEmpty(dataFormate)) {
            dataFormate = "yyyy-MM-dd";
        }

        DateFormat sdf = new SimpleDateFormat(dataFormate);
        Date date = null;
        try {
            if (StringUtil.isNumeric(dataStr)) {
                long lt = new Long(dataStr);
                date = new Date(lt);
            } else {
                date = sdf.parse(dataStr);

            }
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return date;

    }

    /**
     * 获得某个月最大天数
     *
     * @param year  年份
     * @param month 月份 (1-12)
     * @return 某个月最大天数
     */
    public static int getMaxDayByYearMonth(int year, int month) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year - 1);
        calendar.set(Calendar.MONTH, month);
        return calendar.getActualMaximum(Calendar.DATE);
    }

    public static String getDateTimeStr() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        return simpleDateFormat.format(date);

    }

    public static String timeStampToString(long timeStamp) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date(timeStamp);
        return simpleDateFormat.format(date);
    }

    public static Date timeStampToDate(long timeStamp) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date(timeStamp);
        return stringToTime(simpleDateFormat.format(date));
    }

    //获取今天凌晨的Calendar
    public static Calendar getThisDayMorning() {
        Calendar calendar = Calendar.getInstance();//得到当前时间
        calendar.set(Calendar.HOUR_OF_DAY, 0);//小时
        calendar.set(Calendar.SECOND, 0);//分钟
        calendar.set(Calendar.MINUTE, 0);//秒
        calendar.set(Calendar.MILLISECOND, 0);//毫秒
        return calendar;
    }

    public static String strDateToString(String date) throws ParseException {
        //注意是空格+UTC
        date = date.replace("Z", " UTC");
        //注意格式化的表达式
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS Z");
        Date tempDate = format.parse(date);
        //d的值Tue Nov 19 00:00:00 CST 1996
        return dateToString(tempDate);
    }


    /**
     * 用于计算订单（服务）开始日期的方法
     */
    public static Date handleStartDate() {
        Calendar calendar = Calendar.getInstance();
        Date date = new Date(System.currentTimeMillis());
        calendar.setTime(date);
        calendar.add(Calendar.DATE, 1);
        date = calendar.getTime();
        return date;
    }

    /**
     * 用于计算截止日期的方法
     */
    public static Date handleDeadLine(Date startDate, Integer paidType, Integer itemNum) {
        Date returnDate = null;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(startDate);
        if (null != paidType) {
            if (1 == paidType) {
                calendar.add(Calendar.MONTH, itemNum);
                returnDate = calendar.getTime();
            }
            if (2 == paidType) {
                calendar.add(Calendar.MONTH, 3 * itemNum);
                returnDate = calendar.getTime();
            }
            if (3 == paidType) {
                calendar.add(Calendar.YEAR, itemNum);
                returnDate = calendar.getTime();
            }
            if (4 == paidType) {
                calendar.add(Calendar.WEEK_OF_YEAR, 2 * itemNum);
                returnDate = calendar.getTime();
            }
        }
        return returnDate;
    }


    /*******  计算2个日期相隔的自然月  ************************/
    public static int getDay(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.DATE);
    }

    /**
     * 返回日期的月份，1-12,即yyyy-MM-dd中的MM
     *
     * @param date
     * @return
     */
    public static int getMonth(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.MONTH) + 1;
    }

    /**
     * 返回日期的年,即yyyy-MM-dd中的yyyy
     *
     * @param date Date
     * @return int
     */
    public static int getYear(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.YEAR);
    }

    public static int getDaysOfMonth(int year, int month) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, 1);
        return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
    }

    public static int calDiffMonth(String startDate, String endDate) {
        int result = 0;
        try {
            SimpleDateFormat sfd = new SimpleDateFormat("yyyy-MM-dd");
            Date start = sfd.parse(startDate);
            Date end = sfd.parse(endDate);
            int startYear = getYear(start);
            int startMonth = getMonth(start);
            int startDay = getDay(start);
            int endYear = getYear(end);
            int endMonth = getMonth(end);
            int endDay = getDay(end);
            if (startDay > endDay) { //1月17  大于 2月28
                if (endDay == getDaysOfMonth(getYear(new Date()), 2)) {   //也满足一月
                    result = (endYear - startYear) * 12 + endMonth - startMonth;
                } else {
                    result = (endYear - startYear) * 12 + endMonth - startMonth - 1;
                }
            } else {
                result = (endYear - startYear) * 12 + endMonth - startMonth;
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return result;
    }


    /**
     * 通过时间秒毫秒数判断两个时间的间隔
     *
     * @param date1
     * @param date2
     * @return
     */
    public static int differentDaysByMillisecond(Date date1, Date date2) {
        int days = (int) ((date2.getTime() - date1.getTime()) / (1000 * 3600 * 24));
        return days;
    }

    /**
     * 由出生日期获得年龄
     */
    public static int getAge(Date birthDay) throws Exception {
        Calendar cal = Calendar.getInstance();

        if (cal.before(birthDay)) {
            throw new IllegalArgumentException(
                    "出生时间错误");
        }
        int yearNow = cal.get(Calendar.YEAR);
        int monthNow = cal.get(Calendar.MONTH);
        int dayOfMonthNow = cal.get(Calendar.DAY_OF_MONTH);
        cal.setTime(birthDay);

        int yearBirth = cal.get(Calendar.YEAR);
        int monthBirth = cal.get(Calendar.MONTH);
        int dayOfMonthBirth = cal.get(Calendar.DAY_OF_MONTH);

        int age = yearNow - yearBirth;

        if (monthNow <= monthBirth) {
            if (monthNow == monthBirth) {
                if (dayOfMonthNow < dayOfMonthBirth) {
                    age--;
                }
            } else {
                age--;
            }
        }
        return age;
    }

    public static Boolean isTodayAndAfter(LocalDateTime date) {
        LocalDateTime localDateTime = LocalDateTime.of(date.getYear(), date.getMonth(), date.getDayOfMonth(), date.getHour(), date.getMinute());
        LocalDate localDate = localDateTime.toLocalDate();
        LocalDate localDate1 = LocalDate.now();
        if (localDate.equals(localDate1) || localDate.isAfter(localDate1)) {
            return true;
        } else {
            return false;
        }

    }
}
