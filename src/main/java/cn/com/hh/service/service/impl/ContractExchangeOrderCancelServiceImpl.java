package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.ContractExchangeOrderCancelMapper;
import com.common.api.model.ContractExchangeOrderCancel;
import com.common.api.service.IContractExchangeOrderCancelService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:03
 * Description: [contract服务实现]
 */
@Service
public class ContractExchangeOrderCancelServiceImpl implements IContractExchangeOrderCancelService {
	@Autowired
	private ContractExchangeOrderCancelMapper contractExchangeOrderCancelMapper;

	/**
	* 查询contract
	*
	* @param orderId contractID
	* @return contract
	*/
	@Override
	public ContractExchangeOrderCancel selectContractExchangeOrderCancelById(Long orderId) {
		return contractExchangeOrderCancelMapper.selectContractExchangeOrderCancelById(orderId);
	}

	/**
	* 查询contract列表
	*
	* @param contractExchangeOrderCancel contract
	* @return contract
	*/
	@Override
	public List<ContractExchangeOrderCancel> selectContractExchangeOrderCancelList(ContractExchangeOrderCancel contractExchangeOrderCancel) {
		return contractExchangeOrderCancelMapper.selectContractExchangeOrderCancelList(contractExchangeOrderCancel);
	}

	/**
	* 新增contract
	*
	* @param contractExchangeOrderCancel contract
	* @return 结果
	*/
	@Override
	public int insertContractExchangeOrderCancel(ContractExchangeOrderCancel contractExchangeOrderCancel) {
		return contractExchangeOrderCancelMapper.insertContractExchangeOrderCancel(contractExchangeOrderCancel);
	}

	/**
	* 修改contract
	*
	* @param contractExchangeOrderCancel contract
	* @return 结果
	*/
	@Override
	public int updateContractExchangeOrderCancel(ContractExchangeOrderCancel contractExchangeOrderCancel) {
		return contractExchangeOrderCancelMapper.updateContractExchangeOrderCancel(contractExchangeOrderCancel);
	}

	/**
	* 批量删除contract
	*
	* @param orderIds 需要删除的contractID
	* @return 结果
	*/
	@Override
	public int deleteContractExchangeOrderCancelByIds(Long[] orderIds) {
		return contractExchangeOrderCancelMapper.deleteContractExchangeOrderCancelByIds(orderIds);
	}

	/**
	* 删除contract信息
	*
	* @param orderId contractID
	* @return 结果
	*/
	@Override
	public int deleteContractExchangeOrderCancelById(Long orderId) {
		return contractExchangeOrderCancelMapper.deleteContractExchangeOrderCancelById(orderId);
	}

}
