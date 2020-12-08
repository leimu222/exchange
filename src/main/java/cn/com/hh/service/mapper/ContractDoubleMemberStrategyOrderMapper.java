package com.common.api.mapper;

import com.common.api.model.ContractDoubleMemberStrategyOrder;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:03
  * Description: [contract服务实现]
 */
public interface ContractDoubleMemberStrategyOrderMapper{

	/**
	* 查询contract
	*
	* @param id contractID
	* @return contract
	*/
	public ContractDoubleMemberStrategyOrder selectContractDoubleMemberStrategyOrderById(Long id);

	/**
	* 查询contract列表
	*
	* @param contractDoubleMemberStrategyOrder contract
	* @return contract集合
	*/
	public List<ContractDoubleMemberStrategyOrder> selectContractDoubleMemberStrategyOrderList(ContractDoubleMemberStrategyOrder contractDoubleMemberStrategyOrder);

	/**
	* 新增contract
	*
	* @param contractDoubleMemberStrategyOrder contract
	* @return 结果
	*/
	public int insertContractDoubleMemberStrategyOrder(ContractDoubleMemberStrategyOrder contractDoubleMemberStrategyOrder);

	/**
	* 修改contract
	*
	* @param contractDoubleMemberStrategyOrder contract
	* @return 结果
	*/
	public int updateContractDoubleMemberStrategyOrder(ContractDoubleMemberStrategyOrder contractDoubleMemberStrategyOrder);

	/**
	* 删除contract
	*
	* @param id contractID
	* @return 结果
	*/
	public int deleteContractDoubleMemberStrategyOrderById(Long id);

	/**
	* 批量删除contract
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteContractDoubleMemberStrategyOrderByIds(Long[] ids);

}
