package com.common.api.mapper;

import com.common.api.model.ContractRobotSymbolConfigHuobiBb;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:03
  * Description: [contract服务实现]
 */
public interface ContractRobotSymbolConfigHuobiBbMapper{

	/**
	* 查询contract
	*
	* @param symbol contractID
	* @return contract
	*/
	public ContractRobotSymbolConfigHuobiBb selectContractRobotSymbolConfigHuobiBbById(String symbol);

	/**
	* 查询contract列表
	*
	* @param contractRobotSymbolConfigHuobiBb contract
	* @return contract集合
	*/
	public List<ContractRobotSymbolConfigHuobiBb> selectContractRobotSymbolConfigHuobiBbList(ContractRobotSymbolConfigHuobiBb contractRobotSymbolConfigHuobiBb);

	/**
	* 新增contract
	*
	* @param contractRobotSymbolConfigHuobiBb contract
	* @return 结果
	*/
	public int insertContractRobotSymbolConfigHuobiBb(ContractRobotSymbolConfigHuobiBb contractRobotSymbolConfigHuobiBb);

	/**
	* 修改contract
	*
	* @param contractRobotSymbolConfigHuobiBb contract
	* @return 结果
	*/
	public int updateContractRobotSymbolConfigHuobiBb(ContractRobotSymbolConfigHuobiBb contractRobotSymbolConfigHuobiBb);

	/**
	* 删除contract
	*
	* @param symbol contractID
	* @return 结果
	*/
	public int deleteContractRobotSymbolConfigHuobiBbById(String symbol);

	/**
	* 批量删除contract
	*
	* @param symbols 需要删除的数据ID
	* @return 结果
	*/
	public int deleteContractRobotSymbolConfigHuobiBbByIds(String[] symbols);

}
