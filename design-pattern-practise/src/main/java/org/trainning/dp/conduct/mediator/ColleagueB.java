package org.trainning.dp.conduct.mediator;

public class ColleagueB extends AbstractColleague {

	@Override
	public void setNumber(int number, AbstractMediator mediator) {
		this.number = number;
		mediator.BaffectA();
	}

}
