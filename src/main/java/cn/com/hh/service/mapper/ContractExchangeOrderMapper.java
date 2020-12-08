package com.common.api.mapper;

import com.common.api.model.ContractExchangeOrder;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:03
  * Description: [contract服务实现]
 */
public interface ContractExchangeOrderMapper{

	/**
	* 查询contract
	*
	* @param id contractID
	* @return contract
	*/
	public ContractExchangeOrder selectContractExchangeOrderById(Long id);

	/**
	* 查询contract列表
	*
	* @param contractExchangeOrder contract
	* @return contract集合
	*/
	public List<ContractExchangeOrder> selectContractExchangeOrderList(ContractExchangeOrder contractExchangeOrder);

	/**
	* 新增contract
	*
	* @param contractExchangeOrder contract
	* @return 结果
	*/
	public int insertContractExchangeOrder(ContractExchangeOrder contractExchangeOrder);

	/**
	* 修改contract
	*
	* @param contractExchangeOrder contract
	* @return 结果
	*/
	public int updateContractExchangeOrder(ContractExchangeOrder contractExchangeOrder);

	/**
	* 删除contract
	*
	* @param id contractID
	* @return 结果
	*/
	public int deleteContractExchangeOrderById(Long id);

	/**
	* 批量删除contract
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteContractExchangeOrderByIds(Long[] ids);

}
