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
 * Description: [member单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MemberPromotionServiceImplTest  {

	@Autowired
	private IMemberPromotionService memberPromotionService;

	/**
	* 查询member
	*/
	@Test
	public void selectMemberPromotionById() {
		MemberPromotion memberPromotion = memberPromotionService.selectMemberPromotionById(1);
		System.out.println(memberPromotion.toString());
	}

	/**
	* 查询member列表
	*/
	@Test
	public void selectMemberPromotionList() {
		List<MemberPromotion> list = memberPromotionService.selectMemberPromotionList(new MemberPromotion());
		for(MemberPromotion model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增member
	*/
	@Test
	public void insertMemberPromotion() {
		for (int i = 1;i < 30; i++) {
			MemberPromotion memberPromotion = new MemberPromotion();
			memberPromotionService.insertMemberPromotion(memberPromotion);
		}
	}

	/**
	* 修改member
	*/
	@Test
	public void updateMemberPromotion() {
		MemberPromotion memberPromotion = new MemberPromotion();
		memberPromotionService.updateMemberPromotion(memberPromotion);
	}

	/**
	* 批量删除member
	*/
	@Test
	public void deleteMemberPromotionByIds() {
	}

	/**
	* 删除member信息
	*/
	@Test
	public void deleteMemberPromotionById() {
	}

}
