package com.common.api.mapper;

import com.common.api.model.ContractExchangeOrderClose;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:03
  * Description: [contract服务实现]
 */
public interface ContractExchangeOrderCloseMapper{

	/**
	* 查询contract
	*
	* @param orderId contractID
	* @return contract
	*/
	public ContractExchangeOrderClose selectContractExchangeOrderCloseById(Long orderId);

	/**
	* 查询contract列表
	*
	* @param contractExchangeOrderClose contract
	* @return contract集合
	*/
	public List<ContractExchangeOrderClose> selectContractExchangeOrderCloseList(ContractExchangeOrderClose contractExchangeOrderClose);

	/**
	* 新增contract
	*
	* @param contractExchangeOrderClose contract
	* @return 结果
	*/
	public int insertContractExchangeOrderClose(ContractExchangeOrderClose contractExchangeOrderClose);

	/**
	* 修改contract
	*
	* @param contractExchangeOrderClose contract
	* @return 结果
	*/
	public int updateContractExchangeOrderClose(ContractExchangeOrderClose contractExchangeOrderClose);

	/**
	* 删除contract
	*
	* @param orderId contractID
	* @return 结果
	*/
	public int deleteContractExchangeOrderCloseById(Long orderId);

	/**
	* 批量删除contract
	*
	* @param orderIds 需要删除的数据ID
	* @return 结果
	*/
	public int deleteContractExchangeOrderCloseByIds(Long[] orderIds);

}
