package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.MemberBuyCoinInfoMapper;
import com.common.api.model.MemberBuyCoinInfo;
import com.common.api.service.IMemberBuyCoinInfoService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:05
 * Description: [member服务实现]
 */
@Service
public class MemberBuyCoinInfoServiceImpl implements IMemberBuyCoinInfoService {
	@Autowired
	private MemberBuyCoinInfoMapper memberBuyCoinInfoMapper;

	/**
	* 查询member
	*
	* @param id memberID
	* @return member
	*/
	@Override
	public MemberBuyCoinInfo selectMemberBuyCoinInfoById(Integer id) {
		return memberBuyCoinInfoMapper.selectMemberBuyCoinInfoById(id);
	}

	/**
	* 查询member列表
	*
	* @param memberBuyCoinInfo member
	* @return member
	*/
	@Override
	public List<MemberBuyCoinInfo> selectMemberBuyCoinInfoList(MemberBuyCoinInfo memberBuyCoinInfo) {
		return memberBuyCoinInfoMapper.selectMemberBuyCoinInfoList(memberBuyCoinInfo);
	}

	/**
	* 新增member
	*
	* @param memberBuyCoinInfo member
	* @return 结果
	*/
	@Override
	public int insertMemberBuyCoinInfo(MemberBuyCoinInfo memberBuyCoinInfo) {
		return memberBuyCoinInfoMapper.insertMemberBuyCoinInfo(memberBuyCoinInfo);
	}

	/**
	* 修改member
	*
	* @param memberBuyCoinInfo member
	* @return 结果
	*/
	@Override
	public int updateMemberBuyCoinInfo(MemberBuyCoinInfo memberBuyCoinInfo) {
		return memberBuyCoinInfoMapper.updateMemberBuyCoinInfo(memberBuyCoinInfo);
	}

	/**
	* 批量删除member
	*
	* @param ids 需要删除的memberID
	* @return 结果
	*/
	@Override
	public int deleteMemberBuyCoinInfoByIds(Integer[] ids) {
		return memberBuyCoinInfoMapper.deleteMemberBuyCoinInfoByIds(ids);
	}

	/**
	* 删除member信息
	*
	* @param id memberID
	* @return 结果
	*/
	@Override
	public int deleteMemberBuyCoinInfoById(Integer id) {
		return memberBuyCoinInfoMapper.deleteMemberBuyCoinInfoById(id);
	}

}
