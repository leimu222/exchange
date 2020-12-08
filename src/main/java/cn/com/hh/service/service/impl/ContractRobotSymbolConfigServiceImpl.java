package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.ContractRobotSymbolConfigMapper;
import com.common.api.model.ContractRobotSymbolConfig;
import com.common.api.service.IContractRobotSymbolConfigService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:03
 * Description: [contract服务实现]
 */
@Service
public class ContractRobotSymbolConfigServiceImpl implements IContractRobotSymbolConfigService {
	@Autowired
	private ContractRobotSymbolConfigMapper contractRobotSymbolConfigMapper;

	/**
	* 查询contract
	*
	* @param symbol contractID
	* @return contract
	*/
	@Override
	public ContractRobotSymbolConfig selectContractRobotSymbolConfigById(String symbol) {
		return contractRobotSymbolConfigMapper.selectContractRobotSymbolConfigById(symbol);
	}

	/**
	* 查询contract列表
	*
	* @param contractRobotSymbolConfig contract
	* @return contract
	*/
	@Override
	public List<ContractRobotSymbolConfig> selectContractRobotSymbolConfigList(ContractRobotSymbolConfig contractRobotSymbolConfig) {
		return contractRobotSymbolConfigMapper.selectContractRobotSymbolConfigList(contractRobotSymbolConfig);
	}

	/**
	* 新增contract
	*
	* @param contractRobotSymbolConfig contract
	* @return 结果
	*/
	@Override
	public int insertContractRobotSymbolConfig(ContractRobotSymbolConfig contractRobotSymbolConfig) {
		return contractRobotSymbolConfigMapper.insertContractRobotSymbolConfig(contractRobotSymbolConfig);
	}

	/**
	* 修改contract
	*
	* @param contractRobotSymbolConfig contract
	* @return 结果
	*/
	@Override
	public int updateContractRobotSymbolConfig(ContractRobotSymbolConfig contractRobotSymbolConfig) {
		return contractRobotSymbolConfigMapper.updateContractRobotSymbolConfig(contractRobotSymbolConfig);
	}

	/**
	* 批量删除contract
	*
	* @param symbols 需要删除的contractID
	* @return 结果
	*/
	@Override
	public int deleteContractRobotSymbolConfigByIds(String[] symbols) {
		return contractRobotSymbolConfigMapper.deleteContractRobotSymbolConfigByIds(symbols);
	}

	/**
	* 删除contract信息
	*
	* @param symbol contractID
	* @return 结果
	*/
	@Override
	public int deleteContractRobotSymbolConfigById(String symbol) {
		return contractRobotSymbolConfigMapper.deleteContractRobotSymbolConfigById(symbol);
	}

}
