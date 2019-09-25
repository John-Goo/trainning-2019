package org.trainning.dp.conduct.interpreter;

public class AdvanceExpress extends AbstractExpression {

	@Override
	public void interpret(Context context) {
		System.out.println("#解釋器: AdvanceExpress-->"+context.getContext());
	}

}
