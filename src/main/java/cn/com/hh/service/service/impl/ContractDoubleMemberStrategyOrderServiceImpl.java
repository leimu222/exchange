package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.ContractDoubleMemberStrategyOrderMapper;
import com.common.api.model.ContractDoubleMemberStrategyOrder;
import com.common.api.service.IContractDoubleMemberStrategyOrderService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:03
 * Description: [contract服务实现]
 */
@Service
public class ContractDoubleMemberStrategyOrderServiceImpl implements IContractDoubleMemberStrategyOrderService {
	@Autowired
	private ContractDoubleMemberStrategyOrderMapper contractDoubleMemberStrategyOrderMapper;

	/**
	* 查询contract
	*
	* @param id contractID
	* @return contract
	*/
	@Override
	public ContractDoubleMemberStrategyOrder selectContractDoubleMemberStrategyOrderById(Long id) {
		return contractDoubleMemberStrategyOrderMapper.selectContractDoubleMemberStrategyOrderById(id);
	}

	/**
	* 查询contract列表
	*
	* @param contractDoubleMemberStrategyOrder contract
	* @return contract
	*/
	@Override
	public List<ContractDoubleMemberStrategyOrder> selectContractDoubleMemberStrategyOrderList(ContractDoubleMemberStrategyOrder contractDoubleMemberStrategyOrder) {
		return contractDoubleMemberStrategyOrderMapper.selectContractDoubleMemberStrategyOrderList(contractDoubleMemberStrategyOrder);
	}

	/**
	* 新增contract
	*
	* @param contractDoubleMemberStrategyOrder contract
	* @return 结果
	*/
	@Override
	public int insertContractDoubleMemberStrategyOrder(ContractDoubleMemberStrategyOrder contractDoubleMemberStrategyOrder) {
		return contractDoubleMemberStrategyOrderMapper.insertContractDoubleMemberStrategyOrder(contractDoubleMemberStrategyOrder);
	}

	/**
	* 修改contract
	*
	* @param contractDoubleMemberStrategyOrder contract
	* @return 结果
	*/
	@Override
	public int updateContractDoubleMemberStrategyOrder(ContractDoubleMemberStrategyOrder contractDoubleMemberStrategyOrder) {
		return contractDoubleMemberStrategyOrderMapper.updateContractDoubleMemberStrategyOrder(contractDoubleMemberStrategyOrder);
	}

	/**
	* 批量删除contract
	*
	* @param ids 需要删除的contractID
	* @return 结果
	*/
	@Override
	public int deleteContractDoubleMemberStrategyOrderByIds(Long[] ids) {
		return contractDoubleMemberStrategyOrderMapper.deleteContractDoubleMemberStrategyOrderByIds(ids);
	}

	/**
	* 删除contract信息
	*
	* @param id contractID
	* @return 结果
	*/
	@Override
	public int deleteContractDoubleMemberStrategyOrderById(Long id) {
		return contractDoubleMemberStrategyOrderMapper.deleteContractDoubleMemberStrategyOrderById(id);
	}

}
