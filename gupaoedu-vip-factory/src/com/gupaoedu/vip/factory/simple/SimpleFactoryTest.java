package com.gupaoedu.vip.factory.simple;

import com.gupaoedu.vip.factory.Car;

public class SimpleFactoryTest {
	
	// 简单工厂模式
	// 1、消费者调用简单；
	// 2、但是生产者耦合度极高，不同类型的工厂放在一个类中处理，不利于各自的维护和拓展。
	public static void main(String[] args) {
	
		//这边就是我们的消费者
		Car car = new SimpleFactory().getCar("Audi");
		System.out.println(car.getName());
		
	}
	
}
