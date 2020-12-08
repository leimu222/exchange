package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.VoteDetailMapper;
import com.common.api.model.VoteDetail;
import com.common.api.service.IVoteDetailService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:09
 * Description: [vote服务实现]
 */
@Service
public class VoteDetailServiceImpl implements IVoteDetailService {
	@Autowired
	private VoteDetailMapper voteDetailMapper;

	/**
	* 查询vote
	*
	* @param id voteID
	* @return vote
	*/
	@Override
	public VoteDetail selectVoteDetailById(Long id) {
		return voteDetailMapper.selectVoteDetailById(id);
	}

	/**
	* 查询vote列表
	*
	* @param voteDetail vote
	* @return vote
	*/
	@Override
	public List<VoteDetail> selectVoteDetailList(VoteDetail voteDetail) {
		return voteDetailMapper.selectVoteDetailList(voteDetail);
	}

	/**
	* 新增vote
	*
	* @param voteDetail vote
	* @return 结果
	*/
	@Override
	public int insertVoteDetail(VoteDetail voteDetail) {
		return voteDetailMapper.insertVoteDetail(voteDetail);
	}

	/**
	* 修改vote
	*
	* @param voteDetail vote
	* @return 结果
	*/
	@Override
	public int updateVoteDetail(VoteDetail voteDetail) {
		return voteDetailMapper.updateVoteDetail(voteDetail);
	}

	/**
	* 批量删除vote
	*
	* @param ids 需要删除的voteID
	* @return 结果
	*/
	@Override
	public int deleteVoteDetailByIds(Long[] ids) {
		return voteDetailMapper.deleteVoteDetailByIds(ids);
	}

	/**
	* 删除vote信息
	*
	* @param id voteID
	* @return 结果
	*/
	@Override
	public int deleteVoteDetailById(Long id) {
		return voteDetailMapper.deleteVoteDetailById(id);
	}

}
