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
 * @date 2020-12-08 18:16:09
 * Description: [unblock单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UnblockLotteryDrawServiceImplTest  {

	@Autowired
	private IUnblockLotteryDrawService unblockLotteryDrawService;

	/**
	* 查询unblock
	*/
	@Test
	public void selectUnblockLotteryDrawById() {
		UnblockLotteryDraw unblockLotteryDraw = unblockLotteryDrawService.selectUnblockLotteryDrawById(1);
		System.out.println(unblockLotteryDraw.toString());
	}

	/**
	* 查询unblock列表
	*/
	@Test
	public void selectUnblockLotteryDrawList() {
		List<UnblockLotteryDraw> list = unblockLotteryDrawService.selectUnblockLotteryDrawList(new UnblockLotteryDraw());
		for(UnblockLotteryDraw model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增unblock
	*/
	@Test
	public void insertUnblockLotteryDraw() {
		for (int i = 1;i < 30; i++) {
			UnblockLotteryDraw unblockLotteryDraw = new UnblockLotteryDraw();
			unblockLotteryDrawService.insertUnblockLotteryDraw(unblockLotteryDraw);
		}
	}

	/**
	* 修改unblock
	*/
	@Test
	public void updateUnblockLotteryDraw() {
		UnblockLotteryDraw unblockLotteryDraw = new UnblockLotteryDraw();
		unblockLotteryDrawService.updateUnblockLotteryDraw(unblockLotteryDraw);
	}

	/**
	* 批量删除unblock
	*/
	@Test
	public void deleteUnblockLotteryDrawByIds() {
	}

	/**
	* 删除unblock信息
	*/
	@Test
	public void deleteUnblockLotteryDrawById() {
	}

}
