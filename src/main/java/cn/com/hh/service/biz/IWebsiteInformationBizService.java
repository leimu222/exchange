package com.common.api.service;

import java.util.List;

import com.common.api.model.websiteInformation;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:09
 * Description: [websiteBiz服务]
 */
public interface IWebsiteInformationBizService {

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
	* 批量删除website
	*
	* @param ids 需要删除的websiteID
	* @return 结果
	*/
	public int deleteWebsiteInformationByIds(Long[] ids);

	/**
	* 删除website信息
	*
	* @param id websiteID
	* @return 结果
	*/
	public int deleteWebsiteInformationById(Long id);
	
}
