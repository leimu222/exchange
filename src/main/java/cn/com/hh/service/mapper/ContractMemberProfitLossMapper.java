package com.common.api.mapper;

import com.common.api.model.ContractMemberProfitLoss;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:03
  * Description: [contract服务实现]
 */
public interface ContractMemberProfitLossMapper{

	/**
	* 查询contract
	*
	* @param id contractID
	* @return contract
	*/
	public ContractMemberProfitLoss selectContractMemberProfitLossById(Long id);

	/**
	* 查询contract列表
	*
	* @param contractMemberProfitLoss contract
	* @return contract集合
	*/
	public List<ContractMemberProfitLoss> selectContractMemberProfitLossList(ContractMemberProfitLoss contractMemberProfitLoss);

	/**
	* 新增contract
	*
	* @param contractMemberProfitLoss contract
	* @return 结果
	*/
	public int insertContractMemberProfitLoss(ContractMemberProfitLoss contractMemberProfitLoss);

	/**
	* 修改contract
	*
	* @param contractMemberProfitLoss contract
	* @return 结果
	*/
	public int updateContractMemberProfitLoss(ContractMemberProfitLoss contractMemberProfitLoss);

	/**
	* 删除contract
	*
	* @param id contractID
	* @return 结果
	*/
	public int deleteContractMemberProfitLossById(Long id);

	/**
	* 批量删除contract
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteContractMemberProfitLossByIds(Long[] ids);

}
