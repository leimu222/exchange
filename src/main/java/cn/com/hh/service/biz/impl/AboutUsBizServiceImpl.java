package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.AboutUsMapper;
import com.common.api.model.AboutUs;
import com.common.api.service.IAboutUsService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:15:59
 * Description: [aboutBiz服务实现]
 */
@Service
public class AboutUsBizServiceImpl extends CommonService implements IAboutUsBizService {
	@Autowired
	private IAboutUsService aboutUsService;

	/**
	* 查询about
	*
	* @param id aboutID
	* @return about
	*/
	@Override
	public AboutUs selectAboutUsById(Integer id) {
		return aboutUsService.selectAboutUsById(id);
	}

	/**
	* 查询about列表
	*
	* @param aboutUs about
	* @return about
	*/
	@Override
	public List<AboutUs> selectAboutUsList(AboutUs aboutUs) {
		return aboutUsService.selectAboutUsList(aboutUs);
	}

	/**
	* 新增about
	*
	* @param aboutUs about
	* @return 结果
	*/
	@Override
	public int insertAboutUs(AboutUs aboutUs) {
		return aboutUsService.insertAboutUs(aboutUs);
	}

	/**
	* 修改about
	*
	* @param aboutUs about
	* @return 结果
	*/
	@Override
	public int updateAboutUs(AboutUs aboutUs) {
		return aboutUsService.updateAboutUs(aboutUs);
	}

	/**
	* 批量删除about
	*
	* @param ids 需要删除的aboutID
	* @return 结果
	*/
	@Override
	public int deleteAboutUsByIds(Integer[] ids) {
		return aboutUsService.deleteAboutUsByIds(ids);
	}

	/**
	* 删除about信息
	*
	* @param id aboutID
	* @return 结果
	*/
	@Override
	public int deleteAboutUsById(Integer id) {
		return aboutUsService.deleteAboutUsById(id);
	}

}
