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
 * @date 2020-12-08 18:16:06
 * Description: [option单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OptionCoinNodeServiceImplTest  {

	@Autowired
	private IOptionCoinNodeService optionCoinNodeService;

	/**
	* 查询option
	*/
	@Test
	public void selectOptionCoinNodeById() {
		OptionCoinNode optionCoinNode = optionCoinNodeService.selectOptionCoinNodeById(1);
		System.out.println(optionCoinNode.toString());
	}

	/**
	* 查询option列表
	*/
	@Test
	public void selectOptionCoinNodeList() {
		List<OptionCoinNode> list = optionCoinNodeService.selectOptionCoinNodeList(new OptionCoinNode());
		for(OptionCoinNode model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增option
	*/
	@Test
	public void insertOptionCoinNode() {
		for (int i = 1;i < 30; i++) {
			OptionCoinNode optionCoinNode = new OptionCoinNode();
			optionCoinNodeService.insertOptionCoinNode(optionCoinNode);
		}
	}

	/**
	* 修改option
	*/
	@Test
	public void updateOptionCoinNode() {
		OptionCoinNode optionCoinNode = new OptionCoinNode();
		optionCoinNodeService.updateOptionCoinNode(optionCoinNode);
	}

	/**
	* 批量删除option
	*/
	@Test
	public void deleteOptionCoinNodeByIds() {
	}

	/**
	* 删除option信息
	*/
	@Test
	public void deleteOptionCoinNodeById() {
	}

}
