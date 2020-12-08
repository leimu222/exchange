package com.common.api.service;

import java.util.List;

import com.common.api.model.poolNode;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:08
 * Description: [poolBiz服务]
 */
public interface IPoolNodeBizService {

	/**
	* 查询pool
	*
	* @param id poolID
	* @return pool
	*/
	public PoolNode selectPoolNodeById(Long id);

	/**
	* 查询pool列表
	*
	* @param poolNode pool
	* @return pool集合
	*/
	public List<PoolNode> selectPoolNodeList(PoolNode poolNode);

	/**
	* 新增pool
	*
	* @param poolNode pool
	* @return 结果
	*/
	public int insertPoolNode(PoolNode poolNode);

	/**
	* 修改pool
	*
	* @param poolNode pool
	* @return 结果
	*/
	public int updatePoolNode(PoolNode poolNode);

	/**
	* 批量删除pool
	*
	* @param ids 需要删除的poolID
	* @return 结果
	*/
	public int deletePoolNodeByIds(Long[] ids);

	/**
	* 删除pool信息
	*
	* @param id poolID
	* @return 结果
	*/
	public int deletePoolNodeById(Long id);
	
}
