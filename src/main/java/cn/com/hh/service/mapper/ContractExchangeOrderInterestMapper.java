package com.common.api.mapper;

import com.common.api.model.ContractExchangeOrderInterest;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:03
  * Description: [contract服务实现]
 */
public interface ContractExchangeOrderInterestMapper{

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
	* 删除contract
	*
	* @param id contractID
	* @return 结果
	*/
	public int deleteContractExchangeOrderInterestById(Long id);

	/**
	* 批量删除contract
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteContractExchangeOrderInterestByIds(Long[] ids);

}
