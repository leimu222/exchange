package com.common.api.mapper;

import com.common.api.model.ContractExchangeOrderCalculate;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:03
  * Description: [contract服务实现]
 */
public interface ContractExchangeOrderCalculateMapper{

	/**
	* 查询contract
	*
	* @param orderId contractID
	* @return contract
	*/
	public ContractExchangeOrderCalculate selectContractExchangeOrderCalculateById(Long orderId);

	/**
	* 查询contract列表
	*
	* @param contractExchangeOrderCalculate contract
	* @return contract集合
	*/
	public List<ContractExchangeOrderCalculate> selectContractExchangeOrderCalculateList(ContractExchangeOrderCalculate contractExchangeOrderCalculate);

	/**
	* 新增contract
	*
	* @param contractExchangeOrderCalculate contract
	* @return 结果
	*/
	public int insertContractExchangeOrderCalculate(ContractExchangeOrderCalculate contractExchangeOrderCalculate);

	/**
	* 修改contract
	*
	* @param contractExchangeOrderCalculate contract
	* @return 结果
	*/
	public int updateContractExchangeOrderCalculate(ContractExchangeOrderCalculate contractExchangeOrderCalculate);

	/**
	* 删除contract
	*
	* @param orderId contractID
	* @return 结果
	*/
	public int deleteContractExchangeOrderCalculateById(Long orderId);

	/**
	* 批量删除contract
	*
	* @param orderIds 需要删除的数据ID
	* @return 结果
	*/
	public int deleteContractExchangeOrderCalculateByIds(Long[] orderIds);

}
