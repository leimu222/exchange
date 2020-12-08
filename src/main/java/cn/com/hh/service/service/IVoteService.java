package com.common.api.service;

import java.util.List;

import com.common.api.model.vote;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:09
 * Description: [vote服务]
 */
public interface IVoteService {

	/**
	* 查询vote
	*
	* @param id voteID
	* @return vote
	*/
	public Vote selectVoteById(Long id);

	/**
	* 查询vote列表
	*
	* @param vote vote
	* @return vote集合
	*/
	public List<Vote> selectVoteList(Vote vote);

	/**
	* 新增vote
	*
	* @param vote vote
	* @return 结果
	*/
	public int insertVote(Vote vote);

	/**
	* 修改vote
	*
	* @param vote vote
	* @return 结果
	*/
	public int updateVote(Vote vote);

	/**
	* 批量删除vote
	*
	* @param ids 需要删除的voteID
	* @return 结果
	*/
	public int deleteVoteByIds(Long[] ids);

	/**
	* 删除vote信息
	*
	* @param id voteID
	* @return 结果
	*/
	public int deleteVoteById(Long id);
	
}
