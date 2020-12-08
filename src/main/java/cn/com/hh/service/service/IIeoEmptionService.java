package com.common.api.service;

import java.util.List;

import com.common.api.model.ieoEmption;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:05
 * Description: [ieo服务]
 */
public interface IIeoEmptionService {

	/**
	* 查询ieo
	*
	* @param id ieoID
	* @return ieo
	*/
	public IeoEmption selectIeoEmptionById(Long id);

	/**
	* 查询ieo列表
	*
	* @param ieoEmption ieo
	* @return ieo集合
	*/
	public List<IeoEmption> selectIeoEmptionList(IeoEmption ieoEmption);

	/**
	* 新增ieo
	*
	* @param ieoEmption ieo
	* @return 结果
	*/
	public int insertIeoEmption(IeoEmption ieoEmption);

	/**
	* 修改ieo
	*
	* @param ieoEmption ieo
	* @return 结果
	*/
	public int updateIeoEmption(IeoEmption ieoEmption);

	/**
	* 批量删除ieo
	*
	* @param ids 需要删除的ieoID
	* @return 结果
	*/
	public int deleteIeoEmptionByIds(Long[] ids);

	/**
	* 删除ieo信息
	*
	* @param id ieoID
	* @return 结果
	*/
	public int deleteIeoEmptionById(Long id);
	
}
