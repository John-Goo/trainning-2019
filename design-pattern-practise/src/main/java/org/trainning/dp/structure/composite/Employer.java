package org.trainning.dp.structure.composite;

import java.util.List;

/**
 * Component
 * 
 * @author pactera
 *
 */
public abstract class Employer {
	
	private String name;
	private String idCard;
	private Integer age;
	
	
	/**
	 * 添加员工
	 * @param employer
	 */
	public abstract void addEmployer(Employer employer);
	
	/**
	 * 删除员工
	 * @param idCard
	 */
	public abstract void deleteEmployer(String idCard);
	
	/**
	 * 查询员工
	 * @param idCard
	 * @return
	 */
	public abstract Employer queryEmpoyer(String idCard);
	
	/**
	 * 获得员工list
	 * @return
	 */
	public abstract List<Employer> getEmployers();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	
	
	
	

}
