package com.common.api.mapper;

import com.common.api.model.BusinessAuthDeposit;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:01
  * Description: [business服务实现]
 */
public interface BusinessAuthDepositMapper{

	/**
	* 查询business
	*
	* @param id businessID
	* @return business
	*/
	public BusinessAuthDeposit selectBusinessAuthDepositById(Long id);

	/**
	* 查询business列表
	*
	* @param businessAuthDeposit business
	* @return business集合
	*/
	public List<BusinessAuthDeposit> selectBusinessAuthDepositList(BusinessAuthDeposit businessAuthDeposit);

	/**
	* 新增business
	*
	* @param businessAuthDeposit business
	* @return 结果
	*/
	public int insertBusinessAuthDeposit(BusinessAuthDeposit businessAuthDeposit);

	/**
	* 修改business
	*
	* @param businessAuthDeposit business
	* @return 结果
	*/
	public int updateBusinessAuthDeposit(BusinessAuthDeposit businessAuthDeposit);

	/**
	* 删除business
	*
	* @param id businessID
	* @return 结果
	*/
	public int deleteBusinessAuthDepositById(Long id);

	/**
	* 批量删除business
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteBusinessAuthDepositByIds(Long[] ids);

}
