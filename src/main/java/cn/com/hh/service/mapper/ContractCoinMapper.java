package com.common.api.mapper;

import com.common.api.model.ContractCoin;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:02
  * Description: [contract服务实现]
 */
public interface ContractCoinMapper{

	/**
	* 查询contract
	*
	* @param id contractID
	* @return contract
	*/
	public ContractCoin selectContractCoinById(Long id);

	/**
	* 查询contract列表
	*
	* @param contractCoin contract
	* @return contract集合
	*/
	public List<ContractCoin> selectContractCoinList(ContractCoin contractCoin);

	/**
	* 新增contract
	*
	* @param contractCoin contract
	* @return 结果
	*/
	public int insertContractCoin(ContractCoin contractCoin);

	/**
	* 修改contract
	*
	* @param contractCoin contract
	* @return 结果
	*/
	public int updateContractCoin(ContractCoin contractCoin);

	/**
	* 删除contract
	*
	* @param id contractID
	* @return 结果
	*/
	public int deleteContractCoinById(Long id);

	/**
	* 批量删除contract
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteContractCoinByIds(Long[] ids);

}
