package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.OtcPayTypesMapper;
import com.common.api.model.OtcPayTypes;
import com.common.api.service.IOtcPayTypesService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:07
 * Description: [otcBiz服务实现]
 */
@Service
public class OtcPayTypesBizServiceImpl extends CommonService implements IOtcPayTypesBizService {
	@Autowired
	private IOtcPayTypesService otcPayTypesService;

	/**
	* 查询otc
	*
	* @param id otcID
	* @return otc
	*/
	@Override
	public OtcPayTypes selectOtcPayTypesById(Integer id) {
		return otcPayTypesService.selectOtcPayTypesById(id);
	}

	/**
	* 查询otc列表
	*
	* @param otcPayTypes otc
	* @return otc
	*/
	@Override
	public List<OtcPayTypes> selectOtcPayTypesList(OtcPayTypes otcPayTypes) {
		return otcPayTypesService.selectOtcPayTypesList(otcPayTypes);
	}

	/**
	* 新增otc
	*
	* @param otcPayTypes otc
	* @return 结果
	*/
	@Override
	public int insertOtcPayTypes(OtcPayTypes otcPayTypes) {
		return otcPayTypesService.insertOtcPayTypes(otcPayTypes);
	}

	/**
	* 修改otc
	*
	* @param otcPayTypes otc
	* @return 结果
	*/
	@Override
	public int updateOtcPayTypes(OtcPayTypes otcPayTypes) {
		return otcPayTypesService.updateOtcPayTypes(otcPayTypes);
	}

	/**
	* 批量删除otc
	*
	* @param ids 需要删除的otcID
	* @return 结果
	*/
	@Override
	public int deleteOtcPayTypesByIds(Integer[] ids) {
		return otcPayTypesService.deleteOtcPayTypesByIds(ids);
	}

	/**
	* 删除otc信息
	*
	* @param id otcID
	* @return 结果
	*/
	@Override
	public int deleteOtcPayTypesById(Integer id) {
		return otcPayTypesService.deleteOtcPayTypesById(id);
	}

}
