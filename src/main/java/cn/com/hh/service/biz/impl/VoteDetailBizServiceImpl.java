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
 * Description: [voteBiz服务实现]
 */
@Service
public class VoteDetailBizServiceImpl extends CommonService implements IVoteDetailBizService {
	@Autowired
	private IVoteDetailService voteDetailService;

	/**
	* 查询vote
	*
	* @param id voteID
	* @return vote
	*/
	@Override
	public VoteDetail selectVoteDetailById(Long id) {
		return voteDetailService.selectVoteDetailById(id);
	}

	/**
	* 查询vote列表
	*
	* @param voteDetail vote
	* @return vote
	*/
	@Override
	public List<VoteDetail> selectVoteDetailList(VoteDetail voteDetail) {
		return voteDetailService.selectVoteDetailList(voteDetail);
	}

	/**
	* 新增vote
	*
	* @param voteDetail vote
	* @return 结果
	*/
	@Override
	public int insertVoteDetail(VoteDetail voteDetail) {
		return voteDetailService.insertVoteDetail(voteDetail);
	}

	/**
	* 修改vote
	*
	* @param voteDetail vote
	* @return 结果
	*/
	@Override
	public int updateVoteDetail(VoteDetail voteDetail) {
		return voteDetailService.updateVoteDetail(voteDetail);
	}

	/**
	* 批量删除vote
	*
	* @param ids 需要删除的voteID
	* @return 结果
	*/
	@Override
	public int deleteVoteDetailByIds(Long[] ids) {
		return voteDetailService.deleteVoteDetailByIds(ids);
	}

	/**
	* 删除vote信息
	*
	* @param id voteID
	* @return 结果
	*/
	@Override
	public int deleteVoteDetailById(Long id) {
		return voteDetailService.deleteVoteDetailById(id);
	}

}
