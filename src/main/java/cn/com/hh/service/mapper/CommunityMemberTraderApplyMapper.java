package com.common.api.mapper;

import com.common.api.model.CommunityMemberTraderApply;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:02
  * Description: [community服务实现]
 */
public interface CommunityMemberTraderApplyMapper{

	/**
	* 查询community
	*
	* @param id communityID
	* @return community
	*/
	public CommunityMemberTraderApply selectCommunityMemberTraderApplyById(String id);

	/**
	* 查询community列表
	*
	* @param communityMemberTraderApply community
	* @return community集合
	*/
	public List<CommunityMemberTraderApply> selectCommunityMemberTraderApplyList(CommunityMemberTraderApply communityMemberTraderApply);

	/**
	* 新增community
	*
	* @param communityMemberTraderApply community
	* @return 结果
	*/
	public int insertCommunityMemberTraderApply(CommunityMemberTraderApply communityMemberTraderApply);

	/**
	* 修改community
	*
	* @param communityMemberTraderApply community
	* @return 结果
	*/
	public int updateCommunityMemberTraderApply(CommunityMemberTraderApply communityMemberTraderApply);

	/**
	* 删除community
	*
	* @param id communityID
	* @return 结果
	*/
	public int deleteCommunityMemberTraderApplyById(String id);

	/**
	* 批量删除community
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteCommunityMemberTraderApplyByIds(String[] ids);

}
