package com.common.api.service;

import java.util.List;

import com.common.api.model.contractDoubleExchangeConfig;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:03
 * Description: [contractBiz服务]
 */
public interface IContractDoubleExchangeConfigBizService {

	/**
	* 查询contract
	*
	* @param id contractID
	* @return contract
	*/
	public ContractDoubleExchangeConfig selectContractDoubleExchangeConfigById(Long id);

	/**
	* 查询contract列表
	*
	* @param contractDoubleExchangeConfig contract
	* @return contract集合
	*/
	public List<ContractDoubleExchangeConfig> selectContractDoubleExchangeConfigList(ContractDoubleExchangeConfig contractDoubleExchangeConfig);

	/**
	* 新增contract
	*
	* @param contractDoubleExchangeConfig contract
	* @return 结果
	*/
	public int insertContractDoubleExchangeConfig(ContractDoubleExchangeConfig contractDoubleExchangeConfig);

	/**
	* 修改contract
	*
	* @param contractDoubleExchangeConfig contract
	* @return 结果
	*/
	public int updateContractDoubleExchangeConfig(ContractDoubleExchangeConfig contractDoubleExchangeConfig);

	/**
	* 批量删除contract
	*
	* @param ids 需要删除的contractID
	* @return 结果
	*/
	public int deleteContractDoubleExchangeConfigByIds(Long[] ids);

	/**
	* 删除contract信息
	*
	* @param id contractID
	* @return 结果
	*/
	public int deleteContractDoubleExchangeConfigById(Long id);
	
}
