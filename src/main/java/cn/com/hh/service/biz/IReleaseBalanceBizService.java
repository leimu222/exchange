package com.common.api.service;

import java.util.List;

import com.common.api.model.releaseBalance;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:08
 * Description: [releaseBiz服务]
 */
public interface IReleaseBalanceBizService {

	/**
	* 查询release
	*
	* @param id releaseID
	* @return release
	*/
	public ReleaseBalance selectReleaseBalanceById(Long id);

	/**
	* 查询release列表
	*
	* @param releaseBalance release
	* @return release集合
	*/
	public List<ReleaseBalance> selectReleaseBalanceList(ReleaseBalance releaseBalance);

	/**
	* 新增release
	*
	* @param releaseBalance release
	* @return 结果
	*/
	public int insertReleaseBalance(ReleaseBalance releaseBalance);

	/**
	* 修改release
	*
	* @param releaseBalance release
	* @return 结果
	*/
	public int updateReleaseBalance(ReleaseBalance releaseBalance);

	/**
	* 批量删除release
	*
	* @param ids 需要删除的releaseID
	* @return 结果
	*/
	public int deleteReleaseBalanceByIds(Long[] ids);

	/**
	* 删除release信息
	*
	* @param id releaseID
	* @return 结果
	*/
	public int deleteReleaseBalanceById(Long id);
	
}
