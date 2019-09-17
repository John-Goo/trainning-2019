package org.trainning.dp.structure.composite;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		Employer pm = new ProjectManager("项目经理");
		Employer pa = new Assistant("项目助理");
		Employer programmer1 = new Programmer("程序员一");
		Employer programmer2 = new Programmer("程序员二");
		pm.addEmployer(pa);//为项目经理添加项目助理
		pm.addEmployer(programmer2);//*项目经理*加程序员
		pm.addEmployer(programmer1);
		List<Employer> ems = pm.getEmployers();
		
		ems.forEach(employer->{
			System.out.println(employer.getName());
		});
		
	}

}
