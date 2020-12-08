package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.MemberAddressMapper;
import com.common.api.model.MemberAddress;
import com.common.api.service.IMemberAddressService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:05
 * Description: [memberBiz服务实现]
 */
@Service
public class MemberAddressBizServiceImpl extends CommonService implements IMemberAddressBizService {
	@Autowired
	private IMemberAddressService memberAddressService;

	/**
	* 查询member
	*
	* @param id memberID
	* @return member
	*/
	@Override
	public MemberAddress selectMemberAddressById(Long id) {
		return memberAddressService.selectMemberAddressById(id);
	}

	/**
	* 查询member列表
	*
	* @param memberAddress member
	* @return member
	*/
	@Override
	public List<MemberAddress> selectMemberAddressList(MemberAddress memberAddress) {
		return memberAddressService.selectMemberAddressList(memberAddress);
	}

	/**
	* 新增member
	*
	* @param memberAddress member
	* @return 结果
	*/
	@Override
	public int insertMemberAddress(MemberAddress memberAddress) {
		return memberAddressService.insertMemberAddress(memberAddress);
	}

	/**
	* 修改member
	*
	* @param memberAddress member
	* @return 结果
	*/
	@Override
	public int updateMemberAddress(MemberAddress memberAddress) {
		return memberAddressService.updateMemberAddress(memberAddress);
	}

	/**
	* 批量删除member
	*
	* @param ids 需要删除的memberID
	* @return 结果
	*/
	@Override
	public int deleteMemberAddressByIds(Long[] ids) {
		return memberAddressService.deleteMemberAddressByIds(ids);
	}

	/**
	* 删除member信息
	*
	* @param id memberID
	* @return 结果
	*/
	@Override
	public int deleteMemberAddressById(Long id) {
		return memberAddressService.deleteMemberAddressById(id);
	}

}
