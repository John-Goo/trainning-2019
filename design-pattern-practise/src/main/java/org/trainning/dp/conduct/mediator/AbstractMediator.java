package org.trainning.dp.conduct.mediator;

public abstract class AbstractMediator {
	
	protected AbstractColleague A;
	protected AbstractColleague B;
	
	
	
	public AbstractMediator(AbstractColleague colleagueA, AbstractColleague colleagueB) {
		super();
		this.A = colleagueA;
		this.B = colleagueB;
	}
	public abstract void AaffectB();
	public abstract void BaffectA();

}
