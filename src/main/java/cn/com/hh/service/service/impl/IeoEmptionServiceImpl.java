package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.IeoEmptionMapper;
import com.common.api.model.IeoEmption;
import com.common.api.service.IIeoEmptionService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:05
 * Description: [ieo服务实现]
 */
@Service
public class IeoEmptionServiceImpl implements IIeoEmptionService {
	@Autowired
	private IeoEmptionMapper ieoEmptionMapper;

	/**
	* 查询ieo
	*
	* @param id ieoID
	* @return ieo
	*/
	@Override
	public IeoEmption selectIeoEmptionById(Long id) {
		return ieoEmptionMapper.selectIeoEmptionById(id);
	}

	/**
	* 查询ieo列表
	*
	* @param ieoEmption ieo
	* @return ieo
	*/
	@Override
	public List<IeoEmption> selectIeoEmptionList(IeoEmption ieoEmption) {
		return ieoEmptionMapper.selectIeoEmptionList(ieoEmption);
	}

	/**
	* 新增ieo
	*
	* @param ieoEmption ieo
	* @return 结果
	*/
	@Override
	public int insertIeoEmption(IeoEmption ieoEmption) {
		return ieoEmptionMapper.insertIeoEmption(ieoEmption);
	}

	/**
	* 修改ieo
	*
	* @param ieoEmption ieo
	* @return 结果
	*/
	@Override
	public int updateIeoEmption(IeoEmption ieoEmption) {
		return ieoEmptionMapper.updateIeoEmption(ieoEmption);
	}

	/**
	* 批量删除ieo
	*
	* @param ids 需要删除的ieoID
	* @return 结果
	*/
	@Override
	public int deleteIeoEmptionByIds(Long[] ids) {
		return ieoEmptionMapper.deleteIeoEmptionByIds(ids);
	}

	/**
	* 删除ieo信息
	*
	* @param id ieoID
	* @return 结果
	*/
	@Override
	public int deleteIeoEmptionById(Long id) {
		return ieoEmptionMapper.deleteIeoEmptionById(id);
	}

}
