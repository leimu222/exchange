package com.common.api.service;

import java.util.List;

import com.common.api.model.contractExchangeOrderCancel;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:03
 * Description: [contract服务]
 */
public interface IContractExchangeOrderCancelService {

	/**
	* 查询contract
	*
	* @param orderId contractID
	* @return contract
	*/
	public ContractExchangeOrderCancel selectContractExchangeOrderCancelById(Long orderId);

	/**
	* 查询contract列表
	*
	* @param contractExchangeOrderCancel contract
	* @return contract集合
	*/
	public List<ContractExchangeOrderCancel> selectContractExchangeOrderCancelList(ContractExchangeOrderCancel contractExchangeOrderCancel);

	/**
	* 新增contract
	*
	* @param contractExchangeOrderCancel contract
	* @return 结果
	*/
	public int insertContractExchangeOrderCancel(ContractExchangeOrderCancel contractExchangeOrderCancel);

	/**
	* 修改contract
	*
	* @param contractExchangeOrderCancel contract
	* @return 结果
	*/
	public int updateContractExchangeOrderCancel(ContractExchangeOrderCancel contractExchangeOrderCancel);

	/**
	* 批量删除contract
	*
	* @param orderIds 需要删除的contractID
	* @return 结果
	*/
	public int deleteContractExchangeOrderCancelByIds(Long[] orderIds);

	/**
	* 删除contract信息
	*
	* @param orderId contractID
	* @return 结果
	*/
	public int deleteContractExchangeOrderCancelById(Long orderId);
	
}
