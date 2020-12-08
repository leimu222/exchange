package com.common.api.mapper;

import com.common.api.model.CommunityTopCategoryConfig;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:02
  * Description: [community服务实现]
 */
public interface CommunityTopCategoryConfigMapper{

	/**
	* 查询community
	*
	* @param id communityID
	* @return community
	*/
	public CommunityTopCategoryConfig selectCommunityTopCategoryConfigById(String id);

	/**
	* 查询community列表
	*
	* @param communityTopCategoryConfig community
	* @return community集合
	*/
	public List<CommunityTopCategoryConfig> selectCommunityTopCategoryConfigList(CommunityTopCategoryConfig communityTopCategoryConfig);

	/**
	* 新增community
	*
	* @param communityTopCategoryConfig community
	* @return 结果
	*/
	public int insertCommunityTopCategoryConfig(CommunityTopCategoryConfig communityTopCategoryConfig);

	/**
	* 修改community
	*
	* @param communityTopCategoryConfig community
	* @return 结果
	*/
	public int updateCommunityTopCategoryConfig(CommunityTopCategoryConfig communityTopCategoryConfig);

	/**
	* 删除community
	*
	* @param id communityID
	* @return 结果
	*/
	public int deleteCommunityTopCategoryConfigById(String id);

	/**
	* 批量删除community
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteCommunityTopCategoryConfigByIds(String[] ids);

}
