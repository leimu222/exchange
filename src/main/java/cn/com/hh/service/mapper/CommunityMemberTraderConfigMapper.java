package com.common.api.mapper;

import com.common.api.model.CommunityMemberTraderConfig;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:02
  * Description: [community服务实现]
 */
public interface CommunityMemberTraderConfigMapper{

	/**
	* 查询community
	*
	* @param id communityID
	* @return community
	*/
	public CommunityMemberTraderConfig selectCommunityMemberTraderConfigById(Long id);

	/**
	* 查询community列表
	*
	* @param communityMemberTraderConfig community
	* @return community集合
	*/
	public List<CommunityMemberTraderConfig> selectCommunityMemberTraderConfigList(CommunityMemberTraderConfig communityMemberTraderConfig);

	/**
	* 新增community
	*
	* @param communityMemberTraderConfig community
	* @return 结果
	*/
	public int insertCommunityMemberTraderConfig(CommunityMemberTraderConfig communityMemberTraderConfig);

	/**
	* 修改community
	*
	* @param communityMemberTraderConfig community
	* @return 结果
	*/
	public int updateCommunityMemberTraderConfig(CommunityMemberTraderConfig communityMemberTraderConfig);

	/**
	* 删除community
	*
	* @param id communityID
	* @return 结果
	*/
	public int deleteCommunityMemberTraderConfigById(Long id);

	/**
	* 批量删除community
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteCommunityMemberTraderConfigByIds(Long[] ids);

}
