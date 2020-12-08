package com.common.api.mapper;

import com.common.api.model.ContractRobotSymbolConfigHuobi;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:03
  * Description: [contract服务实现]
 */
public interface ContractRobotSymbolConfigHuobiMapper{

	/**
	* 查询contract
	*
	* @param symbol contractID
	* @return contract
	*/
	public ContractRobotSymbolConfigHuobi selectContractRobotSymbolConfigHuobiById(String symbol);

	/**
	* 查询contract列表
	*
	* @param contractRobotSymbolConfigHuobi contract
	* @return contract集合
	*/
	public List<ContractRobotSymbolConfigHuobi> selectContractRobotSymbolConfigHuobiList(ContractRobotSymbolConfigHuobi contractRobotSymbolConfigHuobi);

	/**
	* 新增contract
	*
	* @param contractRobotSymbolConfigHuobi contract
	* @return 结果
	*/
	public int insertContractRobotSymbolConfigHuobi(ContractRobotSymbolConfigHuobi contractRobotSymbolConfigHuobi);

	/**
	* 修改contract
	*
	* @param contractRobotSymbolConfigHuobi contract
	* @return 结果
	*/
	public int updateContractRobotSymbolConfigHuobi(ContractRobotSymbolConfigHuobi contractRobotSymbolConfigHuobi);

	/**
	* 删除contract
	*
	* @param symbol contractID
	* @return 结果
	*/
	public int deleteContractRobotSymbolConfigHuobiById(String symbol);

	/**
	* 批量删除contract
	*
	* @param symbols 需要删除的数据ID
	* @return 结果
	*/
	public int deleteContractRobotSymbolConfigHuobiByIds(String[] symbols);

}
