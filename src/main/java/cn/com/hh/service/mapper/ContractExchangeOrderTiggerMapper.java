package com.common.api.mapper;

import com.common.api.model.ContractExchangeOrderTigger;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:03
  * Description: [contract服务实现]
 */
public interface ContractExchangeOrderTiggerMapper{

	/**
	* 查询contract
	*
	* @param orderId contractID
	* @return contract
	*/
	public ContractExchangeOrderTigger selectContractExchangeOrderTiggerById(Long orderId);

	/**
	* 查询contract列表
	*
	* @param contractExchangeOrderTigger contract
	* @return contract集合
	*/
	public List<ContractExchangeOrderTigger> selectContractExchangeOrderTiggerList(ContractExchangeOrderTigger contractExchangeOrderTigger);

	/**
	* 新增contract
	*
	* @param contractExchangeOrderTigger contract
	* @return 结果
	*/
	public int insertContractExchangeOrderTigger(ContractExchangeOrderTigger contractExchangeOrderTigger);

	/**
	* 修改contract
	*
	* @param contractExchangeOrderTigger contract
	* @return 结果
	*/
	public int updateContractExchangeOrderTigger(ContractExchangeOrderTigger contractExchangeOrderTigger);

	/**
	* 删除contract
	*
	* @param orderId contractID
	* @return 结果
	*/
	public int deleteContractExchangeOrderTiggerById(Long orderId);

	/**
	* 批量删除contract
	*
	* @param orderIds 需要删除的数据ID
	* @return 结果
	*/
	public int deleteContractExchangeOrderTiggerByIds(Long[] orderIds);

}
