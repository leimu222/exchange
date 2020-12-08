package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.MemberWalletHistoryMapper;
import com.common.api.model.MemberWalletHistory;
import com.common.api.service.IMemberWalletHistoryService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:06
 * Description: [member服务实现]
 */
@Service
public class MemberWalletHistoryServiceImpl implements IMemberWalletHistoryService {
	@Autowired
	private MemberWalletHistoryMapper memberWalletHistoryMapper;

	/**
	* 查询member
	*
	* @param id memberID
	* @return member
	*/
	@Override
	public MemberWalletHistory selectMemberWalletHistoryById(Long id) {
		return memberWalletHistoryMapper.selectMemberWalletHistoryById(id);
	}

	/**
	* 查询member列表
	*
	* @param memberWalletHistory member
	* @return member
	*/
	@Override
	public List<MemberWalletHistory> selectMemberWalletHistoryList(MemberWalletHistory memberWalletHistory) {
		return memberWalletHistoryMapper.selectMemberWalletHistoryList(memberWalletHistory);
	}

	/**
	* 新增member
	*
	* @param memberWalletHistory member
	* @return 结果
	*/
	@Override
	public int insertMemberWalletHistory(MemberWalletHistory memberWalletHistory) {
		return memberWalletHistoryMapper.insertMemberWalletHistory(memberWalletHistory);
	}

	/**
	* 修改member
	*
	* @param memberWalletHistory member
	* @return 结果
	*/
	@Override
	public int updateMemberWalletHistory(MemberWalletHistory memberWalletHistory) {
		return memberWalletHistoryMapper.updateMemberWalletHistory(memberWalletHistory);
	}

	/**
	* 批量删除member
	*
	* @param ids 需要删除的memberID
	* @return 结果
	*/
	@Override
	public int deleteMemberWalletHistoryByIds(Long[] ids) {
		return memberWalletHistoryMapper.deleteMemberWalletHistoryByIds(ids);
	}

	/**
	* 删除member信息
	*
	* @param id memberID
	* @return 结果
	*/
	@Override
	public int deleteMemberWalletHistoryById(Long id) {
		return memberWalletHistoryMapper.deleteMemberWalletHistoryById(id);
	}

}
