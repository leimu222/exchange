package com.common.api.mapper;

import com.common.api.model.CommunityMemberFollowInfo;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:02
  * Description: [community服务实现]
 */
public interface CommunityMemberFollowInfoMapper{

	/**
	* 查询community
	*
	* @param id communityID
	* @return community
	*/
	public CommunityMemberFollowInfo selectCommunityMemberFollowInfoById(Long id);

	/**
	* 查询community列表
	*
	* @param communityMemberFollowInfo community
	* @return community集合
	*/
	public List<CommunityMemberFollowInfo> selectCommunityMemberFollowInfoList(CommunityMemberFollowInfo communityMemberFollowInfo);

	/**
	* 新增community
	*
	* @param communityMemberFollowInfo community
	* @return 结果
	*/
	public int insertCommunityMemberFollowInfo(CommunityMemberFollowInfo communityMemberFollowInfo);

	/**
	* 修改community
	*
	* @param communityMemberFollowInfo community
	* @return 结果
	*/
	public int updateCommunityMemberFollowInfo(CommunityMemberFollowInfo communityMemberFollowInfo);

	/**
	* 删除community
	*
	* @param id communityID
	* @return 结果
	*/
	public int deleteCommunityMemberFollowInfoById(Long id);

	/**
	* 批量删除community
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteCommunityMemberFollowInfoByIds(Long[] ids);

}
