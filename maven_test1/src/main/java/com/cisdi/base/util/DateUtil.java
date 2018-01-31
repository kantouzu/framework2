package com.cisdi.base.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
/**
 * 
 * @author dongs
 *
 * 2016年10月4日 上午11:30:22
 */
public class DateUtil {
	
	public static final String PATTERN_FULL = "yyyy-MM-dd HH:mm:ss";
	public static final String PATTERN_TO_MIN = "yyyy-MM-dd HH:mm";
	public static final String PATTERN_TO_HOUR = "yyyy-MM-dd HH";
	public static final String PATTERN_TO_DAY = "yyyy-MM-dd";
	public static final String PATTERN_TO_MONTH = "yyyy-MM";
	public static final String PATTERN_FULL_NOSEPA = "yyyyMMddHHmmss";
	public static final String PATTERN_TO_MIN_NOSEPA = "yyyyMMddHHmm";
	public static final String PATTERN_TO_HOUR_NOSEPA = "yyyyMMddHH";
	public static final String PATTERN_TO_DAY_NOSEPA = "yyyyMMdd";
	
	/**
	 * @return获取当前时间
	 */
	public static Date getCurrentDate(){
		return new Date();
	}
	
	/**
	 * @param date
	 * @return将日期转化为字符串（yyyy-MM-dd）
	 */
	public static String convertDateToString(Date date){
		SimpleDateFormat sdf = new SimpleDateFormat(PATTERN_TO_DAY);
		return sdf.format(date);
	}
	
	/**
	 * @param date
	 * @param pattern
	 * @return将日期转化为字符串
	 */
	public static String convertDateToString(Date date, String pattern){
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		return sdf.format(date);
	}
	
