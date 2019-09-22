package org.trainning.dp.conduct.interpreter;

public class NonTerminalExpress extends AbstractExpression {

	@Override
	public void interpret(Context context) {
		System.out.println("#解釋器: NonTerminalExpress-->"+context.getContext());
	}

}
