package com.common.api.mapper;

import com.common.api.model.CommunitySecondCategoryConfig;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:02
  * Description: [community服务实现]
 */
public interface CommunitySecondCategoryConfigMapper{

	/**
	* 查询community
	*
	* @param id communityID
	* @return community
	*/
	public CommunitySecondCategoryConfig selectCommunitySecondCategoryConfigById(String id);

	/**
	* 查询community列表
	*
	* @param communitySecondCategoryConfig community
	* @return community集合
	*/
	public List<CommunitySecondCategoryConfig> selectCommunitySecondCategoryConfigList(CommunitySecondCategoryConfig communitySecondCategoryConfig);

	/**
	* 新增community
	*
	* @param communitySecondCategoryConfig community
	* @return 结果
	*/
	public int insertCommunitySecondCategoryConfig(CommunitySecondCategoryConfig communitySecondCategoryConfig);

	/**
	* 修改community
	*
	* @param communitySecondCategoryConfig community
	* @return 结果
	*/
	public int updateCommunitySecondCategoryConfig(CommunitySecondCategoryConfig communitySecondCategoryConfig);

	/**
	* 删除community
	*
	* @param id communityID
	* @return 结果
	*/
	public int deleteCommunitySecondCategoryConfigById(String id);

	/**
	* 批量删除community
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteCommunitySecondCategoryConfigByIds(String[] ids);

}
