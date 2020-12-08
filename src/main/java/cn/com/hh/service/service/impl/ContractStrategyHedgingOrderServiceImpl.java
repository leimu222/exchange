package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.ContractStrategyHedgingOrderMapper;
import com.common.api.model.ContractStrategyHedgingOrder;
import com.common.api.service.IContractStrategyHedgingOrderService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:04
 * Description: [contract服务实现]
 */
@Service
public class ContractStrategyHedgingOrderServiceImpl implements IContractStrategyHedgingOrderService {
	@Autowired
	private ContractStrategyHedgingOrderMapper contractStrategyHedgingOrderMapper;

	/**
	* 查询contract
	*
	* @param id contractID
	* @return contract
	*/
	@Override
	public ContractStrategyHedgingOrder selectContractStrategyHedgingOrderById(Long id) {
		return contractStrategyHedgingOrderMapper.selectContractStrategyHedgingOrderById(id);
	}

	/**
	* 查询contract列表
	*
	* @param contractStrategyHedgingOrder contract
	* @return contract
	*/
	@Override
	public List<ContractStrategyHedgingOrder> selectContractStrategyHedgingOrderList(ContractStrategyHedgingOrder contractStrategyHedgingOrder) {
		return contractStrategyHedgingOrderMapper.selectContractStrategyHedgingOrderList(contractStrategyHedgingOrder);
	}

	/**
	* 新增contract
	*
	* @param contractStrategyHedgingOrder contract
	* @return 结果
	*/
	@Override
	public int insertContractStrategyHedgingOrder(ContractStrategyHedgingOrder contractStrategyHedgingOrder) {
		return contractStrategyHedgingOrderMapper.insertContractStrategyHedgingOrder(contractStrategyHedgingOrder);
	}

	/**
	* 修改contract
	*
	* @param contractStrategyHedgingOrder contract
	* @return 结果
	*/
	@Override
	public int updateContractStrategyHedgingOrder(ContractStrategyHedgingOrder contractStrategyHedgingOrder) {
		return contractStrategyHedgingOrderMapper.updateContractStrategyHedgingOrder(contractStrategyHedgingOrder);
	}

	/**
	* 批量删除contract
	*
	* @param ids 需要删除的contractID
	* @return 结果
	*/
	@Override
	public int deleteContractStrategyHedgingOrderByIds(Long[] ids) {
		return contractStrategyHedgingOrderMapper.deleteContractStrategyHedgingOrderByIds(ids);
	}

	/**
	* 删除contract信息
	*
	* @param id contractID
	* @return 结果
	*/
	@Override
	public int deleteContractStrategyHedgingOrderById(Long id) {
		return contractStrategyHedgingOrderMapper.deleteContractStrategyHedgingOrderById(id);
	}

}
