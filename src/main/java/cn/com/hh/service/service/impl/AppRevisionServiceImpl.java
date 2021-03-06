package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.AppRevisionMapper;
import com.common.api.model.AppRevision;
import com.common.api.service.IAppRevisionService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:01
 * Description: [app服务实现]
 */
@Service
public class AppRevisionServiceImpl implements IAppRevisionService {
	@Autowired
	private AppRevisionMapper appRevisionMapper;

	/**
	* 查询app
	*
	* @param id appID
	* @return app
	*/
	@Override
	public AppRevision selectAppRevisionById(Long id) {
		return appRevisionMapper.selectAppRevisionById(id);
	}

	/**
	* 查询app列表
	*
	* @param appRevision app
	* @return app
	*/
	@Override
	public List<AppRevision> selectAppRevisionList(AppRevision appRevision) {
		return appRevisionMapper.selectAppRevisionList(appRevision);
	}

	/**
	* 新增app
	*
	* @param appRevision app
	* @return 结果
	*/
	@Override
	public int insertAppRevision(AppRevision appRevision) {
		return appRevisionMapper.insertAppRevision(appRevision);
	}

	/**
	* 修改app
	*
	* @param appRevision app
	* @return 结果
	*/
	@Override
	public int updateAppRevision(AppRevision appRevision) {
		return appRevisionMapper.updateAppRevision(appRevision);
	}

	/**
	* 批量删除app
	*
	* @param ids 需要删除的appID
	* @return 结果
	*/
	@Override
	public int deleteAppRevisionByIds(Long[] ids) {
		return appRevisionMapper.deleteAppRevisionByIds(ids);
	}

	/**
	* 删除app信息
	*
	* @param id appID
	* @return 结果
	*/
	@Override
	public int deleteAppRevisionById(Long id) {
		return appRevisionMapper.deleteAppRevisionById(id);
	}

}
