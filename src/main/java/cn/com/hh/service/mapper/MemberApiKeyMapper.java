package com.common.api.mapper;

import com.common.api.model.MemberApiKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:05
  * Description: [member服务实现]
 */
public interface MemberApiKeyMapper{

	/**
	* 查询member
	*
	* @param id memberID
	* @return member
	*/
	public MemberApiKey selectMemberApiKeyById(Long id);

	/**
	* 查询member列表
	*
	* @param memberApiKey member
	* @return member集合
	*/
	public List<MemberApiKey> selectMemberApiKeyList(MemberApiKey memberApiKey);

	/**
	* 新增member
	*
	* @param memberApiKey member
	* @return 结果
	*/
	public int insertMemberApiKey(MemberApiKey memberApiKey);

	/**
	* 修改member
	*
	* @param memberApiKey member
	* @return 结果
	*/
	public int updateMemberApiKey(MemberApiKey memberApiKey);

	/**
	* 删除member
	*
	* @param id memberID
	* @return 结果
	*/
	public int deleteMemberApiKeyById(Long id);

	/**
	* 批量删除member
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteMemberApiKeyByIds(Long[] ids);

}
