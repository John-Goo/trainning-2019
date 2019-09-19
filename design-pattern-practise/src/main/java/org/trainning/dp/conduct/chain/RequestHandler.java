package org.trainning.dp.conduct.chain;

import org.omg.CORBA.Request;

/**
 * chain of responsibility
 * @author pactera
 *
 */
public interface RequestHandler {
	
	public void execute(Request request);

}
