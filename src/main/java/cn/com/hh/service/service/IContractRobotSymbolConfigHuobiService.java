package com.common.api.service;

import java.util.List;

import com.common.api.model.contractRobotSymbolConfigHuobi;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:03
 * Description: [contract服务]
 */
public interface IContractRobotSymbolConfigHuobiService {

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
	* 批量删除contract
	*
	* @param symbols 需要删除的contractID
	* @return 结果
	*/
	public int deleteContractRobotSymbolConfigHuobiByIds(String[] symbols);

	/**
	* 删除contract信息
	*
	* @param symbol contractID
	* @return 结果
	*/
	public int deleteContractRobotSymbolConfigHuobiById(String symbol);
	
}
