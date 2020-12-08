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
public class OptionMemberProfitLossServiceImplTest  {

	@Autowired
	private IOptionMemberProfitLossService optionMemberProfitLossService;

	/**
	* 查询option
	*/
	@Test
	public void selectOptionMemberProfitLossById() {
		OptionMemberProfitLoss optionMemberProfitLoss = optionMemberProfitLossService.selectOptionMemberProfitLossById(1);
		System.out.println(optionMemberProfitLoss.toString());
	}

	/**
	* 查询option列表
	*/
	@Test
	public void selectOptionMemberProfitLossList() {
		List<OptionMemberProfitLoss> list = optionMemberProfitLossService.selectOptionMemberProfitLossList(new OptionMemberProfitLoss());
		for(OptionMemberProfitLoss model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增option
	*/
	@Test
	public void insertOptionMemberProfitLoss() {
		for (int i = 1;i < 30; i++) {
			OptionMemberProfitLoss optionMemberProfitLoss = new OptionMemberProfitLoss();
			optionMemberProfitLossService.insertOptionMemberProfitLoss(optionMemberProfitLoss);
		}
	}

	/**
	* 修改option
	*/
	@Test
	public void updateOptionMemberProfitLoss() {
		OptionMemberProfitLoss optionMemberProfitLoss = new OptionMemberProfitLoss();
		optionMemberProfitLossService.updateOptionMemberProfitLoss(optionMemberProfitLoss);
	}

	/**
	* 批量删除option
	*/
	@Test
	public void deleteOptionMemberProfitLossByIds() {
	}

	/**
	* 删除option信息
	*/
	@Test
	public void deleteOptionMemberProfitLossById() {
	}

}
