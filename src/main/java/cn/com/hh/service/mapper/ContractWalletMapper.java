package com.common.api.mapper;

import com.common.api.model.ContractWallet;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:04
  * Description: [contract服务实现]
 */
public interface ContractWalletMapper{

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
	* 删除contract
	*
	* @param id contractID
	* @return 结果
	*/
	public int deleteContractWalletById(Long id);

	/**
	* 批量删除contract
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteContractWalletByIds(Long[] ids);

}
