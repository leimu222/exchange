package com.common.api.mapper;

import com.common.api.model.ContractDoubleDirectionOrderProfitInfo;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:03
  * Description: [contract服务实现]
 */
public interface ContractDoubleDirectionOrderProfitInfoMapper{

	/**
	* 查询contract
	*
	* @param id contractID
	* @return contract
	*/
	public ContractDoubleDirectionOrderProfitInfo selectContractDoubleDirectionOrderProfitInfoById(Long id);

	/**
	* 查询contract列表
	*
	* @param contractDoubleDirectionOrderProfitInfo contract
	* @return contract集合
	*/
	public List<ContractDoubleDirectionOrderProfitInfo> selectContractDoubleDirectionOrderProfitInfoList(ContractDoubleDirectionOrderProfitInfo contractDoubleDirectionOrderProfitInfo);

	/**
	* 新增contract
	*
	* @param contractDoubleDirectionOrderProfitInfo contract
	* @return 结果
	*/
	public int insertContractDoubleDirectionOrderProfitInfo(ContractDoubleDirectionOrderProfitInfo contractDoubleDirectionOrderProfitInfo);

	/**
	* 修改contract
	*
	* @param contractDoubleDirectionOrderProfitInfo contract
	* @return 结果
	*/
	public int updateContractDoubleDirectionOrderProfitInfo(ContractDoubleDirectionOrderProfitInfo contractDoubleDirectionOrderProfitInfo);

	/**
	* 删除contract
	*
	* @param id contractID
	* @return 结果
	*/
	public int deleteContractDoubleDirectionOrderProfitInfoById(Long id);

	/**
	* 批量删除contract
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteContractDoubleDirectionOrderProfitInfoByIds(Long[] ids);

}
