package org.trainning.dp.structure.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite
 * 
 * @author pactera
 *
 */
public class ProjectManager extends Employer {
	
	
	private List<Employer> employerList = new ArrayList<Employer>();

	public ProjectManager(String name) {
		this.setName(name);
	}
	
	@Override
	public void addEmployer(Employer employer) {
		employerList.add(employer);

	}

	@Override
	public void deleteEmployer(String idCard) {
		employerList.forEach(employer->{
			String idCard1 = employer.getIdCard();
			if(idCard1==null) {
				return;
			}
			if(idCard.equals(idCard)) {
				System.out.println("删除用户----->"+employer.getName());
			}
			
		});

	}

	@Override
	public Employer queryEmpoyer(String idCard) {
		return null;
	}
	
	public List<Employer> getEmployers(){
		return employerList;
	}
	
	public static void main(String[] args) {
		ProjectManager pm = new ProjectManager("John");
		pm.addEmployer(new Assistant("9000000000XF"));
		pm.deleteEmployer("");
	}

}
