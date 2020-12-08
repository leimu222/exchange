package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.ContractStrategyExchangeConfigMapper;
import com.common.api.model.ContractStrategyExchangeConfig;
import com.common.api.service.IContractStrategyExchangeConfigService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:04
 * Description: [contract服务实现]
 */
@Service
public class ContractStrategyExchangeConfigServiceImpl implements IContractStrategyExchangeConfigService {
	@Autowired
	private ContractStrategyExchangeConfigMapper contractStrategyExchangeConfigMapper;

	/**
	* 查询contract
	*
	* @param id contractID
	* @return contract
	*/
	@Override
	public ContractStrategyExchangeConfig selectContractStrategyExchangeConfigById(Long id) {
		return contractStrategyExchangeConfigMapper.selectContractStrategyExchangeConfigById(id);
	}

	/**
	* 查询contract列表
	*
	* @param contractStrategyExchangeConfig contract
	* @return contract
	*/
	@Override
	public List<ContractStrategyExchangeConfig> selectContractStrategyExchangeConfigList(ContractStrategyExchangeConfig contractStrategyExchangeConfig) {
		return contractStrategyExchangeConfigMapper.selectContractStrategyExchangeConfigList(contractStrategyExchangeConfig);
	}

	/**
	* 新增contract
	*
	* @param contractStrategyExchangeConfig contract
	* @return 结果
	*/
	@Override
	public int insertContractStrategyExchangeConfig(ContractStrategyExchangeConfig contractStrategyExchangeConfig) {
		return contractStrategyExchangeConfigMapper.insertContractStrategyExchangeConfig(contractStrategyExchangeConfig);
	}

	/**
	* 修改contract
	*
	* @param contractStrategyExchangeConfig contract
	* @return 结果
	*/
	@Override
	public int updateContractStrategyExchangeConfig(ContractStrategyExchangeConfig contractStrategyExchangeConfig) {
		return contractStrategyExchangeConfigMapper.updateContractStrategyExchangeConfig(contractStrategyExchangeConfig);
	}

	/**
	* 批量删除contract
	*
	* @param ids 需要删除的contractID
	* @return 结果
	*/
	@Override
	public int deleteContractStrategyExchangeConfigByIds(Long[] ids) {
		return contractStrategyExchangeConfigMapper.deleteContractStrategyExchangeConfigByIds(ids);
	}

	/**
	* 删除contract信息
	*
	* @param id contractID
	* @return 结果
	*/
	@Override
	public int deleteContractStrategyExchangeConfigById(Long id) {
		return contractStrategyExchangeConfigMapper.deleteContractStrategyExchangeConfigById(id);
	}

}
