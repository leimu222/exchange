package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.ContractExchangeOrderMapper;
import com.common.api.model.ContractExchangeOrder;
import com.common.api.service.IContractExchangeOrderService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:03
 * Description: [contract服务实现]
 */
@Service
public class ContractExchangeOrderServiceImpl implements IContractExchangeOrderService {
	@Autowired
	private ContractExchangeOrderMapper contractExchangeOrderMapper;

	/**
	* 查询contract
	*
	* @param id contractID
	* @return contract
	*/
	@Override
	public ContractExchangeOrder selectContractExchangeOrderById(Long id) {
		return contractExchangeOrderMapper.selectContractExchangeOrderById(id);
	}

	/**
	* 查询contract列表
	*
	* @param contractExchangeOrder contract
	* @return contract
	*/
	@Override
	public List<ContractExchangeOrder> selectContractExchangeOrderList(ContractExchangeOrder contractExchangeOrder) {
		return contractExchangeOrderMapper.selectContractExchangeOrderList(contractExchangeOrder);
	}

	/**
	* 新增contract
	*
	* @param contractExchangeOrder contract
	* @return 结果
	*/
	@Override
	public int insertContractExchangeOrder(ContractExchangeOrder contractExchangeOrder) {
		return contractExchangeOrderMapper.insertContractExchangeOrder(contractExchangeOrder);
	}

	/**
	* 修改contract
	*
	* @param contractExchangeOrder contract
	* @return 结果
	*/
	@Override
	public int updateContractExchangeOrder(ContractExchangeOrder contractExchangeOrder) {
		return contractExchangeOrderMapper.updateContractExchangeOrder(contractExchangeOrder);
	}

	/**
	* 批量删除contract
	*
	* @param ids 需要删除的contractID
	* @return 结果
	*/
	@Override
	public int deleteContractExchangeOrderByIds(Long[] ids) {
		return contractExchangeOrderMapper.deleteContractExchangeOrderByIds(ids);
	}

	/**
	* 删除contract信息
	*
	* @param id contractID
	* @return 结果
	*/
	@Override
	public int deleteContractExchangeOrderById(Long id) {
		return contractExchangeOrderMapper.deleteContractExchangeOrderById(id);
	}

}
