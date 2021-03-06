package com.common.api.mapper;

import com.common.api.model.MemberPromotion;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:06
  * Description: [member服务实现]
 */
public interface MemberPromotionMapper{

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
	* 删除member
	*
	* @param id memberID
	* @return 结果
	*/
	public int deleteMemberPromotionById(Long id);

	/**
	* 批量删除member
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteMemberPromotionByIds(Long[] ids);

}
