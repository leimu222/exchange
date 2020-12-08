package com.common.api.service;

import java.util.List;

import com.common.api.model.contractConfig;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:02
 * Description: [contractBiz服务]
 */
public interface IContractConfigBizService {

	/**
	* 查询contract
	*
	* @param configKey contractID
	* @return contract
	*/
	public ContractConfig selectContractConfigById(String configKey);

	/**
	* 查询contract列表
	*
	* @param contractConfig contract
	* @return contract集合
	*/
	public List<ContractConfig> selectContractConfigList(ContractConfig contractConfig);

	/**
	* 新增contract
	*
	* @param contractConfig contract
	* @return 结果
	*/
	public int insertContractConfig(ContractConfig contractConfig);

	/**
	* 修改contract
	*
	* @param contractConfig contract
	* @return 结果
	*/
	public int updateContractConfig(ContractConfig contractConfig);

	/**
	* 批量删除contract
	*
	* @param configKeys 需要删除的contractID
	* @return 结果
	*/
	public int deleteContractConfigByIds(String[] configKeys);

	/**
	* 删除contract信息
	*
	* @param configKey contractID
	* @return 结果
	*/
	public int deleteContractConfigById(String configKey);
	
}
