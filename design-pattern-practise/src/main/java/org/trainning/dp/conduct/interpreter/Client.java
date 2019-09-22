package org.trainning.dp.conduct.interpreter;

public class Client {

	public static void main(String[] args) {
		Context ct = new Context();
		ct.setContext("a+b=?");
		ct.add(new AdvanceExpress());
		ct.add(new TerminalExpress());
		ct.add(new NonTerminalExpress());
		/**
		 * 執行解釋器
		 */
		for(AbstractExpression express : ct.getExpressList()) {
			express.interpret(ct);
		}
		

	}

}
