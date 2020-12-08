package com.common.api.mapper;

import com.common.api.model.ContractRobotSymbolConfig;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:03
  * Description: [contract服务实现]
 */
public interface ContractRobotSymbolConfigMapper{

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
	* 删除contract
	*
	* @param symbol contractID
	* @return 结果
	*/
	public int deleteContractRobotSymbolConfigById(String symbol);

	/**
	* 批量删除contract
	*
	* @param symbols 需要删除的数据ID
	* @return 结果
	*/
	public int deleteContractRobotSymbolConfigByIds(String[] symbols);

}
