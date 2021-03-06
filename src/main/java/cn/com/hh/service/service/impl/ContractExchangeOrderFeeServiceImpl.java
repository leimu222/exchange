package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.ContractExchangeOrderFeeMapper;
import com.common.api.model.ContractExchangeOrderFee;
import com.common.api.service.IContractExchangeOrderFeeService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:03
 * Description: [contract服务实现]
 */
@Service
public class ContractExchangeOrderFeeServiceImpl implements IContractExchangeOrderFeeService {
	@Autowired
	private ContractExchangeOrderFeeMapper contractExchangeOrderFeeMapper;

	/**
	* 查询contract
	*
	* @param orderId contractID
	* @return contract
	*/
	@Override
	public ContractExchangeOrderFee selectContractExchangeOrderFeeById(Long orderId) {
		return contractExchangeOrderFeeMapper.selectContractExchangeOrderFeeById(orderId);
	}

	/**
	* 查询contract列表
	*
	* @param contractExchangeOrderFee contract
	* @return contract
	*/
	@Override
	public List<ContractExchangeOrderFee> selectContractExchangeOrderFeeList(ContractExchangeOrderFee contractExchangeOrderFee) {
		return contractExchangeOrderFeeMapper.selectContractExchangeOrderFeeList(contractExchangeOrderFee);
	}

	/**
	* 新增contract
	*
	* @param contractExchangeOrderFee contract
	* @return 结果
	*/
	@Override
	public int insertContractExchangeOrderFee(ContractExchangeOrderFee contractExchangeOrderFee) {
		return contractExchangeOrderFeeMapper.insertContractExchangeOrderFee(contractExchangeOrderFee);
	}

	/**
	* 修改contract
	*
	* @param contractExchangeOrderFee contract
	* @return 结果
	*/
	@Override
	public int updateContractExchangeOrderFee(ContractExchangeOrderFee contractExchangeOrderFee) {
		return contractExchangeOrderFeeMapper.updateContractExchangeOrderFee(contractExchangeOrderFee);
	}

	/**
	* 批量删除contract
	*
	* @param orderIds 需要删除的contractID
	* @return 结果
	*/
	@Override
	public int deleteContractExchangeOrderFeeByIds(Long[] orderIds) {
		return contractExchangeOrderFeeMapper.deleteContractExchangeOrderFeeByIds(orderIds);
	}

	/**
	* 删除contract信息
	*
	* @param orderId contractID
	* @return 结果
	*/
	@Override
	public int deleteContractExchangeOrderFeeById(Long orderId) {
		return contractExchangeOrderFeeMapper.deleteContractExchangeOrderFeeById(orderId);
	}

}
