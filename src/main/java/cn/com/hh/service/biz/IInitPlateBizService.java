package com.common.api.service;

import java.util.List;

import com.common.api.model.initPlate;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:05
 * Description: [initBiz服务]
 */
public interface IInitPlateBizService {

	/**
	* 查询init
	*
	* @param id initID
	* @return init
	*/
	public InitPlate selectInitPlateById(Long id);

	/**
	* 查询init列表
	*
	* @param initPlate init
	* @return init集合
	*/
	public List<InitPlate> selectInitPlateList(InitPlate initPlate);

	/**
	* 新增init
	*
	* @param initPlate init
	* @return 结果
	*/
	public int insertInitPlate(InitPlate initPlate);

	/**
	* 修改init
	*
	* @param initPlate init
	* @return 结果
	*/
	public int updateInitPlate(InitPlate initPlate);

	/**
	* 批量删除init
	*
	* @param ids 需要删除的initID
	* @return 结果
	*/
	public int deleteInitPlateByIds(Long[] ids);

	/**
	* 删除init信息
	*
	* @param id initID
	* @return 结果
	*/
	public int deleteInitPlateById(Long id);
	
}
