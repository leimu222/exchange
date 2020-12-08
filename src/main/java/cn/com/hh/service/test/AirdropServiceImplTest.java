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
 * Description: [airdrop单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AirdropServiceImplTest  {

	@Autowired
	private IAirdropService airdropService;

	/**
	* 查询airdrop
	*/
	@Test
	public void selectAirdropById() {
		Airdrop airdrop = airdropService.selectAirdropById(1);
		System.out.println(airdrop.toString());
	}

	/**
	* 查询airdrop列表
	*/
	@Test
	public void selectAirdropList() {
		List<Airdrop> list = airdropService.selectAirdropList(new Airdrop());
		for(Airdrop model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增airdrop
	*/
	@Test
	public void insertAirdrop() {
		for (int i = 1;i < 30; i++) {
			Airdrop airdrop = new Airdrop();
			airdropService.insertAirdrop(airdrop);
		}
	}

	/**
	* 修改airdrop
	*/
	@Test
	public void updateAirdrop() {
		Airdrop airdrop = new Airdrop();
		airdropService.updateAirdrop(airdrop);
	}

	/**
	* 批量删除airdrop
	*/
	@Test
	public void deleteAirdropByIds() {
	}

	/**
	* 删除airdrop信息
	*/
	@Test
	public void deleteAirdropById() {
	}

}
