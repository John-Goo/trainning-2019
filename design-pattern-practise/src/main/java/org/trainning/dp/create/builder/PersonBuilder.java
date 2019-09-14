package org.trainning.dp.create.builder;

/**
 * 定义一个抽象接口
 * @author pactera
 *
 */
public interface PersonBuilder {
	void buildBody();
	void buildHead();
	void buildFoot();
	Person buildPerson();

}
