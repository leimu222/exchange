package com.common.api.service;

import java.util.List;

import com.common.api.model.platformTransaction;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:08
 * Description: [platform服务]
 */
public interface IPlatformTransactionService {

	/**
	* 查询platform
	*
	* @param id platformID
	* @return platform
	*/
	public PlatformTransaction selectPlatformTransactionById(Long id);

	/**
	* 查询platform列表
	*
	* @param platformTransaction platform
	* @return platform集合
	*/
	public List<PlatformTransaction> selectPlatformTransactionList(PlatformTransaction platformTransaction);

	/**
	* 新增platform
	*
	* @param platformTransaction platform
	* @return 结果
	*/
	public int insertPlatformTransaction(PlatformTransaction platformTransaction);

	/**
	* 修改platform
	*
	* @param platformTransaction platform
	* @return 结果
	*/
	public int updatePlatformTransaction(PlatformTransaction platformTransaction);

	/**
	* 批量删除platform
	*
	* @param ids 需要删除的platformID
	* @return 结果
	*/
	public int deletePlatformTransactionByIds(Long[] ids);

	/**
	* 删除platform信息
	*
	* @param id platformID
	* @return 结果
	*/
	public int deletePlatformTransactionById(Long id);
	
}
