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
public class OptionMemberServiceImplTest  {

	@Autowired
	private IOptionMemberService optionMemberService;

	/**
	* 查询option
	*/
	@Test
	public void selectOptionMemberById() {
		OptionMember optionMember = optionMemberService.selectOptionMemberById(1);
		System.out.println(optionMember.toString());
	}

	/**
	* 查询option列表
	*/
	@Test
	public void selectOptionMemberList() {
		List<OptionMember> list = optionMemberService.selectOptionMemberList(new OptionMember());
		for(OptionMember model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增option
	*/
	@Test
	public void insertOptionMember() {
		for (int i = 1;i < 30; i++) {
			OptionMember optionMember = new OptionMember();
			optionMemberService.insertOptionMember(optionMember);
		}
	}

	/**
	* 修改option
	*/
	@Test
	public void updateOptionMember() {
		OptionMember optionMember = new OptionMember();
		optionMemberService.updateOptionMember(optionMember);
	}

	/**
	* 批量删除option
	*/
	@Test
	public void deleteOptionMemberByIds() {
	}

	/**
	* 删除option信息
	*/
	@Test
	public void deleteOptionMemberById() {
	}

}
