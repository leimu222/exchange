package com.common.api.mapper;

import com.common.api.model.DepositTypeInfo;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:04
  * Description: [deposit服务实现]
 */
public interface DepositTypeInfoMapper{

	/**
	* 查询deposit
	*
	* @param id depositID
	* @return deposit
	*/
	public DepositTypeInfo selectDepositTypeInfoById(Integer id);

	/**
	* 查询deposit列表
	*
	* @param depositTypeInfo deposit
	* @return deposit集合
	*/
	public List<DepositTypeInfo> selectDepositTypeInfoList(DepositTypeInfo depositTypeInfo);

	/**
	* 新增deposit
	*
	* @param depositTypeInfo deposit
	* @return 结果
	*/
	public int insertDepositTypeInfo(DepositTypeInfo depositTypeInfo);

	/**
	* 修改deposit
	*
	* @param depositTypeInfo deposit
	* @return 结果
	*/
	public int updateDepositTypeInfo(DepositTypeInfo depositTypeInfo);

	/**
	* 删除deposit
	*
	* @param id depositID
	* @return 结果
	*/
	public int deleteDepositTypeInfoById(Integer id);

	/**
	* 批量删除deposit
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteDepositTypeInfoByIds(Integer[] ids);

}
