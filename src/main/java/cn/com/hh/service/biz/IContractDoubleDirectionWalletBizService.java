package com.common.api.service;

import java.util.List;

import com.common.api.model.contractDoubleDirectionWallet;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:03
 * Description: [contractBiz服务]
 */
public interface IContractDoubleDirectionWalletBizService {

	/**
	* 查询contract
	*
	* @param id contractID
	* @return contract
	*/
	public ContractDoubleDirectionWallet selectContractDoubleDirectionWalletById(Integer id);

	/**
	* 查询contract列表
	*
	* @param contractDoubleDirectionWallet contract
	* @return contract集合
	*/
	public List<ContractDoubleDirectionWallet> selectContractDoubleDirectionWalletList(ContractDoubleDirectionWallet contractDoubleDirectionWallet);

	/**
	* 新增contract
	*
	* @param contractDoubleDirectionWallet contract
	* @return 结果
	*/
	public int insertContractDoubleDirectionWallet(ContractDoubleDirectionWallet contractDoubleDirectionWallet);

	/**
	* 修改contract
	*
	* @param contractDoubleDirectionWallet contract
	* @return 结果
	*/
	public int updateContractDoubleDirectionWallet(ContractDoubleDirectionWallet contractDoubleDirectionWallet);

	/**
	* 批量删除contract
	*
	* @param ids 需要删除的contractID
	* @return 结果
	*/
	public int deleteContractDoubleDirectionWalletByIds(Integer[] ids);

	/**
	* 删除contract信息
	*
	* @param id contractID
	* @return 结果
	*/
	public int deleteContractDoubleDirectionWalletById(Integer id);
	
}
