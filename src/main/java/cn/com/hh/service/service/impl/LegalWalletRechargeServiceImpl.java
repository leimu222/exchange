package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.LegalWalletRechargeMapper;
import com.common.api.model.LegalWalletRecharge;
import com.common.api.service.ILegalWalletRechargeService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:05
 * Description: [legal服务实现]
 */
@Service
public class LegalWalletRechargeServiceImpl implements ILegalWalletRechargeService {
	@Autowired
	private LegalWalletRechargeMapper legalWalletRechargeMapper;

	/**
	* 查询legal
	*
	* @param id legalID
	* @return legal
	*/
	@Override
	public LegalWalletRecharge selectLegalWalletRechargeById(Long id) {
		return legalWalletRechargeMapper.selectLegalWalletRechargeById(id);
	}

	/**
	* 查询legal列表
	*
	* @param legalWalletRecharge legal
	* @return legal
	*/
	@Override
	public List<LegalWalletRecharge> selectLegalWalletRechargeList(LegalWalletRecharge legalWalletRecharge) {
		return legalWalletRechargeMapper.selectLegalWalletRechargeList(legalWalletRecharge);
	}

	/**
	* 新增legal
	*
	* @param legalWalletRecharge legal
	* @return 结果
	*/
	@Override
	public int insertLegalWalletRecharge(LegalWalletRecharge legalWalletRecharge) {
		return legalWalletRechargeMapper.insertLegalWalletRecharge(legalWalletRecharge);
	}

	/**
	* 修改legal
	*
	* @param legalWalletRecharge legal
	* @return 结果
	*/
	@Override
	public int updateLegalWalletRecharge(LegalWalletRecharge legalWalletRecharge) {
		return legalWalletRechargeMapper.updateLegalWalletRecharge(legalWalletRecharge);
	}

	/**
	* 批量删除legal
	*
	* @param ids 需要删除的legalID
	* @return 结果
	*/
	@Override
	public int deleteLegalWalletRechargeByIds(Long[] ids) {
		return legalWalletRechargeMapper.deleteLegalWalletRechargeByIds(ids);
	}

	/**
	* 删除legal信息
	*
	* @param id legalID
	* @return 结果
	*/
	@Override
	public int deleteLegalWalletRechargeById(Long id) {
		return legalWalletRechargeMapper.deleteLegalWalletRechargeById(id);
	}

}
