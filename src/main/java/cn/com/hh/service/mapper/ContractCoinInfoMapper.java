package com.common.api.mapper;

import com.common.api.model.ContractCoinInfo;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:02
  * Description: [contract服务实现]
 */
public interface ContractCoinInfoMapper{

	/**
	* 查询contract
	*
	* @param id contractID
	* @return contract
	*/
	public ContractCoinInfo selectContractCoinInfoById(Integer id);

	/**
	* 查询contract列表
	*
	* @param contractCoinInfo contract
	* @return contract集合
	*/
	public List<ContractCoinInfo> selectContractCoinInfoList(ContractCoinInfo contractCoinInfo);

	/**
	* 新增contract
	*
	* @param contractCoinInfo contract
	* @return 结果
	*/
	public int insertContractCoinInfo(ContractCoinInfo contractCoinInfo);

	/**
	* 修改contract
	*
	* @param contractCoinInfo contract
	* @return 结果
	*/
	public int updateContractCoinInfo(ContractCoinInfo contractCoinInfo);

	/**
	* 删除contract
	*
	* @param id contractID
	* @return 结果
	*/
	public int deleteContractCoinInfoById(Integer id);

	/**
	* 批量删除contract
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteContractCoinInfoByIds(Integer[] ids);

}
