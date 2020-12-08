package com.common.api.service;

import java.util.List;

import com.common.api.model.appeal;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:01
 * Description: [appealBiz服务]
 */
public interface IAppealBizService {

	/**
	* 查询appeal
	*
	* @param id appealID
	* @return appeal
	*/
	public Appeal selectAppealById(Long id);

	/**
	* 查询appeal列表
	*
	* @param appeal appeal
	* @return appeal集合
	*/
	public List<Appeal> selectAppealList(Appeal appeal);

	/**
	* 新增appeal
	*
	* @param appeal appeal
	* @return 结果
	*/
	public int insertAppeal(Appeal appeal);

	/**
	* 修改appeal
	*
	* @param appeal appeal
	* @return 结果
	*/
	public int updateAppeal(Appeal appeal);

	/**
	* 批量删除appeal
	*
	* @param ids 需要删除的appealID
	* @return 结果
	*/
	public int deleteAppealByIds(Long[] ids);

	/**
	* 删除appeal信息
	*
	* @param id appealID
	* @return 结果
	*/
	public int deleteAppealById(Long id);
	
}
