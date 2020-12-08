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
 * Description: [blockchain单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BlockchainHeightServiceImplTest  {

	@Autowired
	private IBlockchainHeightService blockchainHeightService;

	/**
	* 查询blockchain
	*/
	@Test
	public void selectBlockchainHeightById() {
		BlockchainHeight blockchainHeight = blockchainHeightService.selectBlockchainHeightById(1);
		System.out.println(blockchainHeight.toString());
	}

	/**
	* 查询blockchain列表
	*/
	@Test
	public void selectBlockchainHeightList() {
		List<BlockchainHeight> list = blockchainHeightService.selectBlockchainHeightList(new BlockchainHeight());
		for(BlockchainHeight model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增blockchain
	*/
	@Test
	public void insertBlockchainHeight() {
		for (int i = 1;i < 30; i++) {
			BlockchainHeight blockchainHeight = new BlockchainHeight();
			blockchainHeightService.insertBlockchainHeight(blockchainHeight);
		}
	}

	/**
	* 修改blockchain
	*/
	@Test
	public void updateBlockchainHeight() {
		BlockchainHeight blockchainHeight = new BlockchainHeight();
		blockchainHeightService.updateBlockchainHeight(blockchainHeight);
	}

	/**
	* 批量删除blockchain
	*/
	@Test
	public void deleteBlockchainHeightByIds() {
	}

	/**
	* 删除blockchain信息
	*/
	@Test
	public void deleteBlockchainHeightById() {
	}

}
