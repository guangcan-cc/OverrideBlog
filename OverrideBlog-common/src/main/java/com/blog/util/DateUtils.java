/******************************************************************************
 * CREATETIME : 2014年6月26日 下午8:06:14
 ******************************************************************************/
package com.blog.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 日期工具：日期转换、加减、比较
 * 
 * @author ★LiuPing
 */
public class DateUtils {

	/*** 年到月日期格式 yyyy-MM */
	public static final String YToMon = "yyyy-MM";
	/*** 年到天日期格式 yyyy-MM-dd */
	public static final String YToDay = "yyyy-MM-dd";
	/*** 年到分日期时间格式 yyyy-MM-dd HH:mm */
	public static final String YToHour = "yyyy-MM-dd HH";
	/*** 年到分日期时间格式 yyyy-MM-dd HH:mm */
	public static final String YToMin = "yyyy-MM-dd HH:mm";
	/*** 年到秒日期时间格式 yyyy-MM-dd HH:mm:ss */
	public static final String YToSec = "yyyy-MM-dd HH:mm:ss";
	/*** 年到毫秒日期时间格式 yyyy-MM-dd HH:mm:ss:SSS*/
	public static final String YToSecSSS = "yyyy-MM-dd HH:mm:ss:SSS";
	/*** 年到天日期格式 yyyyMMdd */
	public static final String YMD = "yyyyMMdd";
	/*** 年到小时日期格式 yyyyMMddHH */
	public static final String YMDH = "yyyyMMddHH";
	/*** 年到分钟日期格式 yyyyMMddHHmm */
	public static final String YMDHM = "yyyyMMddHHmm";
	/*** 年到秒数日期格式 yyyyMMddHHmmss */
	public static final String YMDHMS = "yyyyMMddHHmm";
	/*** 年到毫秒数日期格式 yyyyMMddHHmmssSSS */
	public static final String YMDHMSSSS = "yyyyMMddHHmmSSS";

	/*** 年 */
	public static final int YEAR = Calendar.YEAR;
	/** 月 */
	public static final int MONTH = Calendar.MONTH;
	/** 天 */
	public static final int DAY = Calendar.DAY_OF_MONTH;
	/** 时 */
	public static final int HOUR = Calendar.HOUR_OF_DAY;
	/** 分 */
	public static final int MINUTE = Calendar.MINUTE;

	/*** 默认日期格式 */
	// 这里可以增加更多的日期格式，用得多的放在前面
	private static final String[] parsePatterns = new String[] { YToDay, YToSec, YToHour, YToMin, YMD,
			"yyyy-MM-dd HH:mm:ss.SSS" };

	/**
	 * 现在时间 Date类型
	 * 
	 * @return
	 */
	public static Date now() {
		return new Date();
	}

	/**
	 * 现在时间 Date类型,自定义格式,不建议使用此方法，此方法以被 now(int field)方法代替
	 * 
	 * @param format
	 * @return
	 * @throws ParseException
	 */
	@Deprecated
	public static Date now(String format) throws ParseException {
		String nowStr = dateToStr(new Date(), format);
		return strToDate(nowStr, format);
	}

	/**
	 * 根据精度获取当前时间， 例如:<br>
	 * DateUtils.now(DateUtils.MONTH)=2014-07-01 00:00:00<br>
	 * DateUtils.now(DateUtils.DAY)        =2014-07-10 00:00:00<br>
	 * @param field
	 */
	public static Date now(int field) {
		return trunc(new Date(), field);
	}

	/**
	 * 将日期取整到天<br>
	 * 例如 :trunc(2014-07-10 09:59:00)得到日期2014-07-10 00:00:00
	 * @param date
	 */
	public static Date trunc(Date date) {
		return trunc(date, DAY);
	}

	/**
	 * 日期时间取整<br>
	 * 例如 : dateStr = "2014-07-10 09:59:03";<br>
	 * DateUtils.trunc(date, DateUtils.DAY)=2014-07-10 00:00:00<br>
	 * DateUtils.trunc(date, DateUtils.HOUR)=2014-07-10 09:00:00<br>
	 * DateUtils.trunc(date, DateUtils.MINUTE)=2014-07-10 09:59:00<br>
	 * @param date 日期
	 * @param field 取整到哪个精度
	 */
	public static Date trunc(Date date, int field) {
		return org.apache.commons.lang.time.DateUtils.truncate(date, field);
	}

