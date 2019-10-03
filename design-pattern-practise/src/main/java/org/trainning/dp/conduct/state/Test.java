package org.trainning.dp.conduct.state;

public class Test {

	public static void main(String[] args) {
		State stateA = new ConcreteStateA();
		Context ct1 =  new Context();
		System.out.println("---设置状态A");
		ct1.setStata(stateA);
		State stateB = new ConcreteStateB();
		System.out.println("---设置状态B");
		ct1.setStata(stateB);
	
		System.out.println(ct1.getState());
		
	}

}
