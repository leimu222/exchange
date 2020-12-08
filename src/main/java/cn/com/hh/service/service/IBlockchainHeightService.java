package com.common.api.service;

import java.util.List;

import com.common.api.model.blockchainHeight;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:01
 * Description: [blockchain服务]
 */
public interface IBlockchainHeightService {

	/**
	* 查询blockchain
	*
	* @param id blockchainID
	* @return blockchain
	*/
	public BlockchainHeight selectBlockchainHeightById(Long id);

	/**
	* 查询blockchain列表
	*
	* @param blockchainHeight blockchain
	* @return blockchain集合
	*/
	public List<BlockchainHeight> selectBlockchainHeightList(BlockchainHeight blockchainHeight);

	/**
	* 新增blockchain
	*
	* @param blockchainHeight blockchain
	* @return 结果
	*/
	public int insertBlockchainHeight(BlockchainHeight blockchainHeight);

	/**
	* 修改blockchain
	*
	* @param blockchainHeight blockchain
	* @return 结果
	*/
	public int updateBlockchainHeight(BlockchainHeight blockchainHeight);

	/**
	* 批量删除blockchain
	*
	* @param ids 需要删除的blockchainID
	* @return 结果
	*/
	public int deleteBlockchainHeightByIds(Long[] ids);

	/**
	* 删除blockchain信息
	*
	* @param id blockchainID
	* @return 结果
	*/
	public int deleteBlockchainHeightById(Long id);
	
}
