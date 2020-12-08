package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.ContractDoubleMemberApiMapper;
import com.common.api.model.ContractDoubleMemberApi;
import com.common.api.service.IContractDoubleMemberApiService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:03
 * Description: [contract服务实现]
 */
@Service
public class ContractDoubleMemberApiServiceImpl implements IContractDoubleMemberApiService {
	@Autowired
	private ContractDoubleMemberApiMapper contractDoubleMemberApiMapper;

	/**
	* 查询contract
	*
	* @param id contractID
	* @return contract
	*/
	@Override
	public ContractDoubleMemberApi selectContractDoubleMemberApiById(Long id) {
		return contractDoubleMemberApiMapper.selectContractDoubleMemberApiById(id);
	}

	/**
	* 查询contract列表
	*
	* @param contractDoubleMemberApi contract
	* @return contract
	*/
	@Override
	public List<ContractDoubleMemberApi> selectContractDoubleMemberApiList(ContractDoubleMemberApi contractDoubleMemberApi) {
		return contractDoubleMemberApiMapper.selectContractDoubleMemberApiList(contractDoubleMemberApi);
	}

	/**
	* 新增contract
	*
	* @param contractDoubleMemberApi contract
	* @return 结果
	*/
	@Override
	public int insertContractDoubleMemberApi(ContractDoubleMemberApi contractDoubleMemberApi) {
		return contractDoubleMemberApiMapper.insertContractDoubleMemberApi(contractDoubleMemberApi);
	}

	/**
	* 修改contract
	*
	* @param contractDoubleMemberApi contract
	* @return 结果
	*/
	@Override
	public int updateContractDoubleMemberApi(ContractDoubleMemberApi contractDoubleMemberApi) {
		return contractDoubleMemberApiMapper.updateContractDoubleMemberApi(contractDoubleMemberApi);
	}

	/**
	* 批量删除contract
	*
	* @param ids 需要删除的contractID
	* @return 结果
	*/
	@Override
	public int deleteContractDoubleMemberApiByIds(Long[] ids) {
		return contractDoubleMemberApiMapper.deleteContractDoubleMemberApiByIds(ids);
	}

	/**
	* 删除contract信息
	*
	* @param id contractID
	* @return 结果
	*/
	@Override
	public int deleteContractDoubleMemberApiById(Long id) {
		return contractDoubleMemberApiMapper.deleteContractDoubleMemberApiById(id);
	}

}