	/**
	 * @param dateStr
	 * @return将字符串转化为日期
	 * @throws ParseException
	 */
	public static Date convertStringToDate(String dateStr, String pattern){
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		Date date = null;
		try {
			date = sdf.parse(dateStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
	
	/**
	 * @return获取当前日期字符串（yyyy-MM-dd）
	 */
	public static String getCurrentDateStr(){
		return convertDateToString(getCurrentDate());
	}
	
	/**
	 * @param pattern
	 * @return根据指定格式获取当前日期字符串
	 */
	public static String getCurrentDateStr(String pattern){
		return convertDateToString(getCurrentDate(), pattern);
	}
	
	/**
	 * @return获取当前时间毫秒数
	 */
	public static long getCurrentTimeMillis(){
		return System.currentTimeMillis();
	}
	
	/**
	 * @return获取当前年
	 */
	public static int getCurrentYear(){
		return Calendar.getInstance().get(Calendar.YEAR);
	}
	
	/**
	 * @return获取当前月
	 */
	public static int getCurrentMonth(){
		return Calendar.getInstance().get(Calendar.MONTH)+1;
	}
	
	/**
	 * @return获取当前日
	 */
	public static int getCurrentDay(){
		return Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
	}
	
	/**
	 * @return获取当前月的天数
	 */
	@SuppressWarnings("deprecation")
	public static int getCurrentMonthDays(){
		Date date = getCurrentDate();
		date.setMonth(date.getMonth()+1);
		date.setDate(0);
		return date.getDate();
	}
	
	/**
	 * @return获取上个月的天数
	 */
	@SuppressWarnings("deprecation")
	public static int getPreMonthDays(){
		Date date = getCurrentDate();
		date.setDate(0);
		return date.getDate();
	}
	
	/**
	 * @return获取下个月的天数
	 */
	@SuppressWarnings("deprecation")
	public static int getNextMonthDays(){
		Date date = getCurrentDate();
		date.setMonth(date.getMonth()+2);
		date.setDate(0);
		return date.getDate();
	}
	
	/**
	 * @return获取当前月第一天
	 */
	@SuppressWarnings("deprecation")
	public static String getFirstDayOfCurrentMonth(){
		Date date = getCurrentDate();
		date.setDate(1);
		return convertDateToString(date);
	}
	
	/**
	 * @return获取当前月最后一天
	 */
	@SuppressWarnings("deprecation")
	public static String getLastDayOfCurrentMonth(){
		Date date = getCurrentDate();
		date.setDate(getCurrentMonthDays());
		return convertDateToString(date);
	}
	
	/**
	 * @return获取上个月第一天
	 */
	@SuppressWarnings("deprecation")
	public static String getFirstDayOfPreMonth(){
		Date date = getCurrentDate();
		date.setMonth(date.getMonth()-1);
		date.setDate(1);
		return convertDateToString(date);
	}
	
	/**
	 * @return获取上个月最后一天
	 */
	@SuppressWarnings("deprecation")
	public static String getLastDayOfPreMonth(){
		Date date = getCurrentDate();
		date.setDate(0);
		return convertDateToString(date);
	}
	
	/**
	 * @return获取下个月第一天
	 */
	@SuppressWarnings("deprecation")
	public static String getFirstDayOfNextMonth(){
		Date date = getCurrentDate();
		date.setMonth(date.getMonth()+1);
		date.setDate(1);
		return convertDateToString(date);
	}
	
	/**
	 * @return获取下个月最后一天
	 */
	@SuppressWarnings("deprecation")
	public static String getLastDayOfNextMonth(){
		Date date = getCurrentDate();
		date.setMonth(date.getMonth()+2);
		date.setDate(0);
		return convertDateToString(date);
	}
	
	/**
	 * @return获取昨天日期
	 */
	@SuppressWarnings("deprecation")
	public static String getYesterdayStr(){
		Date date = getCurrentDate();
		date.setDate(date.getDate()-1);
		return convertDateToString(date);
	}
	
	/**
	 * @return获取明天日期
	 */
	@SuppressWarnings("deprecation")
	public static String getTomorrowStr(){
		Date date = getCurrentDate();
		date.setDate(date.getDate()+1);
		return convertDateToString(date);
	}
	
	/**
	 * 日期加上毫秒数
	 * @param date
	 * @param millisecond
	 * @return
	 */
	public static Date dateAddMillisecond(Date date, int millisecond){
		Calendar c = Calendar.getInstance();
		c.setTime(new Date());
		c.add(Calendar.MILLISECOND, millisecond);
		return c.getTime();
	}
	
	/**
	 * @param date1
	 * @param date2
	 * @return获取两个日期之间的天数（包括开始日期和结束日期）
	 */
	public static int getBetweenDays(String date1, String date2){
		long t1 = convertStringToDate(date1, date1.contains(" ")?"yyyy-MM-dd HH:mm":"yyyy-MM-dd").getTime();
		long t2 = convertStringToDate(date2, date2.contains(" ")?"yyyy-MM-dd HH:mm":"yyyy-MM-dd").getTime();
		return Integer.parseInt(String.valueOf((t2-t1)/1000/60/60/24))+1;
	}
	
	/**
	 * @param date1
	 * @param date2
	 * @return获取两个日期之间的小时数（包括开始日期和结束日期）
	 */
	public static int getBetweenHours(String date1, String date2){
		long t1 = convertStringToDate(date1, "yyyy-MM-dd HH:mm").getTime();
		long t2 = convertStringToDate(date2, "yyyy-MM-dd HH:mm").getTime();
		return Integer.parseInt(String.valueOf((t2-t1)/1000/60/60));
	}
	
	/**
	 * @param date1
	 * @param date2
	 * @return获取两个日期之间的天数（包括开始日期和结束日期）
	 */
	public static int getBetweenDays(Date date1, Date date2){
		long t1 = date1.getTime();
		long t2 = date2.getTime();
		return Integer.parseInt(String.valueOf((t2-t1)/1000/60/60/24))+1;
	}
	
	/**
	 * 转换日期格式
	 * @param date   原始日期字符串
	 * @param fromPattern  原格式
	 * @param toPattern   转换后的格式
	 * @return
	 */
	public static String convertDateString(String date, String fromPattern, String toPattern){
		SimpleDateFormat sdf1 = new SimpleDateFormat(fromPattern);
		SimpleDateFormat sdf2 = new SimpleDateFormat(toPattern);
		try {
			return sdf2.format(sdf1.parse(date));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void main(String args[]){
//		System.out.println(getCurrentDate());
//		System.out.println(getCurrentDateStr());
//		System.out.println(getCurrentDateStr("yyyy.MM.dd.HH.mm.ss"));
//		System.out.println(getCurrentTimeMillis());
//		System.out.println(getCurrentYear());
//		System.out.println(getCurrentMonth());
//		System.out.println(getCurrentDay());
//		System.out.println(convertStringToDate("201112011530", "yyyyMMddHHmm"));
//		System.out.println(getCurrentMonthDays());
//		System.out.println(getPreMonthDays());
//		System.out.println(getNextMonthDays());
//		System.out.println(getFirstDayOfCurrentMonth());
//		System.out.println(getLastDayOfCurrentMonth());
//		System.out.println(getFirstDayOfPreMonth());
//		System.out.println(getLastDayOfPreMonth());
//		System.out.println(getFirstDayOfNextMonth());
//		System.out.println(getLastDayOfNextMonth());
//		System.out.println(getYesterdayStr());
//		System.out.println(getTomorrowStr());
//		System.out.println(getBetweenDays("2011-12-06", "2011-12-08"));
	}
	
	
	/**
	 * 日期按月递增/递减
	 * 
	 * @param date
	 *            基础日期
	 * @param num
	 *            递增/递减比率：1，2，3……
	 * @return
	 */
	public static Date monthPlus(Date date, int num) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, num);

		Date plusAfterDate = calendar.getTime();

		return plusAfterDate;
	}

	/**
	 * 日期按天递增/递减
	 * 
	 * @param date
	 *            基础日期
	 * @param num
	 *            递增/递减比率：1，2，3……
	 * @return
	 */
	public static Date dayPlus(Date date, int num) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_YEAR, num);

		Date plusAfterDate = calendar.getTime();

		return plusAfterDate;
	}
	
	@SuppressWarnings("deprecation")
	public static double monthsBetween(Date startDate, Date endDate) {
		Double countMonthDiff = 0.0;
		int monthDiff = (12 * endDate.getYear() + endDate.getMonth())
				- (12 * startDate.getYear() + startDate.getMonth());
		Calendar staCalendar = Calendar.getInstance();
		staCalendar.setTime(startDate);
		int startMonthDay = staCalendar.get(Calendar.DAY_OF_MONTH);

		Calendar endCalendar = Calendar.getInstance();
		endCalendar.setTime(endDate);
		int endMonthDay = endCalendar.get(Calendar.DAY_OF_MONTH);
		if (startMonthDay > endMonthDay) {
			countMonthDiff = monthDiff - (startMonthDay - endMonthDay) / 30.0;
		} else if (startMonthDay == endMonthDay) {
			countMonthDiff = monthDiff / 1.0;
		} else {
			countMonthDiff = monthDiff + (endMonthDay - startMonthDay) / 30.0;
		}
		return countMonthDiff;
	}
	
	/**
	 * 四舍五入 保留两位小数
	 * 
	 * @param d
	 * @return
	 */
	public static double convert(double d) {
		long l1 = Math.round(d * 100); // 四舍五入
		double ret = l1 / 100.0;
		return ret;
	}
	
	/**
	 * 获取指定时间年份
	 * @param date
	 * @return
	 */
	public static Integer getFullYear(Date date){
		return date.getYear() + 1900;
	}

	/**
	 * 获取指定时间月份
	 * @param date
	 * @return
	 */
	public static Integer getMonth(Date date){
		return date.getMonth() + 1;
	}

	/**
	 * 获取指定日期所在月的天数
	 * @param date
	 * @return
	 */
	public static Integer getLastDays(Date date){
		Date dateTemp = new Date(date.getYear(), date.getMonth(), date.getDate());
		dateTemp.setMonth(dateTemp.getMonth() + 1);
		dateTemp.setDate(1);
		dateTemp.setDate(dateTemp.getDate() - 1);
		return dateTemp.getDate();
	}
	
	/**
	 * 获取指定日期上一个月的天数
	 * @param date
	 * @return
	 */
	public static Integer getlastmonthDays(Date date){
		Date dateTemp = new Date(date.getYear(), date.getMonth(), date.getDate());
		dateTemp.setDate(1);
		dateTemp.setDate(dateTemp.getDate() - 1);
		return dateTemp.getDate();
	}
	
	/**
	 * 获取精准月份数
	 * @param beginDate
	 * @param endDate
	 * @param type
	 * @return
	 */
	public static Double getDateLasts(Date beginDate, Date endDate){
		Integer months = 0;
		Integer days = 0;
		if(endDate.getDate() >= beginDate.getDate()){
			months = (getFullYear(endDate) - getFullYear(beginDate)) * 12
					+ endDate.getMonth() - beginDate.getMonth();
			days = endDate.getDate() - beginDate.getDate();
		}else{
			if(beginDate.getDate() == getLastDays(beginDate)){
				if(endDate.getDate() == getLastDays(endDate)){
					months = ((getFullYear(endDate) - getFullYear(beginDate))) * 12  
	                        + endDate.getMonth() - beginDate.getMonth();  
	                days = 0;
				}else{
					months = ((getFullYear(endDate) - getFullYear(beginDate))) * 12  
	                        + endDate.getMonth() - beginDate.getMonth() - 1;  
	                Integer lastmonthdays = getlastmonthDays(endDate);  
	                days = lastmonthdays - beginDate.getDate() + endDate.getDate();
				}
			}else{
				if (endDate.getDate() == getLastDays(endDate)) {  
	                months = ((getFullYear(endDate) - getFullYear(beginDate))) * 12  
	                        + endDate.getMonth() - beginDate.getMonth();  
	                days = 0;  
	            } else {  
	                months = ((getFullYear(endDate) - getFullYear(beginDate))) * 12  
	                        + endDate.getMonth() - beginDate.getMonth() - 1;  
	  
	                Integer lastmonthdays = getlastmonthDays(endDate);  
	                days = lastmonthdays - beginDate.getDate() + endDate.getDate();
	            }  
			}
		}
		return Double.parseDouble(BaseUtil.getDotTwoDigit(months+((days.doubleValue()+1)/30)));
	}
	
	/**
	 * 获取时间参数
	 * @param date
	 * @return
	 */
	public static Map<String, Object> getAddYearAndMonth(Date date){
		String pattern = "yyyy-MM-dd";
		Calendar c = Calendar.getInstance();  
		c.setTime(date);  
		Calendar lastDate = (Calendar) c.clone();  
		if(lastDate.get(Calendar.DATE) < 10){
			//如果在6号以内，则算作上个月的填报
			lastDate.add(Calendar.MONTH, -1);
		}
		Calendar lastDateTemp = (Calendar)lastDate.clone();
		lastDateTemp.add(Calendar.MONTH, 1);
        Integer addYearFst = lastDate.get(Calendar.YEAR);
        Integer addYearLst = lastDateTemp.get(Calendar.YEAR);
        Integer addMonthFst = lastDate.get(Calendar.MONTH) + 1;
        Integer addMonthLst = lastDateTemp.get(Calendar.MONTH) + 1;
        Integer first = lastDate.getActualMinimum(c.DAY_OF_MONTH) + 9;    //获取本月最小天数
        Integer last = lastDateTemp.getActualMinimum(c.DAY_OF_MONTH) + 8;    //获取本月最大天数
        Map<String, Object> resultMap = new HashMap<String, Object>();
        //记录生成时间
        resultMap.put("addYear", addYearFst);
        resultMap.put("addMonth", addMonthFst);
        //本期的月和日
        String monthStrFst = addMonthFst.toString().length() == 1?"0"+addMonthFst:addMonthFst+"";
        String monthStrLst = addMonthLst.toString().length() == 1?"0"+addMonthLst:addMonthLst+"";
        String firstStr = first.toString().length() == 1?"0"+first:first+"";
        String lastStr = last.toString().length() == 1?"0"+last:last+"";
        //本期时间
        resultMap.put("thisTimeMonthBeginDate", DateUtil.convertStringToDate(addYearFst+"-"+monthStrFst+"-"+firstStr, pattern));
        resultMap.put("thisTimeMonthEndDate", DateUtil.convertStringToDate(addYearLst+"-"+monthStrLst+"-"+lastStr, pattern));
        //上年同期时间
        resultMap.put("lastYearMonthBeginDate", DateUtil.convertStringToDate((addYearFst-1)+"-"+monthStrFst+"-"+firstStr, pattern));
        resultMap.put("lastYearMonthEndDate", DateUtil.convertStringToDate((addYearLst-1)+"-"+monthStrLst+"-"+lastStr, pattern));
        //上期时间
        lastDate.add(Calendar.MONTH, -1);
        Calendar lastLastDate = (Calendar)lastDate.clone();
        Integer lastAddYearFst = lastLastDate.get(Calendar.YEAR);
        Integer lastAddMonthFst = lastLastDate.get(Calendar.MONTH) + 1;
        Integer lastFirst = lastLastDate.getActualMinimum(c.DAY_OF_MONTH) + 9;    //获取本月最小天数
        //本期的月和日
        String lastMonthStrFst = lastAddMonthFst.toString().length() == 1?"0"+lastAddMonthFst:lastAddMonthFst+"";
        String lastFirstStr = lastFirst.toString().length() == 1?"0"+lastFirst:lastFirst+"";
        resultMap.put("lastTimeMonthBeginDate", DateUtil.convertStringToDate(lastAddYearFst+"-"+lastMonthStrFst+"-"+lastFirstStr, pattern));
        resultMap.put("lastTimeMonthEndDate", DateUtil.convertStringToDate(addYearFst+"-"+monthStrFst+"-"+firstStr, pattern));
        
        //全年本期时间
        resultMap.put("thisTimeYearBeginDate", DateUtil.convertStringToDate(addYearFst+"-01-10", pattern));
        resultMap.put("thisTimeYearEndDate", DateUtil.convertStringToDate((addYearFst+1)+"-01-10", pattern));
        //全年上年同期时间
        resultMap.put("lastTimeYearBeginDate", DateUtil.convertStringToDate((addYearFst-1)+"-01-10", pattern));
        resultMap.put("lastTimeYearEndDate", DateUtil.convertStringToDate(addYearFst+"-01-10", pattern));
        return resultMap;
	}
	
	/**
	 * 判断是否处于时间段之内
	 * @param timePeriod 	yyyy-MM-dd,yyyy-MM-dd 格式
	 * @param date
	 * @return
	 */
	public static boolean isDateInPeriodTime(String timePeriod, Date date){
		String pattern = "yyyy-MM-dd";
		String beginTimeStr = timePeriod.split(",")[0];
		String endTimeStr = timePeriod.split(",")[1];
		Date begimTime = convertStringToDate(beginTimeStr, pattern);
		Date endTime = convertStringToDate(endTimeStr, pattern);
		return date.getTime() >= begimTime.getTime() && date.getTime() <= endTime.getTime();
	}
	
}
