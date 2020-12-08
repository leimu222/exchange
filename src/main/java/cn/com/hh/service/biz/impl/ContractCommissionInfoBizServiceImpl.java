package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.ContractCommissionInfoMapper;
import com.common.api.model.ContractCommissionInfo;
import com.common.api.service.IContractCommissionInfoService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:02
 * Description: [contractBiz服务实现]
 */
@Service
public class ContractCommissionInfoBizServiceImpl extends CommonService implements IContractCommissionInfoBizService {
	@Autowired
	private IContractCommissionInfoService contractCommissionInfoService;

	/**
	* 查询contract
	*
	* @param id contractID
	* @return contract
	*/
	@Override
	public ContractCommissionInfo selectContractCommissionInfoById(Integer id) {
		return contractCommissionInfoService.selectContractCommissionInfoById(id);
	}

	/**
	* 查询contract列表
	*
	* @param contractCommissionInfo contract
	* @return contract
	*/
	@Override
	public List<ContractCommissionInfo> selectContractCommissionInfoList(ContractCommissionInfo contractCommissionInfo) {
		return contractCommissionInfoService.selectContractCommissionInfoList(contractCommissionInfo);
	}

	/**
	* 新增contract
	*
	* @param contractCommissionInfo contract
	* @return 结果
	*/
	@Override
	public int insertContractCommissionInfo(ContractCommissionInfo contractCommissionInfo) {
		return contractCommissionInfoService.insertContractCommissionInfo(contractCommissionInfo);
	}

	/**
	* 修改contract
	*
	* @param contractCommissionInfo contract
	* @return 结果
	*/
	@Override
	public int updateContractCommissionInfo(ContractCommissionInfo contractCommissionInfo) {
		return contractCommissionInfoService.updateContractCommissionInfo(contractCommissionInfo);
	}

	/**
	* 批量删除contract
	*
	* @param ids 需要删除的contractID
	* @return 结果
	*/
	@Override
	public int deleteContractCommissionInfoByIds(Integer[] ids) {
		return contractCommissionInfoService.deleteContractCommissionInfoByIds(ids);
	}

	/**
	* 删除contract信息
	*
	* @param id contractID
	* @return 结果
	*/
	@Override
	public int deleteContractCommissionInfoById(Integer id) {
		return contractCommissionInfoService.deleteContractCommissionInfoById(id);
	}

}
