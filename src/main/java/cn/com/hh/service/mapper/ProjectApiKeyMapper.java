package com.common.api.mapper;

import com.common.api.model.ProjectApiKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:08
  * Description: [project服务实现]
 */
public interface ProjectApiKeyMapper{

	/**
	* 查询project
	*
	* @param id projectID
	* @return project
	*/
	public ProjectApiKey selectProjectApiKeyById(Integer id);

	/**
	* 查询project列表
	*
	* @param projectApiKey project
	* @return project集合
	*/
	public List<ProjectApiKey> selectProjectApiKeyList(ProjectApiKey projectApiKey);

	/**
	* 新增project
	*
	* @param projectApiKey project
	* @return 结果
	*/
	public int insertProjectApiKey(ProjectApiKey projectApiKey);

	/**
	* 修改project
	*
	* @param projectApiKey project
	* @return 结果
	*/
	public int updateProjectApiKey(ProjectApiKey projectApiKey);

	/**
	* 删除project
	*
	* @param id projectID
	* @return 结果
	*/
	public int deleteProjectApiKeyById(Integer id);

	/**
	* 批量删除project
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteProjectApiKeyByIds(Integer[] ids);

}
