package com.common.api.mapper;

import com.common.api.model.ContractDoubleExchangeConfig;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:03
  * Description: [contract服务实现]
 */
public interface ContractDoubleExchangeConfigMapper{

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
	* 删除contract
	*
	* @param id contractID
	* @return 结果
	*/
	public int deleteContractDoubleExchangeConfigById(Long id);

	/**
	* 批量删除contract
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteContractDoubleExchangeConfigByIds(Long[] ids);

}
