package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.ContractExchangeOrderTiggerMapper;
import com.common.api.model.ContractExchangeOrderTigger;
import com.common.api.service.IContractExchangeOrderTiggerService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:03
 * Description: [contract服务实现]
 */
@Service
public class ContractExchangeOrderTiggerServiceImpl implements IContractExchangeOrderTiggerService {
	@Autowired
	private ContractExchangeOrderTiggerMapper contractExchangeOrderTiggerMapper;

	/**
	* 查询contract
	*
	* @param orderId contractID
	* @return contract
	*/
	@Override
	public ContractExchangeOrderTigger selectContractExchangeOrderTiggerById(Long orderId) {
		return contractExchangeOrderTiggerMapper.selectContractExchangeOrderTiggerById(orderId);
	}

	/**
	* 查询contract列表
	*
	* @param contractExchangeOrderTigger contract
	* @return contract
	*/
	@Override
	public List<ContractExchangeOrderTigger> selectContractExchangeOrderTiggerList(ContractExchangeOrderTigger contractExchangeOrderTigger) {
		return contractExchangeOrderTiggerMapper.selectContractExchangeOrderTiggerList(contractExchangeOrderTigger);
	}

	/**
	* 新增contract
	*
	* @param contractExchangeOrderTigger contract
	* @return 结果
	*/
	@Override
	public int insertContractExchangeOrderTigger(ContractExchangeOrderTigger contractExchangeOrderTigger) {
		return contractExchangeOrderTiggerMapper.insertContractExchangeOrderTigger(contractExchangeOrderTigger);
	}

	/**
	* 修改contract
	*
	* @param contractExchangeOrderTigger contract
	* @return 结果
	*/
	@Override
	public int updateContractExchangeOrderTigger(ContractExchangeOrderTigger contractExchangeOrderTigger) {
		return contractExchangeOrderTiggerMapper.updateContractExchangeOrderTigger(contractExchangeOrderTigger);
	}

	/**
	* 批量删除contract
	*
	* @param orderIds 需要删除的contractID
	* @return 结果
	*/
	@Override
	public int deleteContractExchangeOrderTiggerByIds(Long[] orderIds) {
		return contractExchangeOrderTiggerMapper.deleteContractExchangeOrderTiggerByIds(orderIds);
	}

	/**
	* 删除contract信息
	*
	* @param orderId contractID
	* @return 结果
	*/
	@Override
	public int deleteContractExchangeOrderTiggerById(Long orderId) {
		return contractExchangeOrderTiggerMapper.deleteContractExchangeOrderTiggerById(orderId);
	}

}
