package com.common.api.mapper;

import com.common.api.model.ContractRobotPinStrategy;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:03
  * Description: [contract服务实现]
 */
public interface ContractRobotPinStrategyMapper{

	/**
	* 查询contract
	*
	* @param id contractID
	* @return contract
	*/
	public ContractRobotPinStrategy selectContractRobotPinStrategyById(Long id);

	/**
	* 查询contract列表
	*
	* @param contractRobotPinStrategy contract
	* @return contract集合
	*/
	public List<ContractRobotPinStrategy> selectContractRobotPinStrategyList(ContractRobotPinStrategy contractRobotPinStrategy);

	/**
	* 新增contract
	*
	* @param contractRobotPinStrategy contract
	* @return 结果
	*/
	public int insertContractRobotPinStrategy(ContractRobotPinStrategy contractRobotPinStrategy);

	/**
	* 修改contract
	*
	* @param contractRobotPinStrategy contract
	* @return 结果
	*/
	public int updateContractRobotPinStrategy(ContractRobotPinStrategy contractRobotPinStrategy);

	/**
	* 删除contract
	*
	* @param id contractID
	* @return 结果
	*/
	public int deleteContractRobotPinStrategyById(Long id);

	/**
	* 批量删除contract
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteContractRobotPinStrategyByIds(Long[] ids);

}
