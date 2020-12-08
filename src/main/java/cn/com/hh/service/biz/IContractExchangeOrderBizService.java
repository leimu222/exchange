package com.common.api.service;

import java.util.List;

import com.common.api.model.contractExchangeOrder;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:03
 * Description: [contractBiz服务]
 */
public interface IContractExchangeOrderBizService {

	/**
	* 查询contract
	*
	* @param id contractID
	* @return contract
	*/
	public ContractExchangeOrder selectContractExchangeOrderById(Long id);

	/**
	* 查询contract列表
	*
	* @param contractExchangeOrder contract
	* @return contract集合
	*/
	public List<ContractExchangeOrder> selectContractExchangeOrderList(ContractExchangeOrder contractExchangeOrder);

	/**
	* 新增contract
	*
	* @param contractExchangeOrder contract
	* @return 结果
	*/
	public int insertContractExchangeOrder(ContractExchangeOrder contractExchangeOrder);

	/**
	* 修改contract
	*
	* @param contractExchangeOrder contract
	* @return 结果
	*/
	public int updateContractExchangeOrder(ContractExchangeOrder contractExchangeOrder);

	/**
	* 批量删除contract
	*
	* @param ids 需要删除的contractID
	* @return 结果
	*/
	public int deleteContractExchangeOrderByIds(Long[] ids);

	/**
	* 删除contract信息
	*
	* @param id contractID
	* @return 结果
	*/
	public int deleteContractExchangeOrderById(Long id);
	
}
