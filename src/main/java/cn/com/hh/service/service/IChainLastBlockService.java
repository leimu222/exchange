package com.common.api.service;

import java.util.List;

import com.common.api.model.chainLastBlock;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:01
 * Description: [chain服务]
 */
public interface IChainLastBlockService {

	/**
	* 查询chain
	*
	* @param id chainID
	* @return chain
	*/
	public ChainLastBlock selectChainLastBlockById(Integer id);

	/**
	* 查询chain列表
	*
	* @param chainLastBlock chain
	* @return chain集合
	*/
	public List<ChainLastBlock> selectChainLastBlockList(ChainLastBlock chainLastBlock);

	/**
	* 新增chain
	*
	* @param chainLastBlock chain
	* @return 结果
	*/
	public int insertChainLastBlock(ChainLastBlock chainLastBlock);

	/**
	* 修改chain
	*
	* @param chainLastBlock chain
	* @return 结果
	*/
	public int updateChainLastBlock(ChainLastBlock chainLastBlock);

	/**
	* 批量删除chain
	*
	* @param ids 需要删除的chainID
	* @return 结果
	*/
	public int deleteChainLastBlockByIds(Integer[] ids);

	/**
	* 删除chain信息
	*
	* @param id chainID
	* @return 结果
	*/
	public int deleteChainLastBlockById(Integer id);
	
}
