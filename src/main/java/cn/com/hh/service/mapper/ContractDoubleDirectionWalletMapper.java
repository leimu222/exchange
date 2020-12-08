package com.common.api.mapper;

import com.common.api.model.ContractDoubleDirectionWallet;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:03
  * Description: [contract服务实现]
 */
public interface ContractDoubleDirectionWalletMapper{

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
	* 删除contract
	*
	* @param id contractID
	* @return 结果
	*/
	public int deleteContractDoubleDirectionWalletById(Integer id);

	/**
	* 批量删除contract
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteContractDoubleDirectionWalletByIds(Integer[] ids);

}
