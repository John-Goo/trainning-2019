package org.trainning.dp.structure.composite;

import java.util.List;

public class Assistant extends Employer {
	

	public Assistant(String name) {
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employer> getEmployers() {
		// TODO Auto-generated method stub
		return null;
	}

}
