package org.trainning.dp.conduct.mediator;

public class Test {

	public static void main(String[] args) {
		AbstractColleague collA = new ColleagueA();
		AbstractColleague collB = new ColleagueB();
		
		AbstractMediator am = new ConcreteMediator(collA,collB);
		
		// 设置 A 影响B
		collA.setNumber(100, am);
		System.out.println("  ==设置 A 影响B[A--->B] : A.number="+collA.getNumber()+",B.number="+collB.getNumber());
		
		// 设置 B 影响A
		collB.setNumber(1000, am);
		System.out.println(" ==设置 B 影响A[B--->A] : A.number="+collA.getNumber()+",B.number="+collB.getNumber());
		
		
		
		
	}

}
