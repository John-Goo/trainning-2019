package org.trainning.dp.conduct.chain;

import org.omg.CORBA.Request;

public class PMRequestHandler implements RequestHandler {
	
	
	RequestHandler requHandler;
	
	

	public PMRequestHandler(RequestHandler requHandler) {
		super();
		this.requHandler = requHandler;
	}



	@Override
	public void execute(Request request) {
		System.out.println("-->我的角色是PM，已经审批过，再转给BOSS");
		requHandler.execute(request);

	}

}
