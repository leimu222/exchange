package com.common.api.service;

import java.util.List;

import com.common.api.model.sign;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:08
 * Description: [signBiz服务]
 */
public interface ISignBizService {

	/**
	* 查询sign
	*
	* @param id signID
	* @return sign
	*/
	public Sign selectSignById(Long id);

	/**
	* 查询sign列表
	*
	* @param sign sign
	* @return sign集合
	*/
	public List<Sign> selectSignList(Sign sign);

	/**
	* 新增sign
	*
	* @param sign sign
	* @return 结果
	*/
	public int insertSign(Sign sign);

	/**
	* 修改sign
	*
	* @param sign sign
	* @return 结果
	*/
	public int updateSign(Sign sign);

	/**
	* 批量删除sign
	*
	* @param ids 需要删除的signID
	* @return 结果
	*/
	public int deleteSignByIds(Long[] ids);

	/**
	* 删除sign信息
	*
	* @param id signID
	* @return 结果
	*/
	public int deleteSignById(Long id);
	
}
