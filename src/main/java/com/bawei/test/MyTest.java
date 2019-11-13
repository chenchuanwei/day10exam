package com.bawei.test;

import java.util.Date;

import org.junit.Test;

import com.bawei.util.DateUtil;


/**
 * @author ccw
 *
 * 2019年11月13日
 */
public class MyTest {

	//求年龄
	@Test
	public void CaseAge(){
		
		int age = DateUtil.getAge("2001-02-16");
		System.out.println(age);
	}
	
	//按月份初始化为第一天
	@Test
	public void CaseMonthFirst(){
		
		String monthBegin = DateUtil.getMonthBegin("2001-02-16 19:29:33");
		System.out.println(monthBegin);
	}
	
	//按月份初始化为最后一天
	@Test
	public void CaseMonthLast(){
		
		String monthLastBegin = DateUtil.getMonthLastBegin("2001-02-16 19:29:33");
		System.out.println(monthLastBegin);
	}
	
	//求未来日期离今天还剩的天数
	@Test
	public void CaseFutrues(){
		
		int futureDays = DateUtil.getFutureDays("2020-06-05");
		
		System.out.println(futureDays);
	}
	
	//求过去日期离今天过去的天数
	@Test
	public void CaseFutrue(){
		
		int futureDay = DateUtil.getFutureDay("2001-02-16");
		
		System.out.println(futureDay);
	}
}
