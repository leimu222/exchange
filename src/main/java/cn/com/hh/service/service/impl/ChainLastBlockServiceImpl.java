package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.ChainLastBlockMapper;
import com.common.api.model.ChainLastBlock;
import com.common.api.service.IChainLastBlockService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:01
 * Description: [chain服务实现]
 */
@Service
public class ChainLastBlockServiceImpl implements IChainLastBlockService {
	@Autowired
	private ChainLastBlockMapper chainLastBlockMapper;

	/**
	* 查询chain
	*
	* @param id chainID
	* @return chain
	*/
	@Override
	public ChainLastBlock selectChainLastBlockById(Integer id) {
		return chainLastBlockMapper.selectChainLastBlockById(id);
	}

	/**
	* 查询chain列表
	*
	* @param chainLastBlock chain
	* @return chain
	*/
	@Override
	public List<ChainLastBlock> selectChainLastBlockList(ChainLastBlock chainLastBlock) {
		return chainLastBlockMapper.selectChainLastBlockList(chainLastBlock);
	}

	/**
	* 新增chain
	*
	* @param chainLastBlock chain
	* @return 结果
	*/
	@Override
	public int insertChainLastBlock(ChainLastBlock chainLastBlock) {
		return chainLastBlockMapper.insertChainLastBlock(chainLastBlock);
	}

	/**
	* 修改chain
	*
	* @param chainLastBlock chain
	* @return 结果
	*/
	@Override
	public int updateChainLastBlock(ChainLastBlock chainLastBlock) {
		return chainLastBlockMapper.updateChainLastBlock(chainLastBlock);
	}

	/**
	* 批量删除chain
	*
	* @param ids 需要删除的chainID
	* @return 结果
	*/
	@Override
	public int deleteChainLastBlockByIds(Integer[] ids) {
		return chainLastBlockMapper.deleteChainLastBlockByIds(ids);
	}

	/**
	* 删除chain信息
	*
	* @param id chainID
	* @return 结果
	*/
	@Override
	public int deleteChainLastBlockById(Integer id) {
		return chainLastBlockMapper.deleteChainLastBlockById(id);
	}

}
