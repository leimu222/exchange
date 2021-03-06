package com.common.api.service;

import java.util.List;

import com.common.api.model.contractRobotPinStrategy;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:03
 * Description: [contract服务]
 */
public interface IContractRobotPinStrategyService {

	/**
	* 查询contract
	*
	* @param id contractID
	* @return contract
	*/
	public ContractRobotPinStrategy selectContractRobotPinStrategyById(Long id);

	/**
	* 查询contract列表
	*
	* @param contractRobotPinStrategy contract
	* @return contract集合
	*/
	public List<ContractRobotPinStrategy> selectContractRobotPinStrategyList(ContractRobotPinStrategy contractRobotPinStrategy);

	/**
	* 新增contract
	*
	* @param contractRobotPinStrategy contract
	* @return 结果
	*/
	public int insertContractRobotPinStrategy(ContractRobotPinStrategy contractRobotPinStrategy);

	/**
	* 修改contract
	*
	* @param contractRobotPinStrategy contract
	* @return 结果
	*/
	public int updateContractRobotPinStrategy(ContractRobotPinStrategy contractRobotPinStrategy);

	/**
	* 批量删除contract
	*
	* @param ids 需要删除的contractID
	* @return 结果
	*/
	public int deleteContractRobotPinStrategyByIds(Long[] ids);

	/**
	* 删除contract信息
	*
	* @param id contractID
	* @return 结果
	*/
	public int deleteContractRobotPinStrategyById(Long id);
	
}
