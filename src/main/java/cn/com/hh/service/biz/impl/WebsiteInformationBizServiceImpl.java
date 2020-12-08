package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.WebsiteInformationMapper;
import com.common.api.model.WebsiteInformation;
import com.common.api.service.IWebsiteInformationService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:09
 * Description: [websiteBiz服务实现]
 */
@Service
public class WebsiteInformationBizServiceImpl extends CommonService implements IWebsiteInformationBizService {
	@Autowired
	private IWebsiteInformationService websiteInformationService;

	/**
	* 查询website
	*
	* @param id websiteID
	* @return website
	*/
	@Override
	public WebsiteInformation selectWebsiteInformationById(Long id) {
		return websiteInformationService.selectWebsiteInformationById(id);
	}

	/**
	* 查询website列表
	*
	* @param websiteInformation website
	* @return website
	*/
	@Override
	public List<WebsiteInformation> selectWebsiteInformationList(WebsiteInformation websiteInformation) {
		return websiteInformationService.selectWebsiteInformationList(websiteInformation);
	}

	/**
	* 新增website
	*
	* @param websiteInformation website
	* @return 结果
	*/
	@Override
	public int insertWebsiteInformation(WebsiteInformation websiteInformation) {
		return websiteInformationService.insertWebsiteInformation(websiteInformation);
	}

	/**
	* 修改website
	*
	* @param websiteInformation website
	* @return 结果
	*/
	@Override
	public int updateWebsiteInformation(WebsiteInformation websiteInformation) {
		return websiteInformationService.updateWebsiteInformation(websiteInformation);
	}

	/**
	* 批量删除website
	*
	* @param ids 需要删除的websiteID
	* @return 结果
	*/
	@Override
	public int deleteWebsiteInformationByIds(Long[] ids) {
		return websiteInformationService.deleteWebsiteInformationByIds(ids);
	}

	/**
	* 删除website信息
	*
	* @param id websiteID
	* @return 结果
	*/
	@Override
	public int deleteWebsiteInformationById(Long id) {
		return websiteInformationService.deleteWebsiteInformationById(id);
	}

}
