package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.ContractCoinMapper;
import com.common.api.model.ContractCoin;
import com.common.api.service.IContractCoinService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:02
 * Description: [contract服务实现]
 */
@Service
public class ContractCoinServiceImpl implements IContractCoinService {
	@Autowired
	private ContractCoinMapper contractCoinMapper;

	/**
	* 查询contract
	*
	* @param id contractID
	* @return contract
	*/
	@Override
	public ContractCoin selectContractCoinById(Long id) {
		return contractCoinMapper.selectContractCoinById(id);
	}

	/**
	* 查询contract列表
	*
	* @param contractCoin contract
	* @return contract
	*/
	@Override
	public List<ContractCoin> selectContractCoinList(ContractCoin contractCoin) {
		return contractCoinMapper.selectContractCoinList(contractCoin);
	}

	/**
	* 新增contract
	*
	* @param contractCoin contract
	* @return 结果
	*/
	@Override
	public int insertContractCoin(ContractCoin contractCoin) {
		return contractCoinMapper.insertContractCoin(contractCoin);
	}

	/**
	* 修改contract
	*
	* @param contractCoin contract
	* @return 结果
	*/
	@Override
	public int updateContractCoin(ContractCoin contractCoin) {
		return contractCoinMapper.updateContractCoin(contractCoin);
	}

	/**
	* 批量删除contract
	*
	* @param ids 需要删除的contractID
	* @return 结果
	*/
	@Override
	public int deleteContractCoinByIds(Long[] ids) {
		return contractCoinMapper.deleteContractCoinByIds(ids);
	}

	/**
	* 删除contract信息
	*
	* @param id contractID
	* @return 结果
	*/
	@Override
	public int deleteContractCoinById(Long id) {
		return contractCoinMapper.deleteContractCoinById(id);
	}

}
