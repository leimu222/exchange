package com.common.api.service;

import java.util.List;

import com.common.api.model.businessAuthApply;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:01
 * Description: [business服务]
 */
public interface IBusinessAuthApplyService {

	/**
	* 查询business
	*
	* @param id businessID
	* @return business
	*/
	public BusinessAuthApply selectBusinessAuthApplyById(Long id);

	/**
	* 查询business列表
	*
	* @param businessAuthApply business
	* @return business集合
	*/
	public List<BusinessAuthApply> selectBusinessAuthApplyList(BusinessAuthApply businessAuthApply);

	/**
	* 新增business
	*
	* @param businessAuthApply business
	* @return 结果
	*/
	public int insertBusinessAuthApply(BusinessAuthApply businessAuthApply);

	/**
	* 修改business
	*
	* @param businessAuthApply business
	* @return 结果
	*/
	public int updateBusinessAuthApply(BusinessAuthApply businessAuthApply);

	/**
	* 批量删除business
	*
	* @param ids 需要删除的businessID
	* @return 结果
	*/
	public int deleteBusinessAuthApplyByIds(Long[] ids);

	/**
	* 删除business信息
	*
	* @param id businessID
	* @return 结果
	*/
	public int deleteBusinessAuthApplyById(Long id);
	
}
