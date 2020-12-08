package com.common.api.service;

import java.util.List;

import com.common.api.model.contractRobotSymbolConfigHuobiBb;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:03
 * Description: [contract服务]
 */
public interface IContractRobotSymbolConfigHuobiBbService {

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
	* 批量删除contract
	*
	* @param symbols 需要删除的contractID
	* @return 结果
	*/
	public int deleteContractRobotSymbolConfigHuobiBbByIds(String[] symbols);

	/**
	* 删除contract信息
	*
	* @param symbol contractID
	* @return 结果
	*/
	public int deleteContractRobotSymbolConfigHuobiBbById(String symbol);
	
}
