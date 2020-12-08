package com.common.api.mapper;

import com.common.api.model.AppRevision;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:01
  * Description: [app服务实现]
 */
public interface AppRevisionMapper{

	/**
	* 查询app
	*
	* @param id appID
	* @return app
	*/
	public AppRevision selectAppRevisionById(Long id);

	/**
	* 查询app列表
	*
	* @param appRevision app
	* @return app集合
	*/
	public List<AppRevision> selectAppRevisionList(AppRevision appRevision);

	/**
	* 新增app
	*
	* @param appRevision app
	* @return 结果
	*/
	public int insertAppRevision(AppRevision appRevision);

	/**
	* 修改app
	*
	* @param appRevision app
	* @return 结果
	*/
	public int updateAppRevision(AppRevision appRevision);

	/**
	* 删除app
	*
	* @param id appID
	* @return 结果
	*/
	public int deleteAppRevisionById(Long id);

	/**
	* 批量删除app
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteAppRevisionByIds(Long[] ids);

}
