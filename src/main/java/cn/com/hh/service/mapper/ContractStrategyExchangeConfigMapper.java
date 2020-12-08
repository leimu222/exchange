package com.common.api.mapper;

import com.common.api.model.ContractStrategyExchangeConfig;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:04
  * Description: [contract服务实现]
 */
public interface ContractStrategyExchangeConfigMapper{

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
	* 删除contract
	*
	* @param id contractID
	* @return 结果
	*/
	public int deleteContractStrategyExchangeConfigById(Long id);

	/**
	* 批量删除contract
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteContractStrategyExchangeConfigByIds(Long[] ids);

}
