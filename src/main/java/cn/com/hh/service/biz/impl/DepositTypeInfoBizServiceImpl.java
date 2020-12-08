package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.DepositTypeInfoMapper;
import com.common.api.model.DepositTypeInfo;
import com.common.api.service.IDepositTypeInfoService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:04
 * Description: [depositBiz服务实现]
 */
@Service
public class DepositTypeInfoBizServiceImpl extends CommonService implements IDepositTypeInfoBizService {
	@Autowired
	private IDepositTypeInfoService depositTypeInfoService;

	/**
	* 查询deposit
	*
	* @param id depositID
	* @return deposit
	*/
	@Override
	public DepositTypeInfo selectDepositTypeInfoById(Integer id) {
		return depositTypeInfoService.selectDepositTypeInfoById(id);
	}

	/**
	* 查询deposit列表
	*
	* @param depositTypeInfo deposit
	* @return deposit
	*/
	@Override
	public List<DepositTypeInfo> selectDepositTypeInfoList(DepositTypeInfo depositTypeInfo) {
		return depositTypeInfoService.selectDepositTypeInfoList(depositTypeInfo);
	}

	/**
	* 新增deposit
	*
	* @param depositTypeInfo deposit
	* @return 结果
	*/
	@Override
	public int insertDepositTypeInfo(DepositTypeInfo depositTypeInfo) {
		return depositTypeInfoService.insertDepositTypeInfo(depositTypeInfo);
	}

	/**
	* 修改deposit
	*
	* @param depositTypeInfo deposit
	* @return 结果
	*/
	@Override
	public int updateDepositTypeInfo(DepositTypeInfo depositTypeInfo) {
		return depositTypeInfoService.updateDepositTypeInfo(depositTypeInfo);
	}

	/**
	* 批量删除deposit
	*
	* @param ids 需要删除的depositID
	* @return 结果
	*/
	@Override
	public int deleteDepositTypeInfoByIds(Integer[] ids) {
		return depositTypeInfoService.deleteDepositTypeInfoByIds(ids);
	}

	/**
	* 删除deposit信息
	*
	* @param id depositID
	* @return 结果
	*/
	@Override
	public int deleteDepositTypeInfoById(Integer id) {
		return depositTypeInfoService.deleteDepositTypeInfoById(id);
	}

}
