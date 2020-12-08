package com.common.api.mapper;

import com.common.api.model.MemberBonus;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:05
  * Description: [member服务实现]
 */
public interface MemberBonusMapper{

	/**
	* 查询member
	*
	* @param id memberID
	* @return member
	*/
	public MemberBonus selectMemberBonusById(Long id);

	/**
	* 查询member列表
	*
	* @param memberBonus member
	* @return member集合
	*/
	public List<MemberBonus> selectMemberBonusList(MemberBonus memberBonus);

	/**
	* 新增member
	*
	* @param memberBonus member
	* @return 结果
	*/
	public int insertMemberBonus(MemberBonus memberBonus);

	/**
	* 修改member
	*
	* @param memberBonus member
	* @return 结果
	*/
	public int updateMemberBonus(MemberBonus memberBonus);

	/**
	* 删除member
	*
	* @param id memberID
	* @return 结果
	*/
	public int deleteMemberBonusById(Long id);

	/**
	* 批量删除member
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteMemberBonusByIds(Long[] ids);

}
