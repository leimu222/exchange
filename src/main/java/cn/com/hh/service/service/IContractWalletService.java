package com.common.api.service;

import java.util.List;

import com.common.api.model.contractWallet;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:04
 * Description: [contract服务]
 */
public interface IContractWalletService {

	/**
	* 查询contract
	*
	* @param id contractID
	* @return contract
	*/
	public ContractWallet selectContractWalletById(Long id);

	/**
	* 查询contract列表
	*
	* @param contractWallet contract
	* @return contract集合
	*/
	public List<ContractWallet> selectContractWalletList(ContractWallet contractWallet);

	/**
	* 新增contract
	*
	* @param contractWallet contract
	* @return 结果
	*/
	public int insertContractWallet(ContractWallet contractWallet);

	/**
	* 修改contract
	*
	* @param contractWallet contract
	* @return 结果
	*/
	public int updateContractWallet(ContractWallet contractWallet);

	/**
	* 批量删除contract
	*
	* @param ids 需要删除的contractID
	* @return 结果
	*/
	public int deleteContractWalletByIds(Long[] ids);

	/**
	* 删除contract信息
	*
	* @param id contractID
	* @return 结果
	*/
	public int deleteContractWalletById(Long id);
	
}
