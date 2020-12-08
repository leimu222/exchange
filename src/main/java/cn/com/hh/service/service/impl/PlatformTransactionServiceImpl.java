package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.PlatformTransactionMapper;
import com.common.api.model.PlatformTransaction;
import com.common.api.service.IPlatformTransactionService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:08
 * Description: [platform服务实现]
 */
@Service
public class PlatformTransactionServiceImpl implements IPlatformTransactionService {
	@Autowired
	private PlatformTransactionMapper platformTransactionMapper;

	/**
	* 查询platform
	*
	* @param id platformID
	* @return platform
	*/
	@Override
	public PlatformTransaction selectPlatformTransactionById(Long id) {
		return platformTransactionMapper.selectPlatformTransactionById(id);
	}

	/**
	* 查询platform列表
	*
	* @param platformTransaction platform
	* @return platform
	*/
	@Override
	public List<PlatformTransaction> selectPlatformTransactionList(PlatformTransaction platformTransaction) {
		return platformTransactionMapper.selectPlatformTransactionList(platformTransaction);
	}

	/**
	* 新增platform
	*
	* @param platformTransaction platform
	* @return 结果
	*/
	@Override
	public int insertPlatformTransaction(PlatformTransaction platformTransaction) {
		return platformTransactionMapper.insertPlatformTransaction(platformTransaction);
	}

	/**
	* 修改platform
	*
	* @param platformTransaction platform
	* @return 结果
	*/
	@Override
	public int updatePlatformTransaction(PlatformTransaction platformTransaction) {
		return platformTransactionMapper.updatePlatformTransaction(platformTransaction);
	}

	/**
	* 批量删除platform
	*
	* @param ids 需要删除的platformID
	* @return 结果
	*/
	@Override
	public int deletePlatformTransactionByIds(Long[] ids) {
		return platformTransactionMapper.deletePlatformTransactionByIds(ids);
	}

	/**
	* 删除platform信息
	*
	* @param id platformID
	* @return 结果
	*/
	@Override
	public int deletePlatformTransactionById(Long id) {
		return platformTransactionMapper.deletePlatformTransactionById(id);
	}

}
