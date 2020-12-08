package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.BussinessCancelApplyMapper;
import com.common.api.model.BussinessCancelApply;
import com.common.api.service.IBussinessCancelApplyService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:01
 * Description: [bussiness服务实现]
 */
@Service
public class BussinessCancelApplyServiceImpl implements IBussinessCancelApplyService {
	@Autowired
	private BussinessCancelApplyMapper bussinessCancelApplyMapper;

	/**
	* 查询bussiness
	*
	* @param id bussinessID
	* @return bussiness
	*/
	@Override
	public BussinessCancelApply selectBussinessCancelApplyById(Long id) {
		return bussinessCancelApplyMapper.selectBussinessCancelApplyById(id);
	}

	/**
	* 查询bussiness列表
	*
	* @param bussinessCancelApply bussiness
	* @return bussiness
	*/
	@Override
	public List<BussinessCancelApply> selectBussinessCancelApplyList(BussinessCancelApply bussinessCancelApply) {
		return bussinessCancelApplyMapper.selectBussinessCancelApplyList(bussinessCancelApply);
	}

	/**
	* 新增bussiness
	*
	* @param bussinessCancelApply bussiness
	* @return 结果
	*/
	@Override
	public int insertBussinessCancelApply(BussinessCancelApply bussinessCancelApply) {
		return bussinessCancelApplyMapper.insertBussinessCancelApply(bussinessCancelApply);
	}

	/**
	* 修改bussiness
	*
	* @param bussinessCancelApply bussiness
	* @return 结果
	*/
	@Override
	public int updateBussinessCancelApply(BussinessCancelApply bussinessCancelApply) {
		return bussinessCancelApplyMapper.updateBussinessCancelApply(bussinessCancelApply);
	}

	/**
	* 批量删除bussiness
	*
	* @param ids 需要删除的bussinessID
	* @return 结果
	*/
	@Override
	public int deleteBussinessCancelApplyByIds(Long[] ids) {
		return bussinessCancelApplyMapper.deleteBussinessCancelApplyByIds(ids);
	}

	/**
	* 删除bussiness信息
	*
	* @param id bussinessID
	* @return 结果
	*/
	@Override
	public int deleteBussinessCancelApplyById(Long id) {
		return bussinessCancelApplyMapper.deleteBussinessCancelApplyById(id);
	}

}
