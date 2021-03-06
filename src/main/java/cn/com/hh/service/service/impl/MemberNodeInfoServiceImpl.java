package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.MemberNodeInfoMapper;
import com.common.api.model.MemberNodeInfo;
import com.common.api.service.IMemberNodeInfoService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:06
 * Description: [member服务实现]
 */
@Service
public class MemberNodeInfoServiceImpl implements IMemberNodeInfoService {
	@Autowired
	private MemberNodeInfoMapper memberNodeInfoMapper;

	/**
	* 查询member
	*
	* @param id memberID
	* @return member
	*/
	@Override
	public MemberNodeInfo selectMemberNodeInfoById(Integer id) {
		return memberNodeInfoMapper.selectMemberNodeInfoById(id);
	}

	/**
	* 查询member列表
	*
	* @param memberNodeInfo member
	* @return member
	*/
	@Override
	public List<MemberNodeInfo> selectMemberNodeInfoList(MemberNodeInfo memberNodeInfo) {
		return memberNodeInfoMapper.selectMemberNodeInfoList(memberNodeInfo);
	}

	/**
	* 新增member
	*
	* @param memberNodeInfo member
	* @return 结果
	*/
	@Override
	public int insertMemberNodeInfo(MemberNodeInfo memberNodeInfo) {
		return memberNodeInfoMapper.insertMemberNodeInfo(memberNodeInfo);
	}

	/**
	* 修改member
	*
	* @param memberNodeInfo member
	* @return 结果
	*/
	@Override
	public int updateMemberNodeInfo(MemberNodeInfo memberNodeInfo) {
		return memberNodeInfoMapper.updateMemberNodeInfo(memberNodeInfo);
	}

	/**
	* 批量删除member
	*
	* @param ids 需要删除的memberID
	* @return 结果
	*/
	@Override
	public int deleteMemberNodeInfoByIds(Integer[] ids) {
		return memberNodeInfoMapper.deleteMemberNodeInfoByIds(ids);
	}

	/**
	* 删除member信息
	*
	* @param id memberID
	* @return 结果
	*/
	@Override
	public int deleteMemberNodeInfoById(Integer id) {
		return memberNodeInfoMapper.deleteMemberNodeInfoById(id);
	}

}
