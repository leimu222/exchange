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
 * Description: [advertiseBiz服务实现]
 */
@Service
public class AdvertiseBizServiceImpl extends CommonService implements IAdvertiseBizService {
	@Autowired
	private IAdvertiseService advertiseService;

	/**
	* 查询advertise
	*
	* @param id advertiseID
	* @return advertise
	*/
	@Override
	public Advertise selectAdvertiseById(Long id) {
		return advertiseService.selectAdvertiseById(id);
	}

	/**
	* 查询advertise列表
	*
	* @param advertise advertise
	* @return advertise
	*/
	@Override
	public List<Advertise> selectAdvertiseList(Advertise advertise) {
		return advertiseService.selectAdvertiseList(advertise);
	}

	/**
	* 新增advertise
	*
	* @param advertise advertise
	* @return 结果
	*/
	@Override
	public int insertAdvertise(Advertise advertise) {
		return advertiseService.insertAdvertise(advertise);
	}

	/**
	* 修改advertise
	*
	* @param advertise advertise
	* @return 结果
	*/
	@Override
	public int updateAdvertise(Advertise advertise) {
		return advertiseService.updateAdvertise(advertise);
	}

	/**
	* 批量删除advertise
	*
	* @param ids 需要删除的advertiseID
	* @return 结果
	*/
	@Override
	public int deleteAdvertiseByIds(Long[] ids) {
		return advertiseService.deleteAdvertiseByIds(ids);
	}

	/**
	* 删除advertise信息
	*
	* @param id advertiseID
	* @return 结果
	*/
	@Override
	public int deleteAdvertiseById(Long id) {
		return advertiseService.deleteAdvertiseById(id);
	}

}
