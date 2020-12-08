package com.common.api.mapper;

import com.common.api.model.PlatformTransaction;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:08
  * Description: [platform服务实现]
 */
public interface PlatformTransactionMapper{

	/**
	* 查询platform
	*
	* @param id platformID
	* @return platform
	*/
	public PlatformTransaction selectPlatformTransactionById(Long id);

	/**
	* 查询platform列表
	*
	* @param platformTransaction platform
	* @return platform集合
	*/
	public List<PlatformTransaction> selectPlatformTransactionList(PlatformTransaction platformTransaction);

	/**
	* 新增platform
	*
	* @param platformTransaction platform
	* @return 结果
	*/
	public int insertPlatformTransaction(PlatformTransaction platformTransaction);

	/**
	* 修改platform
	*
	* @param platformTransaction platform
	* @return 结果
	*/
	public int updatePlatformTransaction(PlatformTransaction platformTransaction);

	/**
	* 删除platform
	*
	* @param id platformID
	* @return 结果
	*/
	public int deletePlatformTransactionById(Long id);

	/**
	* 批量删除platform
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deletePlatformTransactionByIds(Long[] ids);

}
