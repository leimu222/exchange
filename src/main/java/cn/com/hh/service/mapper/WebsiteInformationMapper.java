package com.common.api.mapper;

import com.common.api.model.WebsiteInformation;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:09
  * Description: [website服务实现]
 */
public interface WebsiteInformationMapper{

	/**
	* 查询website
	*
	* @param id websiteID
	* @return website
	*/
	public WebsiteInformation selectWebsiteInformationById(Long id);

	/**
	* 查询website列表
	*
	* @param websiteInformation website
	* @return website集合
	*/
	public List<WebsiteInformation> selectWebsiteInformationList(WebsiteInformation websiteInformation);

	/**
	* 新增website
	*
	* @param websiteInformation website
	* @return 结果
	*/
	public int insertWebsiteInformation(WebsiteInformation websiteInformation);

	/**
	* 修改website
	*
	* @param websiteInformation website
	* @return 结果
	*/
	public int updateWebsiteInformation(WebsiteInformation websiteInformation);

	/**
	* 删除website
	*
	* @param id websiteID
	* @return 结果
	*/
	public int deleteWebsiteInformationById(Long id);

	/**
	* 批量删除website
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteWebsiteInformationByIds(Long[] ids);

}
