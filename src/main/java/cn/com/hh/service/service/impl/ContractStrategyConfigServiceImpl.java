package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.ContractStrategyConfigMapper;
import com.common.api.model.ContractStrategyConfig;
import com.common.api.service.IContractStrategyConfigService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:03
 * Description: [contract服务实现]
 */
@Service
public class ContractStrategyConfigServiceImpl implements IContractStrategyConfigService {
	@Autowired
	private ContractStrategyConfigMapper contractStrategyConfigMapper;

	/**
	* 查询contract
	*
	* @param id contractID
	* @return contract
	*/
	@Override
	public ContractStrategyConfig selectContractStrategyConfigById(Long id) {
		return contractStrategyConfigMapper.selectContractStrategyConfigById(id);
	}

	/**
	* 查询contract列表
	*
	* @param contractStrategyConfig contract
	* @return contract
	*/
	@Override
	public List<ContractStrategyConfig> selectContractStrategyConfigList(ContractStrategyConfig contractStrategyConfig) {
		return contractStrategyConfigMapper.selectContractStrategyConfigList(contractStrategyConfig);
	}

	/**
	* 新增contract
	*
	* @param contractStrategyConfig contract
	* @return 结果
	*/
	@Override
	public int insertContractStrategyConfig(ContractStrategyConfig contractStrategyConfig) {
		return contractStrategyConfigMapper.insertContractStrategyConfig(contractStrategyConfig);
	}

	/**
	* 修改contract
	*
	* @param contractStrategyConfig contract
	* @return 结果
	*/
	@Override
	public int updateContractStrategyConfig(ContractStrategyConfig contractStrategyConfig) {
		return contractStrategyConfigMapper.updateContractStrategyConfig(contractStrategyConfig);
	}

	/**
	* 批量删除contract
	*
	* @param ids 需要删除的contractID
	* @return 结果
	*/
	@Override
	public int deleteContractStrategyConfigByIds(Long[] ids) {
		return contractStrategyConfigMapper.deleteContractStrategyConfigByIds(ids);
	}

	/**
	* 删除contract信息
	*
	* @param id contractID
	* @return 结果
	*/
	@Override
	public int deleteContractStrategyConfigById(Long id) {
		return contractStrategyConfigMapper.deleteContractStrategyConfigById(id);
	}

}
