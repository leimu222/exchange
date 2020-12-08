package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.ContractMemberStatusRecordMapper;
import com.common.api.model.ContractMemberStatusRecord;
import com.common.api.service.IContractMemberStatusRecordService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:03
 * Description: [contractBiz服务实现]
 */
@Service
public class ContractMemberStatusRecordBizServiceImpl extends CommonService implements IContractMemberStatusRecordBizService {
	@Autowired
	private IContractMemberStatusRecordService contractMemberStatusRecordService;

	/**
	* 查询contract
	*
	* @param id contractID
	* @return contract
	*/
	@Override
	public ContractMemberStatusRecord selectContractMemberStatusRecordById(Long id) {
		return contractMemberStatusRecordService.selectContractMemberStatusRecordById(id);
	}

	/**
	* 查询contract列表
	*
	* @param contractMemberStatusRecord contract
	* @return contract
	*/
	@Override
	public List<ContractMemberStatusRecord> selectContractMemberStatusRecordList(ContractMemberStatusRecord contractMemberStatusRecord) {
		return contractMemberStatusRecordService.selectContractMemberStatusRecordList(contractMemberStatusRecord);
	}

	/**
	* 新增contract
	*
	* @param contractMemberStatusRecord contract
	* @return 结果
	*/
	@Override
	public int insertContractMemberStatusRecord(ContractMemberStatusRecord contractMemberStatusRecord) {
		return contractMemberStatusRecordService.insertContractMemberStatusRecord(contractMemberStatusRecord);
	}

	/**
	* 修改contract
	*
	* @param contractMemberStatusRecord contract
	* @return 结果
	*/
	@Override
	public int updateContractMemberStatusRecord(ContractMemberStatusRecord contractMemberStatusRecord) {
		return contractMemberStatusRecordService.updateContractMemberStatusRecord(contractMemberStatusRecord);
	}

	/**
	* 批量删除contract
	*
	* @param ids 需要删除的contractID
	* @return 结果
	*/
	@Override
	public int deleteContractMemberStatusRecordByIds(Long[] ids) {
		return contractMemberStatusRecordService.deleteContractMemberStatusRecordByIds(ids);
	}

	/**
	* 删除contract信息
	*
	* @param id contractID
	* @return 结果
	*/
	@Override
	public int deleteContractMemberStatusRecordById(Long id) {
		return contractMemberStatusRecordService.deleteContractMemberStatusRecordById(id);
	}

}
