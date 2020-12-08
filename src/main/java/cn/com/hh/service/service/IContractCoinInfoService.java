package com.common.api.service;

import java.util.List;

import com.common.api.model.contractCoinInfo;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:02
 * Description: [contract服务]
 */
public interface IContractCoinInfoService {

	/**
	* 查询contract
	*
	* @param id contractID
	* @return contract
	*/
	public ContractCoinInfo selectContractCoinInfoById(Integer id);

	/**
	* 查询contract列表
	*
	* @param contractCoinInfo contract
	* @return contract集合
	*/
	public List<ContractCoinInfo> selectContractCoinInfoList(ContractCoinInfo contractCoinInfo);

	/**
	* 新增contract
	*
	* @param contractCoinInfo contract
	* @return 结果
	*/
	public int insertContractCoinInfo(ContractCoinInfo contractCoinInfo);

	/**
	* 修改contract
	*
	* @param contractCoinInfo contract
	* @return 结果
	*/
	public int updateContractCoinInfo(ContractCoinInfo contractCoinInfo);

	/**
	* 批量删除contract
	*
	* @param ids 需要删除的contractID
	* @return 结果
	*/
	public int deleteContractCoinInfoByIds(Integer[] ids);

	/**
	* 删除contract信息
	*
	* @param id contractID
	* @return 结果
	*/
	public int deleteContractCoinInfoById(Integer id);
	
}
