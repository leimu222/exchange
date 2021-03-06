package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.BusinessAuthApplyMapper;
import com.common.api.model.BusinessAuthApply;
import com.common.api.service.IBusinessAuthApplyService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:01
 * Description: [business服务实现]
 */
@Service
public class BusinessAuthApplyServiceImpl implements IBusinessAuthApplyService {
	@Autowired
	private BusinessAuthApplyMapper businessAuthApplyMapper;

	/**
	* 查询business
	*
	* @param id businessID
	* @return business
	*/
	@Override
	public BusinessAuthApply selectBusinessAuthApplyById(Long id) {
		return businessAuthApplyMapper.selectBusinessAuthApplyById(id);
	}

	/**
	* 查询business列表
	*
	* @param businessAuthApply business
	* @return business
	*/
	@Override
	public List<BusinessAuthApply> selectBusinessAuthApplyList(BusinessAuthApply businessAuthApply) {
		return businessAuthApplyMapper.selectBusinessAuthApplyList(businessAuthApply);
	}

	/**
	* 新增business
	*
	* @param businessAuthApply business
	* @return 结果
	*/
	@Override
	public int insertBusinessAuthApply(BusinessAuthApply businessAuthApply) {
		return businessAuthApplyMapper.insertBusinessAuthApply(businessAuthApply);
	}

	/**
	* 修改business
	*
	* @param businessAuthApply business
	* @return 结果
	*/
	@Override
	public int updateBusinessAuthApply(BusinessAuthApply businessAuthApply) {
		return businessAuthApplyMapper.updateBusinessAuthApply(businessAuthApply);
	}

	/**
	* 批量删除business
	*
	* @param ids 需要删除的businessID
	* @return 结果
	*/
	@Override
	public int deleteBusinessAuthApplyByIds(Long[] ids) {
		return businessAuthApplyMapper.deleteBusinessAuthApplyByIds(ids);
	}

	/**
	* 删除business信息
	*
	* @param id businessID
	* @return 结果
	*/
	@Override
	public int deleteBusinessAuthApplyById(Long id) {
		return businessAuthApplyMapper.deleteBusinessAuthApplyById(id);
	}

}
