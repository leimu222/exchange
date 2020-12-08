package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.ContractDoubleExchangeConfigMapper;
import com.common.api.model.ContractDoubleExchangeConfig;
import com.common.api.service.IContractDoubleExchangeConfigService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:03
 * Description: [contract服务实现]
 */
@Service
public class ContractDoubleExchangeConfigServiceImpl implements IContractDoubleExchangeConfigService {
	@Autowired
	private ContractDoubleExchangeConfigMapper contractDoubleExchangeConfigMapper;

	/**
	* 查询contract
	*
	* @param id contractID
	* @return contract
	*/
	@Override
	public ContractDoubleExchangeConfig selectContractDoubleExchangeConfigById(Long id) {
		return contractDoubleExchangeConfigMapper.selectContractDoubleExchangeConfigById(id);
	}

	/**
	* 查询contract列表
	*
	* @param contractDoubleExchangeConfig contract
	* @return contract
	*/
	@Override
	public List<ContractDoubleExchangeConfig> selectContractDoubleExchangeConfigList(ContractDoubleExchangeConfig contractDoubleExchangeConfig) {
		return contractDoubleExchangeConfigMapper.selectContractDoubleExchangeConfigList(contractDoubleExchangeConfig);
	}

	/**
	* 新增contract
	*
	* @param contractDoubleExchangeConfig contract
	* @return 结果
	*/
	@Override
	public int insertContractDoubleExchangeConfig(ContractDoubleExchangeConfig contractDoubleExchangeConfig) {
		return contractDoubleExchangeConfigMapper.insertContractDoubleExchangeConfig(contractDoubleExchangeConfig);
	}

	/**
	* 修改contract
	*
	* @param contractDoubleExchangeConfig contract
	* @return 结果
	*/
	@Override
	public int updateContractDoubleExchangeConfig(ContractDoubleExchangeConfig contractDoubleExchangeConfig) {
		return contractDoubleExchangeConfigMapper.updateContractDoubleExchangeConfig(contractDoubleExchangeConfig);
	}

	/**
	* 批量删除contract
	*
	* @param ids 需要删除的contractID
	* @return 结果
	*/
	@Override
	public int deleteContractDoubleExchangeConfigByIds(Long[] ids) {
		return contractDoubleExchangeConfigMapper.deleteContractDoubleExchangeConfigByIds(ids);
	}

	/**
	* 删除contract信息
	*
	* @param id contractID
	* @return 结果
	*/
	@Override
	public int deleteContractDoubleExchangeConfigById(Long id) {
		return contractDoubleExchangeConfigMapper.deleteContractDoubleExchangeConfigById(id);
	}

}
