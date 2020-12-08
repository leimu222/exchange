package com.common.api.mapper;

import com.common.api.model.BlockchainHeight;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:01
  * Description: [blockchain服务实现]
 */
public interface BlockchainHeightMapper{

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
	* 删除blockchain
	*
	* @param id blockchainID
	* @return 结果
	*/
	public int deleteBlockchainHeightById(Long id);

	/**
	* 批量删除blockchain
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteBlockchainHeightByIds(Long[] ids);

}
