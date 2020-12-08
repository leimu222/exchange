package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.ProjectApiKeyMapper;
import com.common.api.model.ProjectApiKey;
import com.common.api.service.IProjectApiKeyService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:08
 * Description: [project服务实现]
 */
@Service
public class ProjectApiKeyServiceImpl implements IProjectApiKeyService {
	@Autowired
	private ProjectApiKeyMapper projectApiKeyMapper;

	/**
	* 查询project
	*
	* @param id projectID
	* @return project
	*/
	@Override
	public ProjectApiKey selectProjectApiKeyById(Integer id) {
		return projectApiKeyMapper.selectProjectApiKeyById(id);
	}

	/**
	* 查询project列表
	*
	* @param projectApiKey project
	* @return project
	*/
	@Override
	public List<ProjectApiKey> selectProjectApiKeyList(ProjectApiKey projectApiKey) {
		return projectApiKeyMapper.selectProjectApiKeyList(projectApiKey);
	}

	/**
	* 新增project
	*
	* @param projectApiKey project
	* @return 结果
	*/
	@Override
	public int insertProjectApiKey(ProjectApiKey projectApiKey) {
		return projectApiKeyMapper.insertProjectApiKey(projectApiKey);
	}

	/**
	* 修改project
	*
	* @param projectApiKey project
	* @return 结果
	*/
	@Override
	public int updateProjectApiKey(ProjectApiKey projectApiKey) {
		return projectApiKeyMapper.updateProjectApiKey(projectApiKey);
	}

	/**
	* 批量删除project
	*
	* @param ids 需要删除的projectID
	* @return 结果
	*/
	@Override
	public int deleteProjectApiKeyByIds(Integer[] ids) {
		return projectApiKeyMapper.deleteProjectApiKeyByIds(ids);
	}

	/**
	* 删除project信息
	*
	* @param id projectID
	* @return 结果
	*/
	@Override
	public int deleteProjectApiKeyById(Integer id) {
		return projectApiKeyMapper.deleteProjectApiKeyById(id);
	}

}
