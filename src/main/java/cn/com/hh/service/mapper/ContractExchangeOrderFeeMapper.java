package com.common.api.mapper;

import com.common.api.model.ContractExchangeOrderFee;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:03
  * Description: [contract服务实现]
 */
public interface ContractExchangeOrderFeeMapper{

	/**
	* 查询contract
	*
	* @param orderId contractID
	* @return contract
	*/
	public ContractExchangeOrderFee selectContractExchangeOrderFeeById(Long orderId);

	/**
	* 查询contract列表
	*
	* @param contractExchangeOrderFee contract
	* @return contract集合
	*/
	public List<ContractExchangeOrderFee> selectContractExchangeOrderFeeList(ContractExchangeOrderFee contractExchangeOrderFee);

	/**
	* 新增contract
	*
	* @param contractExchangeOrderFee contract
	* @return 结果
	*/
	public int insertContractExchangeOrderFee(ContractExchangeOrderFee contractExchangeOrderFee);

	/**
	* 修改contract
	*
	* @param contractExchangeOrderFee contract
	* @return 结果
	*/
	public int updateContractExchangeOrderFee(ContractExchangeOrderFee contractExchangeOrderFee);

	/**
	* 删除contract
	*
	* @param orderId contractID
	* @return 结果
	*/
	public int deleteContractExchangeOrderFeeById(Long orderId);

	/**
	* 批量删除contract
	*
	* @param orderIds 需要删除的数据ID
	* @return 结果
	*/
	public int deleteContractExchangeOrderFeeByIds(Long[] orderIds);

}
