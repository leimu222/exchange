package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.VoteMapper;
import com.common.api.model.Vote;
import com.common.api.service.IVoteService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:09
 * Description: [voteBiz服务实现]
 */
@Service
public class VoteBizServiceImpl extends CommonService implements IVoteBizService {
	@Autowired
	private IVoteService voteService;

	/**
	* 查询vote
	*
	* @param id voteID
	* @return vote
	*/
	@Override
	public Vote selectVoteById(Long id) {
		return voteService.selectVoteById(id);
	}

	/**
	* 查询vote列表
	*
	* @param vote vote
	* @return vote
	*/
	@Override
	public List<Vote> selectVoteList(Vote vote) {
		return voteService.selectVoteList(vote);
	}

	/**
	* 新增vote
	*
	* @param vote vote
	* @return 结果
	*/
	@Override
	public int insertVote(Vote vote) {
		return voteService.insertVote(vote);
	}

	/**
	* 修改vote
	*
	* @param vote vote
	* @return 结果
	*/
	@Override
	public int updateVote(Vote vote) {
		return voteService.updateVote(vote);
	}

	/**
	* 批量删除vote
	*
	* @param ids 需要删除的voteID
	* @return 结果
	*/
	@Override
	public int deleteVoteByIds(Long[] ids) {
		return voteService.deleteVoteByIds(ids);
	}

	/**
	* 删除vote信息
	*
	* @param id voteID
	* @return 结果
	*/
	@Override
	public int deleteVoteById(Long id) {
		return voteService.deleteVoteById(id);
	}

}
