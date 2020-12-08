package com.common.api.service;

import java.util.List;

import com.common.api.model.contractDoubleMemberStrategyOrder;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:03
 * Description: [contract服务]
 */
public interface IContractDoubleMemberStrategyOrderService {

	/**
	* 查询contract
	*
	* @param id contractID
	* @return contract
	*/
	public ContractDoubleMemberStrategyOrder selectContractDoubleMemberStrategyOrderById(Long id);

	/**
	* 查询contract列表
	*
	* @param contractDoubleMemberStrategyOrder contract
	* @return contract集合
	*/
	public List<ContractDoubleMemberStrategyOrder> selectContractDoubleMemberStrategyOrderList(ContractDoubleMemberStrategyOrder contractDoubleMemberStrategyOrder);

	/**
	* 新增contract
	*
	* @param contractDoubleMemberStrategyOrder contract
	* @return 结果
	*/
	public int insertContractDoubleMemberStrategyOrder(ContractDoubleMemberStrategyOrder contractDoubleMemberStrategyOrder);

	/**
	* 修改contract
	*
	* @param contractDoubleMemberStrategyOrder contract
	* @return 结果
	*/
	public int updateContractDoubleMemberStrategyOrder(ContractDoubleMemberStrategyOrder contractDoubleMemberStrategyOrder);

	/**
	* 批量删除contract
	*
	* @param ids 需要删除的contractID
	* @return 结果
	*/
	public int deleteContractDoubleMemberStrategyOrderByIds(Long[] ids);

	/**
	* 删除contract信息
	*
	* @param id contractID
	* @return 结果
	*/
	public int deleteContractDoubleMemberStrategyOrderById(Long id);
	
}
