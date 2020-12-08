package com.common.api.service;

import java.util.List;

import com.common.api.model.appRevision;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:01
 * Description: [appBiz服务]
 */
public interface IAppRevisionBizService {

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
	* 批量删除app
	*
	* @param ids 需要删除的appID
	* @return 结果
	*/
	public int deleteAppRevisionByIds(Long[] ids);

	/**
	* 删除app信息
	*
	* @param id appID
	* @return 结果
	*/
	public int deleteAppRevisionById(Long id);
	
}
