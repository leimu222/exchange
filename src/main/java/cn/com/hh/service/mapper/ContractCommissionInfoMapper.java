package com.common.api.mapper;

import com.common.api.model.ContractCommissionInfo;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:02
  * Description: [contract服务实现]
 */
public interface ContractCommissionInfoMapper{

	/**
	* 查询contract
	*
	* @param id contractID
	* @return contract
	*/
	public ContractCommissionInfo selectContractCommissionInfoById(Integer id);

	/**
	* 查询contract列表
	*
	* @param contractCommissionInfo contract
	* @return contract集合
	*/
	public List<ContractCommissionInfo> selectContractCommissionInfoList(ContractCommissionInfo contractCommissionInfo);

	/**
	* 新增contract
	*
	* @param contractCommissionInfo contract
	* @return 结果
	*/
	public int insertContractCommissionInfo(ContractCommissionInfo contractCommissionInfo);

	/**
	* 修改contract
	*
	* @param contractCommissionInfo contract
	* @return 结果
	*/
	public int updateContractCommissionInfo(ContractCommissionInfo contractCommissionInfo);

	/**
	* 删除contract
	*
	* @param id contractID
	* @return 结果
	*/
	public int deleteContractCommissionInfoById(Integer id);

	/**
	* 批量删除contract
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteContractCommissionInfoByIds(Integer[] ids);

}
