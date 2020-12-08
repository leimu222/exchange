package com.common.api.service;

import java.util.List;

import com.common.api.model.voteDetail;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:09
 * Description: [vote服务]
 */
public interface IVoteDetailService {

	/**
	* 查询vote
	*
	* @param id voteID
	* @return vote
	*/
	public VoteDetail selectVoteDetailById(Long id);

	/**
	* 查询vote列表
	*
	* @param voteDetail vote
	* @return vote集合
	*/
	public List<VoteDetail> selectVoteDetailList(VoteDetail voteDetail);

	/**
	* 新增vote
	*
	* @param voteDetail vote
	* @return 结果
	*/
	public int insertVoteDetail(VoteDetail voteDetail);

	/**
	* 修改vote
	*
	* @param voteDetail vote
	* @return 结果
	*/
	public int updateVoteDetail(VoteDetail voteDetail);

	/**
	* 批量删除vote
	*
	* @param ids 需要删除的voteID
	* @return 结果
	*/
	public int deleteVoteDetailByIds(Long[] ids);

	/**
	* 删除vote信息
	*
	* @param id voteID
	* @return 结果
	*/
	public int deleteVoteDetailById(Long id);
	
}
