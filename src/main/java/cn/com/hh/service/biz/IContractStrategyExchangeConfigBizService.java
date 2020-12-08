package com.common.api.service;

import java.util.List;

import com.common.api.model.contractStrategyExchangeConfig;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:04
 * Description: [contractBiz服务]
 */
public interface IContractStrategyExchangeConfigBizService {

	/**
	* 查询contract
	*
	* @param id contractID
	* @return contract
	*/
	public ContractStrategyExchangeConfig selectContractStrategyExchangeConfigById(Long id);

	/**
	* 查询contract列表
	*
	* @param contractStrategyExchangeConfig contract
	* @return contract集合
	*/
	public List<ContractStrategyExchangeConfig> selectContractStrategyExchangeConfigList(ContractStrategyExchangeConfig contractStrategyExchangeConfig);

	/**
	* 新增contract
	*
	* @param contractStrategyExchangeConfig contract
	* @return 结果
	*/
	public int insertContractStrategyExchangeConfig(ContractStrategyExchangeConfig contractStrategyExchangeConfig);

	/**
	* 修改contract
	*
	* @param contractStrategyExchangeConfig contract
	* @return 结果
	*/
	public int updateContractStrategyExchangeConfig(ContractStrategyExchangeConfig contractStrategyExchangeConfig);

	/**
	* 批量删除contract
	*
	* @param ids 需要删除的contractID
	* @return 结果
	*/
	public int deleteContractStrategyExchangeConfigByIds(Long[] ids);

	/**
	* 删除contract信息
	*
	* @param id contractID
	* @return 结果
	*/
	public int deleteContractStrategyExchangeConfigById(Long id);
	
}
