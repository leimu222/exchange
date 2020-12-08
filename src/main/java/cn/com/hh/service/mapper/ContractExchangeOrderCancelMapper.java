package com.common.api.mapper;

import com.common.api.model.ContractExchangeOrderCancel;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:03
  * Description: [contract服务实现]
 */
public interface ContractExchangeOrderCancelMapper{

	/**
	* 查询contract
	*
	* @param orderId contractID
	* @return contract
	*/
	public ContractExchangeOrderCancel selectContractExchangeOrderCancelById(Long orderId);

	/**
	* 查询contract列表
	*
	* @param contractExchangeOrderCancel contract
	* @return contract集合
	*/
	public List<ContractExchangeOrderCancel> selectContractExchangeOrderCancelList(ContractExchangeOrderCancel contractExchangeOrderCancel);

	/**
	* 新增contract
	*
	* @param contractExchangeOrderCancel contract
	* @return 结果
	*/
	public int insertContractExchangeOrderCancel(ContractExchangeOrderCancel contractExchangeOrderCancel);

	/**
	* 修改contract
	*
	* @param contractExchangeOrderCancel contract
	* @return 结果
	*/
	public int updateContractExchangeOrderCancel(ContractExchangeOrderCancel contractExchangeOrderCancel);

	/**
	* 删除contract
	*
	* @param orderId contractID
	* @return 结果
	*/
	public int deleteContractExchangeOrderCancelById(Long orderId);

	/**
	* 批量删除contract
	*
	* @param orderIds 需要删除的数据ID
	* @return 结果
	*/
	public int deleteContractExchangeOrderCancelByIds(Long[] orderIds);

}
