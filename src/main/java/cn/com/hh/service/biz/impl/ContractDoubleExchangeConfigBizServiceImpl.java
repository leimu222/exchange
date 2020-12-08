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
 * Description: [contractBiz服务实现]
 */
@Service
public class ContractDoubleExchangeConfigBizServiceImpl extends CommonService implements IContractDoubleExchangeConfigBizService {
	@Autowired
	private IContractDoubleExchangeConfigService contractDoubleExchangeConfigService;

	/**
	* 查询contract
	*
	* @param id contractID
	* @return contract
	*/
	@Override
	public ContractDoubleExchangeConfig selectContractDoubleExchangeConfigById(Long id) {
		return contractDoubleExchangeConfigService.selectContractDoubleExchangeConfigById(id);
	}

	/**
	* 查询contract列表
	*
	* @param contractDoubleExchangeConfig contract
	* @return contract
	*/
	@Override
	public List<ContractDoubleExchangeConfig> selectContractDoubleExchangeConfigList(ContractDoubleExchangeConfig contractDoubleExchangeConfig) {
		return contractDoubleExchangeConfigService.selectContractDoubleExchangeConfigList(contractDoubleExchangeConfig);
	}

	/**
	* 新增contract
	*
	* @param contractDoubleExchangeConfig contract
	* @return 结果
	*/
	@Override
	public int insertContractDoubleExchangeConfig(ContractDoubleExchangeConfig contractDoubleExchangeConfig) {
		return contractDoubleExchangeConfigService.insertContractDoubleExchangeConfig(contractDoubleExchangeConfig);
	}

	/**
	* 修改contract
	*
	* @param contractDoubleExchangeConfig contract
	* @return 结果
	*/
	@Override
	public int updateContractDoubleExchangeConfig(ContractDoubleExchangeConfig contractDoubleExchangeConfig) {
		return contractDoubleExchangeConfigService.updateContractDoubleExchangeConfig(contractDoubleExchangeConfig);
	}

	/**
	* 批量删除contract
	*
	* @param ids 需要删除的contractID
	* @return 结果
	*/
	@Override
	public int deleteContractDoubleExchangeConfigByIds(Long[] ids) {
		return contractDoubleExchangeConfigService.deleteContractDoubleExchangeConfigByIds(ids);
	}

	/**
	* 删除contract信息
	*
	* @param id contractID
	* @return 结果
	*/
	@Override
	public int deleteContractDoubleExchangeConfigById(Long id) {
		return contractDoubleExchangeConfigService.deleteContractDoubleExchangeConfigById(id);
	}

}
