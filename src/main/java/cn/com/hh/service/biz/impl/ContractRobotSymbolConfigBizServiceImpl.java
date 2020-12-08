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
 * Description: [contractBiz服务实现]
 */
@Service
public class ContractRobotSymbolConfigBizServiceImpl extends CommonService implements IContractRobotSymbolConfigBizService {
	@Autowired
	private IContractRobotSymbolConfigService contractRobotSymbolConfigService;

	/**
	* 查询contract
	*
	* @param symbol contractID
	* @return contract
	*/
	@Override
	public ContractRobotSymbolConfig selectContractRobotSymbolConfigById(String symbol) {
		return contractRobotSymbolConfigService.selectContractRobotSymbolConfigById(symbol);
	}

	/**
	* 查询contract列表
	*
	* @param contractRobotSymbolConfig contract
	* @return contract
	*/
	@Override
	public List<ContractRobotSymbolConfig> selectContractRobotSymbolConfigList(ContractRobotSymbolConfig contractRobotSymbolConfig) {
		return contractRobotSymbolConfigService.selectContractRobotSymbolConfigList(contractRobotSymbolConfig);
	}

	/**
	* 新增contract
	*
	* @param contractRobotSymbolConfig contract
	* @return 结果
	*/
	@Override
	public int insertContractRobotSymbolConfig(ContractRobotSymbolConfig contractRobotSymbolConfig) {
		return contractRobotSymbolConfigService.insertContractRobotSymbolConfig(contractRobotSymbolConfig);
	}

	/**
	* 修改contract
	*
	* @param contractRobotSymbolConfig contract
	* @return 结果
	*/
	@Override
	public int updateContractRobotSymbolConfig(ContractRobotSymbolConfig contractRobotSymbolConfig) {
		return contractRobotSymbolConfigService.updateContractRobotSymbolConfig(contractRobotSymbolConfig);
	}

	/**
	* 批量删除contract
	*
	* @param symbols 需要删除的contractID
	* @return 结果
	*/
	@Override
	public int deleteContractRobotSymbolConfigByIds(String[] symbols) {
		return contractRobotSymbolConfigService.deleteContractRobotSymbolConfigByIds(symbols);
	}

	/**
	* 删除contract信息
	*
	* @param symbol contractID
	* @return 结果
	*/
	@Override
	public int deleteContractRobotSymbolConfigById(String symbol) {
		return contractRobotSymbolConfigService.deleteContractRobotSymbolConfigById(symbol);
	}

}
