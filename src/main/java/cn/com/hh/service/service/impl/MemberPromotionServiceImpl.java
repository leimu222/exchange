package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.MemberPromotionMapper;
import com.common.api.model.MemberPromotion;
import com.common.api.service.IMemberPromotionService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:06
 * Description: [member服务实现]
 */
@Service
public class MemberPromotionServiceImpl implements IMemberPromotionService {
	@Autowired
	private MemberPromotionMapper memberPromotionMapper;

	/**
	* 查询member
	*
	* @param id memberID
	* @return member
	*/
	@Override
	public MemberPromotion selectMemberPromotionById(Long id) {
		return memberPromotionMapper.selectMemberPromotionById(id);
	}

	/**
	* 查询member列表
	*
	* @param memberPromotion member
	* @return member
	*/
	@Override
	public List<MemberPromotion> selectMemberPromotionList(MemberPromotion memberPromotion) {
		return memberPromotionMapper.selectMemberPromotionList(memberPromotion);
	}

	/**
	* 新增member
	*
	* @param memberPromotion member
	* @return 结果
	*/
	@Override
	public int insertMemberPromotion(MemberPromotion memberPromotion) {
		return memberPromotionMapper.insertMemberPromotion(memberPromotion);
	}

	/**
	* 修改member
	*
	* @param memberPromotion member
	* @return 结果
	*/
	@Override
	public int updateMemberPromotion(MemberPromotion memberPromotion) {
		return memberPromotionMapper.updateMemberPromotion(memberPromotion);
	}

	/**
	* 批量删除member
	*
	* @param ids 需要删除的memberID
	* @return 结果
	*/
	@Override
	public int deleteMemberPromotionByIds(Long[] ids) {
		return memberPromotionMapper.deleteMemberPromotionByIds(ids);
	}

	/**
	* 删除member信息
	*
	* @param id memberID
	* @return 结果
	*/
	@Override
	public int deleteMemberPromotionById(Long id) {
		return memberPromotionMapper.deleteMemberPromotionById(id);
	}

}
