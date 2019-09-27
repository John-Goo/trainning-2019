package org.trainning.dp.conduct.mediator;

public class ConcreteMediator extends AbstractMediator {

	public ConcreteMediator(AbstractColleague colleagueA, AbstractColleague colleagueB) {
		super(colleagueA, colleagueB);
	}

	@Override
	public void AaffectB() {
		int number = A.getNumber();
		B.setNumber(number*100);
		
	}

	@Override
	public void BaffectA() {
		int number = B.getNumber();
		A.setNumber(number/100);
	}

}
