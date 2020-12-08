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
 * @date 2020-12-08 18:16:01
 * Description: [chain单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ChainLastBlockServiceImplTest  {

	@Autowired
	private IChainLastBlockService chainLastBlockService;

	/**
	* 查询chain
	*/
	@Test
	public void selectChainLastBlockById() {
		ChainLastBlock chainLastBlock = chainLastBlockService.selectChainLastBlockById(1);
		System.out.println(chainLastBlock.toString());
	}

	/**
	* 查询chain列表
	*/
	@Test
	public void selectChainLastBlockList() {
		List<ChainLastBlock> list = chainLastBlockService.selectChainLastBlockList(new ChainLastBlock());
		for(ChainLastBlock model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增chain
	*/
	@Test
	public void insertChainLastBlock() {
		for (int i = 1;i < 30; i++) {
			ChainLastBlock chainLastBlock = new ChainLastBlock();
			chainLastBlockService.insertChainLastBlock(chainLastBlock);
		}
	}

	/**
	* 修改chain
	*/
	@Test
	public void updateChainLastBlock() {
		ChainLastBlock chainLastBlock = new ChainLastBlock();
		chainLastBlockService.updateChainLastBlock(chainLastBlock);
	}

	/**
	* 批量删除chain
	*/
	@Test
	public void deleteChainLastBlockByIds() {
	}

	/**
	* 删除chain信息
	*/
	@Test
	public void deleteChainLastBlockById() {
	}

}
