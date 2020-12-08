package com.common.api.service;

import java.util.List;

import com.common.api.model.advertise;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:01
 * Description: [advertiseBiz服务]
 */
public interface IAdvertiseBizService {

	/**
	* 查询advertise
	*
	* @param id advertiseID
	* @return advertise
	*/
	public Advertise selectAdvertiseById(Long id);

	/**
	* 查询advertise列表
	*
	* @param advertise advertise
	* @return advertise集合
	*/
	public List<Advertise> selectAdvertiseList(Advertise advertise);

	/**
	* 新增advertise
	*
	* @param advertise advertise
	* @return 结果
	*/
	public int insertAdvertise(Advertise advertise);

	/**
	* 修改advertise
	*
	* @param advertise advertise
	* @return 结果
	*/
	public int updateAdvertise(Advertise advertise);

	/**
	* 批量删除advertise
	*
	* @param ids 需要删除的advertiseID
	* @return 结果
	*/
	public int deleteAdvertiseByIds(Long[] ids);

	/**
	* 删除advertise信息
	*
	* @param id advertiseID
	* @return 结果
	*/
	public int deleteAdvertiseById(Long id);
	
}
