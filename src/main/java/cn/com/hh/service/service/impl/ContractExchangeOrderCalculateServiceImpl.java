package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.ContractExchangeOrderCalculateMapper;
import com.common.api.model.ContractExchangeOrderCalculate;
import com.common.api.service.IContractExchangeOrderCalculateService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:03
 * Description: [contract服务实现]
 */
@Service
public class ContractExchangeOrderCalculateServiceImpl implements IContractExchangeOrderCalculateService {
	@Autowired
	private ContractExchangeOrderCalculateMapper contractExchangeOrderCalculateMapper;

	/**
	* 查询contract
	*
	* @param orderId contractID
	* @return contract
	*/
	@Override
	public ContractExchangeOrderCalculate selectContractExchangeOrderCalculateById(Long orderId) {
		return contractExchangeOrderCalculateMapper.selectContractExchangeOrderCalculateById(orderId);
	}

	/**
	* 查询contract列表
	*
	* @param contractExchangeOrderCalculate contract
	* @return contract
	*/
	@Override
	public List<ContractExchangeOrderCalculate> selectContractExchangeOrderCalculateList(ContractExchangeOrderCalculate contractExchangeOrderCalculate) {
		return contractExchangeOrderCalculateMapper.selectContractExchangeOrderCalculateList(contractExchangeOrderCalculate);
	}

	/**
	* 新增contract
	*
	* @param contractExchangeOrderCalculate contract
	* @return 结果
	*/
	@Override
	public int insertContractExchangeOrderCalculate(ContractExchangeOrderCalculate contractExchangeOrderCalculate) {
		return contractExchangeOrderCalculateMapper.insertContractExchangeOrderCalculate(contractExchangeOrderCalculate);
	}

	/**
	* 修改contract
	*
	* @param contractExchangeOrderCalculate contract
	* @return 结果
	*/
	@Override
	public int updateContractExchangeOrderCalculate(ContractExchangeOrderCalculate contractExchangeOrderCalculate) {
		return contractExchangeOrderCalculateMapper.updateContractExchangeOrderCalculate(contractExchangeOrderCalculate);
	}

	/**
	* 批量删除contract
	*
	* @param orderIds 需要删除的contractID
	* @return 结果
	*/
	@Override
	public int deleteContractExchangeOrderCalculateByIds(Long[] orderIds) {
		return contractExchangeOrderCalculateMapper.deleteContractExchangeOrderCalculateByIds(orderIds);
	}

	/**
	* 删除contract信息
	*
	* @param orderId contractID
	* @return 结果
	*/
	@Override
	public int deleteContractExchangeOrderCalculateById(Long orderId) {
		return contractExchangeOrderCalculateMapper.deleteContractExchangeOrderCalculateById(orderId);
	}

}
