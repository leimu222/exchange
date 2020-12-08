package com.common.api.service;

import java.util.List;

import com.common.api.model.contractExchangeOrderInterest;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:03
 * Description: [contractBiz服务]
 */
public interface IContractExchangeOrderInterestBizService {

	/**
	* 查询contract
	*
	* @param id contractID
	* @return contract
	*/
	public ContractExchangeOrderInterest selectContractExchangeOrderInterestById(Long id);

	/**
	* 查询contract列表
	*
	* @param contractExchangeOrderInterest contract
	* @return contract集合
	*/
	public List<ContractExchangeOrderInterest> selectContractExchangeOrderInterestList(ContractExchangeOrderInterest contractExchangeOrderInterest);

	/**
	* 新增contract
	*
	* @param contractExchangeOrderInterest contract
	* @return 结果
	*/
	public int insertContractExchangeOrderInterest(ContractExchangeOrderInterest contractExchangeOrderInterest);

	/**
	* 修改contract
	*
	* @param contractExchangeOrderInterest contract
	* @return 结果
	*/
	public int updateContractExchangeOrderInterest(ContractExchangeOrderInterest contractExchangeOrderInterest);

	/**
	* 批量删除contract
	*
	* @param ids 需要删除的contractID
	* @return 结果
	*/
	public int deleteContractExchangeOrderInterestByIds(Long[] ids);

	/**
	* 删除contract信息
	*
	* @param id contractID
	* @return 结果
	*/
	public int deleteContractExchangeOrderInterestById(Long id);
	
}
