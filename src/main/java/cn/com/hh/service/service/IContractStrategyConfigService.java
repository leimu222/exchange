package com.common.api.service;

import java.util.List;

import com.common.api.model.contractStrategyConfig;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:03
 * Description: [contract服务]
 */
public interface IContractStrategyConfigService {

	/**
	* 查询contract
	*
	* @param id contractID
	* @return contract
	*/
	public ContractStrategyConfig selectContractStrategyConfigById(Long id);

	/**
	* 查询contract列表
	*
	* @param contractStrategyConfig contract
	* @return contract集合
	*/
	public List<ContractStrategyConfig> selectContractStrategyConfigList(ContractStrategyConfig contractStrategyConfig);

	/**
	* 新增contract
	*
	* @param contractStrategyConfig contract
	* @return 结果
	*/
	public int insertContractStrategyConfig(ContractStrategyConfig contractStrategyConfig);

	/**
	* 修改contract
	*
	* @param contractStrategyConfig contract
	* @return 结果
	*/
	public int updateContractStrategyConfig(ContractStrategyConfig contractStrategyConfig);

	/**
	* 批量删除contract
	*
	* @param ids 需要删除的contractID
	* @return 结果
	*/
	public int deleteContractStrategyConfigByIds(Long[] ids);

	/**
	* 删除contract信息
	*
	* @param id contractID
	* @return 结果
	*/
	public int deleteContractStrategyConfigById(Long id);
	
}
