package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.ContractConfigMapper;
import com.common.api.model.ContractConfig;
import com.common.api.service.IContractConfigService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:02
 * Description: [contract服务实现]
 */
@Service
public class ContractConfigServiceImpl implements IContractConfigService {
	@Autowired
	private ContractConfigMapper contractConfigMapper;

	/**
	* 查询contract
	*
	* @param configKey contractID
	* @return contract
	*/
	@Override
	public ContractConfig selectContractConfigById(String configKey) {
		return contractConfigMapper.selectContractConfigById(configKey);
	}

	/**
	* 查询contract列表
	*
	* @param contractConfig contract
	* @return contract
	*/
	@Override
	public List<ContractConfig> selectContractConfigList(ContractConfig contractConfig) {
		return contractConfigMapper.selectContractConfigList(contractConfig);
	}

	/**
	* 新增contract
	*
	* @param contractConfig contract
	* @return 结果
	*/
	@Override
	public int insertContractConfig(ContractConfig contractConfig) {
		return contractConfigMapper.insertContractConfig(contractConfig);
	}

	/**
	* 修改contract
	*
	* @param contractConfig contract
	* @return 结果
	*/
	@Override
	public int updateContractConfig(ContractConfig contractConfig) {
		return contractConfigMapper.updateContractConfig(contractConfig);
	}

	/**
	* 批量删除contract
	*
	* @param configKeys 需要删除的contractID
	* @return 结果
	*/
	@Override
	public int deleteContractConfigByIds(String[] configKeys) {
		return contractConfigMapper.deleteContractConfigByIds(configKeys);
	}

	/**
	* 删除contract信息
	*
	* @param configKey contractID
	* @return 结果
	*/
	@Override
	public int deleteContractConfigById(String configKey) {
		return contractConfigMapper.deleteContractConfigById(configKey);
	}

}