	/**
	 * 现在时间，yyyy-MM-dd HH:mm:ss 的格式
	 * 
	 * @return
	 */
	public static String nowStr() {
		return dateToStr(new Date(), YToSec);
	}

	/**
	 * 根据指定格式获取当前时间,返回字符串，
	 * @return
	 */
	public static String nowStr(String format) {
		return dateToStr(new Date(), format);
	}

	/**
	 * 将string类型的日期格式转换为Date，不用指定格式，根据变量parsePatterns按顺序自动匹配
	 * @param dateStr
	 * @return
	 * @throws ParseException
	 * @modified: ☆LiuPing(2014年7月10日 上午9:20:55): <br>
	 */
	public static Date strToDate(String dateStr) throws ParseException {
		if (dateStr == null || dateStr.trim().equals("")) {
			return null;
		}
		return org.apache.commons.lang.time.DateUtils.parseDate(dateStr, parsePatterns);
	}
	/**
	 * 将string类型的日期格式转换为Date
	 * 
	 * @param dateStr
	 * @param format
	 * @return
	 * @throws ParseException
	 */
	public static Date strToDate(String dateStr, String format) throws ParseException {
		if(dateStr==null||dateStr.trim().equals("")){
			return null;
		}
		DateFormat myFormat = new SimpleDateFormat(format);
		return myFormat.parse(dateStr.trim());
	}

	/**
	 * 将date按格式转换为String
	 * 
	 * @param date
	 * @param format
	 * @return
	 * @throws ParseException
	 */
	public static String dateToStr(Date date, String format) {
		if (date == null)
			return "";
		DateFormat myFormat = new SimpleDateFormat(format);
		return myFormat.format(date);
	}

	/**
	 * 年份加减
	 * 
	 * @param date
	 * @param amount
	 * @return
	 */
	public static Date addYears(Date date, int amount) {
		return add(date, Calendar.YEAR, amount);
	}

	public static Date addMonths(Date date, int amount) {
		return add(date, Calendar.MONTH, amount);
	}

	public static Date addWeeks(Date date, int amount) {
		return add(date, Calendar.WEEK_OF_YEAR, amount);
	}

	public static Date addDays(Date date, int amount) {
		return add(date, Calendar.DATE, amount);
	}

	public static Date addHours(Date date, int amount) {
		return add(date, Calendar.HOUR_OF_DAY, amount);
	}

	public static Date addMinutes(Date date, int amount) {
		return add(date, Calendar.MINUTE, amount);
	}
	
	public static Date addSeconds(Date date, int amount) {
		return add(date, Calendar.SECOND, amount);
	}

	public static Date add(Date date, int calendarField, int amount) {
		if (date == null) {
			throw new IllegalArgumentException("The date must not be null");
		}
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.add(calendarField, amount);
		return c.getTime();
	}

	/**
	 * date1-date2 相差多少天
	 * 
	 * @param date1
	 * @param date2
	 * @return
	 */
	public static int compareDays(Date date1, Date date2) {
		long disSes = date1.getTime() - date2.getTime();
		return (int) (disSes / (1000 * 60 * 60 * 24));
	}

	/**
	 * date1-date2 相差多少月,计算短期费率(不满一月当作一月)
	 * @param date1
	 * @param date2
	 * @return
	 * @modified:
	 * ☆qianxin(2014年7月24日 上午10:56:08): <br>
	 */
	public static int compareMonthsShortRate(Date date1, Date date2){
		int year1 = getFieldValue(date1, DateUtils.YEAR);//date1年份
		int month1 = getFieldValue(date1, DateUtils.MONTH);//date1月份
		int day1 = getFieldValue(date1, DateUtils.DAY);//date1日期
		int hour1 = getFieldValue(date1, DateUtils.HOUR);//date1小时
		int year2 = getFieldValue(date2, DateUtils.YEAR);//date2年份
		int month2 = getFieldValue(date2, DateUtils.MONTH);//date2月份
		int day2 = getFieldValue(date2, DateUtils.DAY);//date2日期
		int hour2 = getFieldValue(date2, DateUtils.HOUR);//date2小时
		
		int monthValues = (year1 - year2)*12 +(month1 - month2);//月份差
		if((day1 - day2 >0)||((day1 == day2)&&(hour1<hour2))){
			monthValues += 1;
		}
		return monthValues;
	}
	
