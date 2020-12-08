package com.common.api.service;

import java.util.List;

import com.common.api.model.businessAuthDeposit;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:01
 * Description: [businessBiz服务]
 */
public interface IBusinessAuthDepositBizService {

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
	* 批量删除business
	*
	* @param ids 需要删除的businessID
	* @return 结果
	*/
	public int deleteBusinessAuthDepositByIds(Long[] ids);

	/**
	* 删除business信息
	*
	* @param id businessID
	* @return 结果
	*/
	public int deleteBusinessAuthDepositById(Long id);
	
}
