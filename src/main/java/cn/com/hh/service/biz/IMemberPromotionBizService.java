package com.common.api.service;

import java.util.List;

import com.common.api.model.memberPromotion;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:06
 * Description: [memberBiz服务]
 */
public interface IMemberPromotionBizService {

	/**
	* 查询member
	*
	* @param id memberID
	* @return member
	*/
	public MemberPromotion selectMemberPromotionById(Long id);

	/**
	* 查询member列表
	*
	* @param memberPromotion member
	* @return member集合
	*/
	public List<MemberPromotion> selectMemberPromotionList(MemberPromotion memberPromotion);

	/**
	* 新增member
	*
	* @param memberPromotion member
	* @return 结果
	*/
	public int insertMemberPromotion(MemberPromotion memberPromotion);

	/**
	* 修改member
	*
	* @param memberPromotion member
	* @return 结果
	*/
	public int updateMemberPromotion(MemberPromotion memberPromotion);

	/**
	* 批量删除member
	*
	* @param ids 需要删除的memberID
	* @return 结果
	*/
	public int deleteMemberPromotionByIds(Long[] ids);

	/**
	* 删除member信息
	*
	* @param id memberID
	* @return 结果
	*/
	public int deleteMemberPromotionById(Long id);
	
}
