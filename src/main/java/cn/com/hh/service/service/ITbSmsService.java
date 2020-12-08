package com.common.api.service;

import java.util.List;

import com.common.api.model.tbSms;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:09
 * Description: [tb服务]
 */
public interface ITbSmsService {

	/**
	* 查询tb
	*
	* @param id tbID
	* @return tb
	*/
	public TbSms selectTbSmsById(Long id);

	/**
	* 查询tb列表
	*
	* @param tbSms tb
	* @return tb集合
	*/
	public List<TbSms> selectTbSmsList(TbSms tbSms);

	/**
	* 新增tb
	*
	* @param tbSms tb
	* @return 结果
	*/
	public int insertTbSms(TbSms tbSms);

	/**
	* 修改tb
	*
	* @param tbSms tb
	* @return 结果
	*/
	public int updateTbSms(TbSms tbSms);

	/**
	* 批量删除tb
	*
	* @param ids 需要删除的tbID
	* @return 结果
	*/
	public int deleteTbSmsByIds(Long[] ids);

	/**
	* 删除tb信息
	*
	* @param id tbID
	* @return 结果
	*/
	public int deleteTbSmsById(Long id);
	
}
