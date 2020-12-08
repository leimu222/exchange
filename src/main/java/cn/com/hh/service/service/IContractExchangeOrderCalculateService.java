package com.common.api.service;

import java.util.List;

import com.common.api.model.contractExchangeOrderCalculate;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:03
 * Description: [contract服务]
 */
public interface IContractExchangeOrderCalculateService {

	/**
	* 查询contract
	*
	* @param orderId contractID
	* @return contract
	*/
	public ContractExchangeOrderCalculate selectContractExchangeOrderCalculateById(Long orderId);

	/**
	* 查询contract列表
	*
	* @param contractExchangeOrderCalculate contract
	* @return contract集合
	*/
	public List<ContractExchangeOrderCalculate> selectContractExchangeOrderCalculateList(ContractExchangeOrderCalculate contractExchangeOrderCalculate);

	/**
	* 新增contract
	*
	* @param contractExchangeOrderCalculate contract
	* @return 结果
	*/
	public int insertContractExchangeOrderCalculate(ContractExchangeOrderCalculate contractExchangeOrderCalculate);

	/**
	* 修改contract
	*
	* @param contractExchangeOrderCalculate contract
	* @return 结果
	*/
	public int updateContractExchangeOrderCalculate(ContractExchangeOrderCalculate contractExchangeOrderCalculate);

	/**
	* 批量删除contract
	*
	* @param orderIds 需要删除的contractID
	* @return 结果
	*/
	public int deleteContractExchangeOrderCalculateByIds(Long[] orderIds);

	/**
	* 删除contract信息
	*
	* @param orderId contractID
	* @return 结果
	*/
	public int deleteContractExchangeOrderCalculateById(Long orderId);
	
}
