package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.AppealMapper;
import com.common.api.model.Appeal;
import com.common.api.service.IAppealService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:01
 * Description: [appeal服务实现]
 */
@Service
public class AppealServiceImpl implements IAppealService {
	@Autowired
	private AppealMapper appealMapper;

	/**
	* 查询appeal
	*
	* @param id appealID
	* @return appeal
	*/
	@Override
	public Appeal selectAppealById(Long id) {
		return appealMapper.selectAppealById(id);
	}

	/**
	* 查询appeal列表
	*
	* @param appeal appeal
	* @return appeal
	*/
	@Override
	public List<Appeal> selectAppealList(Appeal appeal) {
		return appealMapper.selectAppealList(appeal);
	}

	/**
	* 新增appeal
	*
	* @param appeal appeal
	* @return 结果
	*/
	@Override
	public int insertAppeal(Appeal appeal) {
		return appealMapper.insertAppeal(appeal);
	}

	/**
	* 修改appeal
	*
	* @param appeal appeal
	* @return 结果
	*/
	@Override
	public int updateAppeal(Appeal appeal) {
		return appealMapper.updateAppeal(appeal);
	}

	/**
	* 批量删除appeal
	*
	* @param ids 需要删除的appealID
	* @return 结果
	*/
	@Override
	public int deleteAppealByIds(Long[] ids) {
		return appealMapper.deleteAppealByIds(ids);
	}

	/**
	* 删除appeal信息
	*
	* @param id appealID
	* @return 结果
	*/
	@Override
	public int deleteAppealById(Long id) {
		return appealMapper.deleteAppealById(id);
	}

}
