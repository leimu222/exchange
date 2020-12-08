package com.common.api.service;

import java.util.List;

import com.common.api.model.unblockCommonConfig;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:09
 * Description: [unblock服务]
 */
public interface IUnblockCommonConfigService {

	/**
	* 查询unblock
	*
	* @param id unblockID
	* @return unblock
	*/
	public UnblockCommonConfig selectUnblockCommonConfigById(Long id);

	/**
	* 查询unblock列表
	*
	* @param unblockCommonConfig unblock
	* @return unblock集合
	*/
	public List<UnblockCommonConfig> selectUnblockCommonConfigList(UnblockCommonConfig unblockCommonConfig);

	/**
	* 新增unblock
	*
	* @param unblockCommonConfig unblock
	* @return 结果
	*/
	public int insertUnblockCommonConfig(UnblockCommonConfig unblockCommonConfig);

	/**
	* 修改unblock
	*
	* @param unblockCommonConfig unblock
	* @return 结果
	*/
	public int updateUnblockCommonConfig(UnblockCommonConfig unblockCommonConfig);

	/**
	* 批量删除unblock
	*
	* @param ids 需要删除的unblockID
	* @return 结果
	*/
	public int deleteUnblockCommonConfigByIds(Long[] ids);

	/**
	* 删除unblock信息
	*
	* @param id unblockID
	* @return 结果
	*/
	public int deleteUnblockCommonConfigById(Long id);
	
}
