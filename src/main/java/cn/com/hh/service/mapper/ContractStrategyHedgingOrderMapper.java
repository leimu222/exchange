package com.common.api.mapper;

import com.common.api.model.ContractStrategyHedgingOrder;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:04
  * Description: [contract服务实现]
 */
public interface ContractStrategyHedgingOrderMapper{

	/**
	* 查询contract
	*
	* @param id contractID
	* @return contract
	*/
	public ContractStrategyHedgingOrder selectContractStrategyHedgingOrderById(Long id);

	/**
	* 查询contract列表
	*
	* @param contractStrategyHedgingOrder contract
	* @return contract集合
	*/
	public List<ContractStrategyHedgingOrder> selectContractStrategyHedgingOrderList(ContractStrategyHedgingOrder contractStrategyHedgingOrder);

	/**
	* 新增contract
	*
	* @param contractStrategyHedgingOrder contract
	* @return 结果
	*/
	public int insertContractStrategyHedgingOrder(ContractStrategyHedgingOrder contractStrategyHedgingOrder);

	/**
	* 修改contract
	*
	* @param contractStrategyHedgingOrder contract
	* @return 结果
	*/
	public int updateContractStrategyHedgingOrder(ContractStrategyHedgingOrder contractStrategyHedgingOrder);

	/**
	* 删除contract
	*
	* @param id contractID
	* @return 结果
	*/
	public int deleteContractStrategyHedgingOrderById(Long id);

	/**
	* 批量删除contract
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteContractStrategyHedgingOrderByIds(Long[] ids);

}
