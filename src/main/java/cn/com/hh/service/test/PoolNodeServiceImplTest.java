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
 * @date 2020-12-08 18:16:08
 * Description: [pool单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PoolNodeServiceImplTest  {

	@Autowired
	private IPoolNodeService poolNodeService;

	/**
	* 查询pool
	*/
	@Test
	public void selectPoolNodeById() {
		PoolNode poolNode = poolNodeService.selectPoolNodeById(1);
		System.out.println(poolNode.toString());
	}

	/**
	* 查询pool列表
	*/
	@Test
	public void selectPoolNodeList() {
		List<PoolNode> list = poolNodeService.selectPoolNodeList(new PoolNode());
		for(PoolNode model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增pool
	*/
	@Test
	public void insertPoolNode() {
		for (int i = 1;i < 30; i++) {
			PoolNode poolNode = new PoolNode();
			poolNodeService.insertPoolNode(poolNode);
		}
	}

	/**
	* 修改pool
	*/
	@Test
	public void updatePoolNode() {
		PoolNode poolNode = new PoolNode();
		poolNodeService.updatePoolNode(poolNode);
	}

	/**
	* 批量删除pool
	*/
	@Test
	public void deletePoolNodeByIds() {
	}

	/**
	* 删除pool信息
	*/
	@Test
	public void deletePoolNodeById() {
	}

}
