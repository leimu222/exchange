package com.common.api.service;

import java.util.List;

import com.common.api.model.contractExchangeOrderTigger;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:03
 * Description: [contractBiz服务]
 */
public interface IContractExchangeOrderTiggerBizService {

	/**
	* 查询contract
	*
	* @param orderId contractID
	* @return contract
	*/
	public ContractExchangeOrderTigger selectContractExchangeOrderTiggerById(Long orderId);

	/**
	* 查询contract列表
	*
	* @param contractExchangeOrderTigger contract
	* @return contract集合
	*/
	public List<ContractExchangeOrderTigger> selectContractExchangeOrderTiggerList(ContractExchangeOrderTigger contractExchangeOrderTigger);

	/**
	* 新增contract
	*
	* @param contractExchangeOrderTigger contract
	* @return 结果
	*/
	public int insertContractExchangeOrderTigger(ContractExchangeOrderTigger contractExchangeOrderTigger);

	/**
	* 修改contract
	*
	* @param contractExchangeOrderTigger contract
	* @return 结果
	*/
	public int updateContractExchangeOrderTigger(ContractExchangeOrderTigger contractExchangeOrderTigger);

	/**
	* 批量删除contract
	*
	* @param orderIds 需要删除的contractID
	* @return 结果
	*/
	public int deleteContractExchangeOrderTiggerByIds(Long[] orderIds);

	/**
	* 删除contract信息
	*
	* @param orderId contractID
	* @return 结果
	*/
	public int deleteContractExchangeOrderTiggerById(Long orderId);
	
}
