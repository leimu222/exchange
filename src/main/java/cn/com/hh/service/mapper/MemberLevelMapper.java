package com.common.api.mapper;

import com.common.api.model.MemberLevel;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:06
  * Description: [member服务实现]
 */
public interface MemberLevelMapper{

	/**
	* 查询member
	*
	* @param id memberID
	* @return member
	*/
	public MemberLevel selectMemberLevelById(Long id);

	/**
	* 查询member列表
	*
	* @param memberLevel member
	* @return member集合
	*/
	public List<MemberLevel> selectMemberLevelList(MemberLevel memberLevel);

	/**
	* 新增member
	*
	* @param memberLevel member
	* @return 结果
	*/
	public int insertMemberLevel(MemberLevel memberLevel);

	/**
	* 修改member
	*
	* @param memberLevel member
	* @return 结果
	*/
	public int updateMemberLevel(MemberLevel memberLevel);

	/**
	* 删除member
	*
	* @param id memberID
	* @return 结果
	*/
	public int deleteMemberLevelById(Long id);

	/**
	* 批量删除member
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteMemberLevelByIds(Long[] ids);

}
