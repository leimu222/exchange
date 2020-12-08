package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.BusinessAuthDepositMapper;
import com.common.api.model.BusinessAuthDeposit;
import com.common.api.service.IBusinessAuthDepositService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:01
 * Description: [businessBiz服务实现]
 */
@Service
public class BusinessAuthDepositBizServiceImpl extends CommonService implements IBusinessAuthDepositBizService {
	@Autowired
	private IBusinessAuthDepositService businessAuthDepositService;

	/**
	* 查询business
	*
	* @param id businessID
	* @return business
	*/
	@Override
	public BusinessAuthDeposit selectBusinessAuthDepositById(Long id) {
		return businessAuthDepositService.selectBusinessAuthDepositById(id);
	}

	/**
	* 查询business列表
	*
	* @param businessAuthDeposit business
	* @return business
	*/
	@Override
	public List<BusinessAuthDeposit> selectBusinessAuthDepositList(BusinessAuthDeposit businessAuthDeposit) {
		return businessAuthDepositService.selectBusinessAuthDepositList(businessAuthDeposit);
	}

	/**
	* 新增business
	*
	* @param businessAuthDeposit business
	* @return 结果
	*/
	@Override
	public int insertBusinessAuthDeposit(BusinessAuthDeposit businessAuthDeposit) {
		return businessAuthDepositService.insertBusinessAuthDeposit(businessAuthDeposit);
	}

	/**
	* 修改business
	*
	* @param businessAuthDeposit business
	* @return 结果
	*/
	@Override
	public int updateBusinessAuthDeposit(BusinessAuthDeposit businessAuthDeposit) {
		return businessAuthDepositService.updateBusinessAuthDeposit(businessAuthDeposit);
	}

	/**
	* 批量删除business
	*
	* @param ids 需要删除的businessID
	* @return 结果
	*/
	@Override
	public int deleteBusinessAuthDepositByIds(Long[] ids) {
		return businessAuthDepositService.deleteBusinessAuthDepositByIds(ids);
	}

	/**
	* 删除business信息
	*
	* @param id businessID
	* @return 结果
	*/
	@Override
	public int deleteBusinessAuthDepositById(Long id) {
		return businessAuthDepositService.deleteBusinessAuthDepositById(id);
	}

}
