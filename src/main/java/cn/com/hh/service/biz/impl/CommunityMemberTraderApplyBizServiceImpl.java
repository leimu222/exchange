package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.CommunityMemberTraderApplyMapper;
import com.common.api.model.CommunityMemberTraderApply;
import com.common.api.service.ICommunityMemberTraderApplyService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:02
 * Description: [communityBiz服务实现]
 */
@Service
public class CommunityMemberTraderApplyBizServiceImpl extends CommonService implements ICommunityMemberTraderApplyBizService {
	@Autowired
	private ICommunityMemberTraderApplyService communityMemberTraderApplyService;

	/**
	* 查询community
	*
	* @param id communityID
	* @return community
	*/
	@Override
	public CommunityMemberTraderApply selectCommunityMemberTraderApplyById(String id) {
		return communityMemberTraderApplyService.selectCommunityMemberTraderApplyById(id);
	}

	/**
	* 查询community列表
	*
	* @param communityMemberTraderApply community
	* @return community
	*/
	@Override
	public List<CommunityMemberTraderApply> selectCommunityMemberTraderApplyList(CommunityMemberTraderApply communityMemberTraderApply) {
		return communityMemberTraderApplyService.selectCommunityMemberTraderApplyList(communityMemberTraderApply);
	}

	/**
	* 新增community
	*
	* @param communityMemberTraderApply community
	* @return 结果
	*/
	@Override
	public int insertCommunityMemberTraderApply(CommunityMemberTraderApply communityMemberTraderApply) {
		return communityMemberTraderApplyService.insertCommunityMemberTraderApply(communityMemberTraderApply);
	}

	/**
	* 修改community
	*
	* @param communityMemberTraderApply community
	* @return 结果
	*/
	@Override
	public int updateCommunityMemberTraderApply(CommunityMemberTraderApply communityMemberTraderApply) {
		return communityMemberTraderApplyService.updateCommunityMemberTraderApply(communityMemberTraderApply);
	}

	/**
	* 批量删除community
	*
	* @param ids 需要删除的communityID
	* @return 结果
	*/
	@Override
	public int deleteCommunityMemberTraderApplyByIds(String[] ids) {
		return communityMemberTraderApplyService.deleteCommunityMemberTraderApplyByIds(ids);
	}

	/**
	* 删除community信息
	*
	* @param id communityID
	* @return 结果
	*/
	@Override
	public int deleteCommunityMemberTraderApplyById(String id) {
		return communityMemberTraderApplyService.deleteCommunityMemberTraderApplyById(id);
	}

}
