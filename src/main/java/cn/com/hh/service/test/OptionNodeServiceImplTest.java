package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:07
 * Description: [option单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OptionNodeServiceImplTest  {

	@Autowired
	private IOptionNodeService optionNodeService;

	/**
	* 查询option
	*/
	@Test
	public void selectOptionNodeById() {
		OptionNode optionNode = optionNodeService.selectOptionNodeById(1);
		System.out.println(optionNode.toString());
	}

	/**
	* 查询option列表
	*/
	@Test
	public void selectOptionNodeList() {
		List<OptionNode> list = optionNodeService.selectOptionNodeList(new OptionNode());
		for(OptionNode model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增option
	*/
	@Test
	public void insertOptionNode() {
		for (int i = 1;i < 30; i++) {
			OptionNode optionNode = new OptionNode();
			optionNodeService.insertOptionNode(optionNode);
		}
	}

	/**
	* 修改option
	*/
	@Test
	public void updateOptionNode() {
		OptionNode optionNode = new OptionNode();
		optionNodeService.updateOptionNode(optionNode);
	}

	/**
	* 批量删除option
	*/
	@Test
	public void deleteOptionNodeByIds() {
	}

	/**
	* 删除option信息
	*/
	@Test
	public void deleteOptionNodeById() {
	}

}
