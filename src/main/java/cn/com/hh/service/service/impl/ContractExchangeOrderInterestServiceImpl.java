package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.ContractExchangeOrderInterestMapper;
import com.common.api.model.ContractExchangeOrderInterest;
import com.common.api.service.IContractExchangeOrderInterestService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:03
 * Description: [contract服务实现]
 */
@Service
public class ContractExchangeOrderInterestServiceImpl implements IContractExchangeOrderInterestService {
	@Autowired
	private ContractExchangeOrderInterestMapper contractExchangeOrderInterestMapper;

	/**
	* 查询contract
	*
	* @param id contractID
	* @return contract
	*/
	@Override
	public ContractExchangeOrderInterest selectContractExchangeOrderInterestById(Long id) {
		return contractExchangeOrderInterestMapper.selectContractExchangeOrderInterestById(id);
	}

	/**
	* 查询contract列表
	*
	* @param contractExchangeOrderInterest contract
	* @return contract
	*/
	@Override
	public List<ContractExchangeOrderInterest> selectContractExchangeOrderInterestList(ContractExchangeOrderInterest contractExchangeOrderInterest) {
		return contractExchangeOrderInterestMapper.selectContractExchangeOrderInterestList(contractExchangeOrderInterest);
	}

	/**
	* 新增contract
	*
	* @param contractExchangeOrderInterest contract
	* @return 结果
	*/
	@Override
	public int insertContractExchangeOrderInterest(ContractExchangeOrderInterest contractExchangeOrderInterest) {
		return contractExchangeOrderInterestMapper.insertContractExchangeOrderInterest(contractExchangeOrderInterest);
	}

	/**
	* 修改contract
	*
	* @param contractExchangeOrderInterest contract
	* @return 结果
	*/
	@Override
	public int updateContractExchangeOrderInterest(ContractExchangeOrderInterest contractExchangeOrderInterest) {
		return contractExchangeOrderInterestMapper.updateContractExchangeOrderInterest(contractExchangeOrderInterest);
	}

	/**
	* 批量删除contract
	*
	* @param ids 需要删除的contractID
	* @return 结果
	*/
	@Override
	public int deleteContractExchangeOrderInterestByIds(Long[] ids) {
		return contractExchangeOrderInterestMapper.deleteContractExchangeOrderInterestByIds(ids);
	}

	/**
	* 删除contract信息
	*
	* @param id contractID
	* @return 结果
	*/
	@Override
	public int deleteContractExchangeOrderInterestById(Long id) {
		return contractExchangeOrderInterestMapper.deleteContractExchangeOrderInterestById(id);
	}

}
