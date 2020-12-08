package com.common.api.mapper;

import com.common.api.model.ContractConfig;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:02
  * Description: [contract服务实现]
 */
public interface ContractConfigMapper{

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
	* 删除contract
	*
	* @param configKey contractID
	* @return 结果
	*/
	public int deleteContractConfigById(String configKey);

	/**
	* 批量删除contract
	*
	* @param configKeys 需要删除的数据ID
	* @return 结果
	*/
	public int deleteContractConfigByIds(String[] configKeys);

}