	/**
	 * date1-date2相差的分钟数
	 * @param date1
	 * @param date2
	 * @return
	 */
	public static int compareMinutes(Date date1, Date date2){
		if(date1 == null || date2 == null){
			return -1;
		}
		long timeOne=date1.getTime();
		long timeTwo=date2.getTime();
		long minutes=(timeOne-timeTwo)/(1000*60);//转化minutes
		return (int)minutes;
	}
	
	/**
	 * 相差多少月,计算实际价值(不满则减)
	 * @param date1
	 * @param date2
	 * @return
	 * @modified:
	 * ☆qianxin(2015年5月26日 下午3:42:22): <br>
	 */
	public static int compareMonths(Date date1, Date date2){
		int year1 = getFieldValue(date1, DateUtils.YEAR);//date1年份
		int month1 = getFieldValue(date1, DateUtils.MONTH);//date1月份
		int day1 = getFieldValue(date1, DateUtils.DAY);//date1日期
		int hour1 = getFieldValue(date1, DateUtils.HOUR);//date1小时
		int year2 = getFieldValue(date2, DateUtils.YEAR);//date2年份
		int month2 = getFieldValue(date2, DateUtils.MONTH);//date2月份
		int day2 = getFieldValue(date2, DateUtils.DAY);//date2日期
		int hour2 = getFieldValue(date2, DateUtils.HOUR);//date2小时
		
		int monthValues = (year1 - year2)*12 +(month1 - month2);//月份差
		if((day1 - day2 <0)||((day1 == day2)&&(hour1>hour2))){
			monthValues -= 1;
		}
		return monthValues;
	}
	/**
	 * 换算为一天的最后一秒
	 * 
	 * @param endDate
	 * @return
	 * @modified: ☆LiuPing(2014年7月1日 下午4:55:04): <br>
	 */
	public static Date toDateEnd(Date endDate) {
		if (endDate == null) return null;
		Calendar c = Calendar.getInstance();
		c.setTime(endDate);
		c.set(Calendar.HOUR_OF_DAY, 23);
		c.set(Calendar.MINUTE, 59);
		c.set(Calendar.SECOND, 59);
		return c.getTime();
	}

	/**
	 * 给日期设置小时
	 * @param date
	 * @param hour
	 * @return
	 * @modified: ☆qianxin(2014年7月4日 下午4:36:38): <br>
	 */
	public static Date getDateByValue(Date date, Integer hour) {
		return getDateByValue(date, hour, 0);
	}

	/**
	 * 给日期设置小时和分钟
	 * @param date
	 * @param hour
	 * @param minute
	 * @return
	 * @modified: ☆qianxin(2014年7月4日 下午4:36:38): <br>
	 */
	public static Date getDateByValue(Date date, Integer hour, Integer minute) {
		if (hour == null) hour = 0;
		if (minute == null) minute = 0;
		Date newDate = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.set(Calendar.HOUR,hour);
		c.set(Calendar.MINUTE,minute);
		newDate.setTime(c.getTimeInMillis());
		return newDate;
	}
	
	/**
	 * 获取属性值
	 * @param date 日期
	 * @param field 属性(年、月、日等)
	 * @return
	 * @modified:
	 * ☆qianxin(2014年7月24日 上午9:44:32): <br>
	 */
	public static int getFieldValue(Date date,int field){
		int fieldValue = 0;
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		fieldValue = c.get(field);
		return fieldValue;
	}
	
	public static void main(String[] args) throws ParseException {
		String dateStr = "2014-07-10 09:59:03";
		Date date = DateUtils.strToDate(dateStr);

		System.out.println("DateUtils.now(DateUtils.MONTH)="
				+ DateUtils.dateToStr(DateUtils.now(DateUtils.MONTH), DateUtils.YToSec));
		System.out.println("DateUtils.now(DateUtils.DAY)="
				+ DateUtils.dateToStr(DateUtils.now(DateUtils.DAY), DateUtils.YToSec));
		System.out.println("DateUtils.trunc(date, DateUtils.DAY)="
				+ DateUtils.dateToStr(DateUtils.trunc(date, DateUtils.DAY), DateUtils.YToSec));
		System.out.println("DateUtils.trunc(date, DateUtils.HOUR)="
				+ DateUtils.dateToStr(DateUtils.trunc(date, DateUtils.HOUR), DateUtils.YToSec));
		System.out.println("DateUtils.trunc(date, DateUtils.MINUTE)="
				+ DateUtils.dateToStr(DateUtils.trunc(date, DateUtils.MINUTE), DateUtils.YToSec));
	}

}
