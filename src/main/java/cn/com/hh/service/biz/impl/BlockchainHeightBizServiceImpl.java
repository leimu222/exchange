package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.BlockchainHeightMapper;
import com.common.api.model.BlockchainHeight;
import com.common.api.service.IBlockchainHeightService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:01
 * Description: [blockchainBiz服务实现]
 */
@Service
public class BlockchainHeightBizServiceImpl extends CommonService implements IBlockchainHeightBizService {
	@Autowired
	private IBlockchainHeightService blockchainHeightService;

	/**
	* 查询blockchain
	*
	* @param id blockchainID
	* @return blockchain
	*/
	@Override
	public BlockchainHeight selectBlockchainHeightById(Long id) {
		return blockchainHeightService.selectBlockchainHeightById(id);
	}

	/**
	* 查询blockchain列表
	*
	* @param blockchainHeight blockchain
	* @return blockchain
	*/
	@Override
	public List<BlockchainHeight> selectBlockchainHeightList(BlockchainHeight blockchainHeight) {
		return blockchainHeightService.selectBlockchainHeightList(blockchainHeight);
	}

	/**
	* 新增blockchain
	*
	* @param blockchainHeight blockchain
	* @return 结果
	*/
	@Override
	public int insertBlockchainHeight(BlockchainHeight blockchainHeight) {
		return blockchainHeightService.insertBlockchainHeight(blockchainHeight);
	}

	/**
	* 修改blockchain
	*
	* @param blockchainHeight blockchain
	* @return 结果
	*/
	@Override
	public int updateBlockchainHeight(BlockchainHeight blockchainHeight) {
		return blockchainHeightService.updateBlockchainHeight(blockchainHeight);
	}

	/**
	* 批量删除blockchain
	*
	* @param ids 需要删除的blockchainID
	* @return 结果
	*/
	@Override
	public int deleteBlockchainHeightByIds(Long[] ids) {
		return blockchainHeightService.deleteBlockchainHeightByIds(ids);
	}

	/**
	* 删除blockchain信息
	*
	* @param id blockchainID
	* @return 结果
	*/
	@Override
	public int deleteBlockchainHeightById(Long id) {
		return blockchainHeightService.deleteBlockchainHeightById(id);
	}

}
