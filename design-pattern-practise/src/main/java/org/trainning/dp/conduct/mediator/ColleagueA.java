package org.trainning.dp.conduct.mediator;

public class ColleagueA extends AbstractColleague {

	@Override
	public void setNumber(int number, AbstractMediator mediator) {
		this.number = number;
		mediator.AaffectB();
	}
	
	
}
