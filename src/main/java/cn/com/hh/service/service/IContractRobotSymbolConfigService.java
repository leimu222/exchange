package com.common.api.service;

import java.util.List;

import com.common.api.model.contractRobotSymbolConfig;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:03
 * Description: [contract服务]
 */
public interface IContractRobotSymbolConfigService {

	/**
	* 查询contract
	*
	* @param symbol contractID
	* @return contract
	*/
	public ContractRobotSymbolConfig selectContractRobotSymbolConfigById(String symbol);

	/**
	* 查询contract列表
	*
	* @param contractRobotSymbolConfig contract
	* @return contract集合
	*/
	public List<ContractRobotSymbolConfig> selectContractRobotSymbolConfigList(ContractRobotSymbolConfig contractRobotSymbolConfig);

	/**
	* 新增contract
	*
	* @param contractRobotSymbolConfig contract
	* @return 结果
	*/
	public int insertContractRobotSymbolConfig(ContractRobotSymbolConfig contractRobotSymbolConfig);

	/**
	* 修改contract
	*
	* @param contractRobotSymbolConfig contract
	* @return 结果
	*/
	public int updateContractRobotSymbolConfig(ContractRobotSymbolConfig contractRobotSymbolConfig);

	/**
	* 批量删除contract
	*
	* @param symbols 需要删除的contractID
	* @return 结果
	*/
	public int deleteContractRobotSymbolConfigByIds(String[] symbols);

	/**
	* 删除contract信息
	*
	* @param symbol contractID
	* @return 结果
	*/
	public int deleteContractRobotSymbolConfigById(String symbol);
	
}
