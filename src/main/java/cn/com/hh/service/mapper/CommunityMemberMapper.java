package com.common.api.mapper;

import com.common.api.model.CommunityMember;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:02
  * Description: [community服务实现]
 */
public interface CommunityMemberMapper{

	/**
	* 查询community
	*
	* @param memberId communityID
	* @return community
	*/
	public CommunityMember selectCommunityMemberById(Long memberId);

	/**
	* 查询community列表
	*
	* @param communityMember community
	* @return community集合
	*/
	public List<CommunityMember> selectCommunityMemberList(CommunityMember communityMember);

	/**
	* 新增community
	*
	* @param communityMember community
	* @return 结果
	*/
	public int insertCommunityMember(CommunityMember communityMember);

	/**
	* 修改community
	*
	* @param communityMember community
	* @return 结果
	*/
	public int updateCommunityMember(CommunityMember communityMember);

	/**
	* 删除community
	*
	* @param memberId communityID
	* @return 结果
	*/
	public int deleteCommunityMemberById(Long memberId);

	/**
	* 批量删除community
	*
	* @param memberIds 需要删除的数据ID
	* @return 结果
	*/
	public int deleteCommunityMemberByIds(Long[] memberIds);

}
