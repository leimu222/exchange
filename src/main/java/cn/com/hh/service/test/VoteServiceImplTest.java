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
public class VoteServiceImplTest  {

	@Autowired
	private IVoteService voteService;

	/**
	* 查询vote
	*/
	@Test
	public void selectVoteById() {
		Vote vote = voteService.selectVoteById(1);
		System.out.println(vote.toString());
	}

	/**
	* 查询vote列表
	*/
	@Test
	public void selectVoteList() {
		List<Vote> list = voteService.selectVoteList(new Vote());
		for(Vote model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增vote
	*/
	@Test
	public void insertVote() {
		for (int i = 1;i < 30; i++) {
			Vote vote = new Vote();
			voteService.insertVote(vote);
		}
	}

	/**
	* 修改vote
	*/
	@Test
	public void updateVote() {
		Vote vote = new Vote();
		voteService.updateVote(vote);
	}

	/**
	* 批量删除vote
	*/
	@Test
	public void deleteVoteByIds() {
	}

	/**
	* 删除vote信息
	*/
	@Test
	public void deleteVoteById() {
	}

}
