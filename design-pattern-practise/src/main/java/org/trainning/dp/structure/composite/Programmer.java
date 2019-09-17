package org.trainning.dp.structure.composite;

import java.util.List;

/**
 * leaf
 * @author pactera
 *
 */
public class Programmer extends Employer {
	
    public Programmer(String name) {
    	this.setName(name);
    }

	@Override
	public void addEmployer(Employer employer) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteEmployer(String idCard) {
		// TODO Auto-generated method stub

	}

	@Override
	public Employer queryEmpoyer(String idCard) {
		
		return null;
	}

	@Override
	public List<Employer> getEmployers() {
		// TODO Auto-generated method stub
		return null;
	}

}
