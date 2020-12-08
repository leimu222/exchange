package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.AdvertiseMapper;
import com.common.api.model.Advertise;
import com.common.api.service.IAdvertiseService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:01
 * Description: [advertise服务实现]
 */
@Service
public class AdvertiseServiceImpl implements IAdvertiseService {
	@Autowired
	private AdvertiseMapper advertiseMapper;

	/**
	* 查询advertise
	*
	* @param id advertiseID
	* @return advertise
	*/
	@Override
	public Advertise selectAdvertiseById(Long id) {
		return advertiseMapper.selectAdvertiseById(id);
	}

	/**
	* 查询advertise列表
	*
	* @param advertise advertise
	* @return advertise
	*/
	@Override
	public List<Advertise> selectAdvertiseList(Advertise advertise) {
		return advertiseMapper.selectAdvertiseList(advertise);
	}

	/**
	* 新增advertise
	*
	* @param advertise advertise
	* @return 结果
	*/
	@Override
	public int insertAdvertise(Advertise advertise) {
		return advertiseMapper.insertAdvertise(advertise);
	}

	/**
	* 修改advertise
	*
	* @param advertise advertise
	* @return 结果
	*/
	@Override
	public int updateAdvertise(Advertise advertise) {
		return advertiseMapper.updateAdvertise(advertise);
	}

	/**
	* 批量删除advertise
	*
	* @param ids 需要删除的advertiseID
	* @return 结果
	*/
	@Override
	public int deleteAdvertiseByIds(Long[] ids) {
		return advertiseMapper.deleteAdvertiseByIds(ids);
	}

	/**
	* 删除advertise信息
	*
	* @param id advertiseID
	* @return 结果
	*/
	@Override
	public int deleteAdvertiseById(Long id) {
		return advertiseMapper.deleteAdvertiseById(id);
	}

}
