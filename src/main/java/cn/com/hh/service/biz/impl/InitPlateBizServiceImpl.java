package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.InitPlateMapper;
import com.common.api.model.InitPlate;
import com.common.api.service.IInitPlateService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:05
 * Description: [initBiz服务实现]
 */
@Service
public class InitPlateBizServiceImpl extends CommonService implements IInitPlateBizService {
	@Autowired
	private IInitPlateService initPlateService;

	/**
	* 查询init
	*
	* @param id initID
	* @return init
	*/
	@Override
	public InitPlate selectInitPlateById(Long id) {
		return initPlateService.selectInitPlateById(id);
	}

	/**
	* 查询init列表
	*
	* @param initPlate init
	* @return init
	*/
	@Override
	public List<InitPlate> selectInitPlateList(InitPlate initPlate) {
		return initPlateService.selectInitPlateList(initPlate);
	}

	/**
	* 新增init
	*
	* @param initPlate init
	* @return 结果
	*/
	@Override
	public int insertInitPlate(InitPlate initPlate) {
		return initPlateService.insertInitPlate(initPlate);
	}

	/**
	* 修改init
	*
	* @param initPlate init
	* @return 结果
	*/
	@Override
	public int updateInitPlate(InitPlate initPlate) {
		return initPlateService.updateInitPlate(initPlate);
	}

	/**
	* 批量删除init
	*
	* @param ids 需要删除的initID
	* @return 结果
	*/
	@Override
	public int deleteInitPlateByIds(Long[] ids) {
		return initPlateService.deleteInitPlateByIds(ids);
	}

	/**
	* 删除init信息
	*
	* @param id initID
	* @return 结果
	*/
	@Override
	public int deleteInitPlateById(Long id) {
		return initPlateService.deleteInitPlateById(id);
	}

}
