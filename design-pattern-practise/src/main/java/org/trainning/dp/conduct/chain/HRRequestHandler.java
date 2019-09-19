package org.trainning.dp.conduct.chain;

import org.omg.CORBA.Request;

public class HRRequestHandler implements RequestHandler {
	

	




	@Override
	public void execute(Request request) {
		System.out.println("-->我的角色是HR，如果审批通过，则终止；如果审批未通过，则退回");

	}

}
