package com.common.api.mapper;

import com.common.api.model.AboutUs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:15:59
  * Description: [about服务实现]
 */
public interface AboutUsMapper{

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
	* 删除about
	*
	* @param id aboutID
	* @return 结果
	*/
	public int deleteAboutUsById(Integer id);

	/**
	* 批量删除about
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteAboutUsByIds(Integer[] ids);

}
