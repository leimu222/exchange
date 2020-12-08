package com.common.api.service;

import java.util.List;

import com.common.api.model.aboutUs;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:15:59
 * Description: [aboutBiz服务]
 */
public interface IAboutUsBizService {

	/**
	* 查询about
	*
	* @param id aboutID
	* @return about
	*/
	public AboutUs selectAboutUsById(Integer id);

	/**
	* 查询about列表
	*
	* @param aboutUs about
	* @return about集合
	*/
	public List<AboutUs> selectAboutUsList(AboutUs aboutUs);

	/**
	* 新增about
	*
	* @param aboutUs about
	* @return 结果
	*/
	public int insertAboutUs(AboutUs aboutUs);

	/**
	* 修改about
	*
	* @param aboutUs about
	* @return 结果
	*/
	public int updateAboutUs(AboutUs aboutUs);

	/**
	* 批量删除about
	*
	* @param ids 需要删除的aboutID
	* @return 结果
	*/
	public int deleteAboutUsByIds(Integer[] ids);

	/**
	* 删除about信息
	*
	* @param id aboutID
	* @return 结果
	*/
	public int deleteAboutUsById(Integer id);
	
}
