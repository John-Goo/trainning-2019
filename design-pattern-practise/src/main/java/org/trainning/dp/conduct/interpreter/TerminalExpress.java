package org.trainning.dp.conduct.interpreter;

public class TerminalExpress extends AbstractExpression {

	@Override
	public void interpret(Context context) {
		System.out.println("#解釋器: TerminalExpress-->"+context.getContext());
	}

}
