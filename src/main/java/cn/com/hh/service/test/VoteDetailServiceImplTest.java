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
 * Description: [vote单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class VoteDetailServiceImplTest  {

	@Autowired
	private IVoteDetailService voteDetailService;

	/**
	* 查询vote
	*/
	@Test
	public void selectVoteDetailById() {
		VoteDetail voteDetail = voteDetailService.selectVoteDetailById(1);
		System.out.println(voteDetail.toString());
	}

	/**
	* 查询vote列表
	*/
	@Test
	public void selectVoteDetailList() {
		List<VoteDetail> list = voteDetailService.selectVoteDetailList(new VoteDetail());
		for(VoteDetail model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增vote
	*/
	@Test
	public void insertVoteDetail() {
		for (int i = 1;i < 30; i++) {
			VoteDetail voteDetail = new VoteDetail();
			voteDetailService.insertVoteDetail(voteDetail);
		}
	}

	/**
	* 修改vote
	*/
	@Test
	public void updateVoteDetail() {
		VoteDetail voteDetail = new VoteDetail();
		voteDetailService.updateVoteDetail(voteDetail);
	}

	/**
	* 批量删除vote
	*/
	@Test
	public void deleteVoteDetailByIds() {
	}

	/**
	* 删除vote信息
	*/
	@Test
	public void deleteVoteDetailById() {
	}

}
