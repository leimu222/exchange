package com.common.api.service;

import java.util.List;

import com.common.api.model.contractCoin;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:02
 * Description: [contract服务]
 */
public interface IContractCoinService {

	/**
	* 查询contract
	*
	* @param id contractID
	* @return contract
	*/
	public ContractCoin selectContractCoinById(Long id);

	/**
	* 查询contract列表
	*
	* @param contractCoin contract
	* @return contract集合
	*/
	public List<ContractCoin> selectContractCoinList(ContractCoin contractCoin);

	/**
	* 新增contract
	*
	* @param contractCoin contract
	* @return 结果
	*/
	public int insertContractCoin(ContractCoin contractCoin);

	/**
	* 修改contract
	*
	* @param contractCoin contract
	* @return 结果
	*/
	public int updateContractCoin(ContractCoin contractCoin);

	/**
	* 批量删除contract
	*
	* @param ids 需要删除的contractID
	* @return 结果
	*/
	public int deleteContractCoinByIds(Long[] ids);

	/**
	* 删除contract信息
	*
	* @param id contractID
	* @return 结果
	*/
	public int deleteContractCoinById(Long id);
	
}
