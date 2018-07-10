package com.gupaoedu.vip.delegate;

/**
 * 委派模式：（注意和代理模式区分）
 * 1、类似于中介的功能（委托机制）
 * 2、持有被委托人的引用
 * 3、不关心过程，只关心结果（代理模式关心过程）
 * IOC容器中，有一个Register容器，功能为：
 * 在某个类被初始化的过程中，需要做很多不同的逻辑处理，需要实现多个任务执行者，分别实现各自功能。
 * @author Administrator
 *
 */
public class DispatcherTest {

	
	public static void main(String[] args) {
		Dispatcher dispatcher = new Dispatcher(new ExectorA());
//		Dispatcher dispatcher = new Dispatcher(new ExectorB());
		//看上去好像是我们的项目经理在干活
		//但实际干活的人是普通员工
		//这就是典型，干活是我的，功劳是你的
		dispatcher.doing();
	}
	
}
