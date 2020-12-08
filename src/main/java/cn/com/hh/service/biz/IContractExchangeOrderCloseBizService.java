package com.common.api.service;

import java.util.List;

import com.common.api.model.contractExchangeOrderClose;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:03
 * Description: [contractBiz服务]
 */
public interface IContractExchangeOrderCloseBizService {

	/**
	* 查询contract
	*
	* @param orderId contractID
	* @return contract
	*/
	public ContractExchangeOrderClose selectContractExchangeOrderCloseById(Long orderId);

	/**
	* 查询contract列表
	*
	* @param contractExchangeOrderClose contract
	* @return contract集合
	*/
	public List<ContractExchangeOrderClose> selectContractExchangeOrderCloseList(ContractExchangeOrderClose contractExchangeOrderClose);

	/**
	* 新增contract
	*
	* @param contractExchangeOrderClose contract
	* @return 结果
	*/
	public int insertContractExchangeOrderClose(ContractExchangeOrderClose contractExchangeOrderClose);

	/**
	* 修改contract
	*
	* @param contractExchangeOrderClose contract
	* @return 结果
	*/
	public int updateContractExchangeOrderClose(ContractExchangeOrderClose contractExchangeOrderClose);

	/**
	* 批量删除contract
	*
	* @param orderIds 需要删除的contractID
	* @return 结果
	*/
	public int deleteContractExchangeOrderCloseByIds(Long[] orderIds);

	/**
	* 删除contract信息
	*
	* @param orderId contractID
	* @return 结果
	*/
	public int deleteContractExchangeOrderCloseById(Long orderId);
	
}
