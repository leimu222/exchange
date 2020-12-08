package com.common.api.mapper;

import com.common.api.model.ContractStrategyConfig;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:03
  * Description: [contract服务实现]
 */
public interface ContractStrategyConfigMapper{

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
	* 删除contract
	*
	* @param id contractID
	* @return 结果
	*/
	public int deleteContractStrategyConfigById(Long id);

	/**
	* 批量删除contract
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteContractStrategyConfigByIds(Long[] ids);

}
