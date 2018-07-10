package com.gupaoedu.vip.proxy.cglib;

/**
 * // 动态代理特点：
	//回顾一下，满足代理模式应用场景的三个必要条件，穷取法
	//1、两个角色：执行者、被代理对象
	//2、注重过程，必须要做，被代理对象没时间做或者不想做（怕羞羞），不专业
	//3、执行者必须拿到被代理对象的个人资料（执行者持有被代理对象的引用）
 * @author Administrator
 *
 */
public class TestGglibProxy {
	
	public static void main(String[] args) {
		
		//JDK的动态代理是通过接口来进行强制转换的
		//生成以后的代理对象，可以强制转换为接口
		
		
		//CGLib的动态代理是通过生成一个被代理对象的子类，然后重写父类的方法
		//生成以后的对象，可以强制转换为被代理对象（也就是用自己写的类）
		//子类引用赋值给父类
		
		
		try {
			YunZhongYu obj = (YunZhongYu)new GPMeipo().getInstance(YunZhongYu.class);
			obj.findLove();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
