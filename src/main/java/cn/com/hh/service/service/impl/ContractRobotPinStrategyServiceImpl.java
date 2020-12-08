package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.ContractRobotPinStrategyMapper;
import com.common.api.model.ContractRobotPinStrategy;
import com.common.api.service.IContractRobotPinStrategyService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:03
 * Description: [contract服务实现]
 */
@Service
public class ContractRobotPinStrategyServiceImpl implements IContractRobotPinStrategyService {
	@Autowired
	private ContractRobotPinStrategyMapper contractRobotPinStrategyMapper;

	/**
	* 查询contract
	*
	* @param id contractID
	* @return contract
	*/
	@Override
	public ContractRobotPinStrategy selectContractRobotPinStrategyById(Long id) {
		return contractRobotPinStrategyMapper.selectContractRobotPinStrategyById(id);
	}

	/**
	* 查询contract列表
	*
	* @param contractRobotPinStrategy contract
	* @return contract
	*/
	@Override
	public List<ContractRobotPinStrategy> selectContractRobotPinStrategyList(ContractRobotPinStrategy contractRobotPinStrategy) {
		return contractRobotPinStrategyMapper.selectContractRobotPinStrategyList(contractRobotPinStrategy);
	}

	/**
	* 新增contract
	*
	* @param contractRobotPinStrategy contract
	* @return 结果
	*/
	@Override
	public int insertContractRobotPinStrategy(ContractRobotPinStrategy contractRobotPinStrategy) {
		return contractRobotPinStrategyMapper.insertContractRobotPinStrategy(contractRobotPinStrategy);
	}

	/**
	* 修改contract
	*
	* @param contractRobotPinStrategy contract
	* @return 结果
	*/
	@Override
	public int updateContractRobotPinStrategy(ContractRobotPinStrategy contractRobotPinStrategy) {
		return contractRobotPinStrategyMapper.updateContractRobotPinStrategy(contractRobotPinStrategy);
	}

	/**
	* 批量删除contract
	*
	* @param ids 需要删除的contractID
	* @return 结果
	*/
	@Override
	public int deleteContractRobotPinStrategyByIds(Long[] ids) {
		return contractRobotPinStrategyMapper.deleteContractRobotPinStrategyByIds(ids);
	}

	/**
	* 删除contract信息
	*
	* @param id contractID
	* @return 结果
	*/
	@Override
	public int deleteContractRobotPinStrategyById(Long id) {
		return contractRobotPinStrategyMapper.deleteContractRobotPinStrategyById(id);
	}

}
