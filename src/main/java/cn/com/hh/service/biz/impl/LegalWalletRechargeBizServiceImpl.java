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
 * Description: [legalBiz服务实现]
 */
@Service
public class LegalWalletRechargeBizServiceImpl extends CommonService implements ILegalWalletRechargeBizService {
	@Autowired
	private ILegalWalletRechargeService legalWalletRechargeService;

	/**
	* 查询legal
	*
	* @param id legalID
	* @return legal
	*/
	@Override
	public LegalWalletRecharge selectLegalWalletRechargeById(Long id) {
		return legalWalletRechargeService.selectLegalWalletRechargeById(id);
	}

	/**
	* 查询legal列表
	*
	* @param legalWalletRecharge legal
	* @return legal
	*/
	@Override
	public List<LegalWalletRecharge> selectLegalWalletRechargeList(LegalWalletRecharge legalWalletRecharge) {
		return legalWalletRechargeService.selectLegalWalletRechargeList(legalWalletRecharge);
	}

	/**
	* 新增legal
	*
	* @param legalWalletRecharge legal
	* @return 结果
	*/
	@Override
	public int insertLegalWalletRecharge(LegalWalletRecharge legalWalletRecharge) {
		return legalWalletRechargeService.insertLegalWalletRecharge(legalWalletRecharge);
	}

	/**
	* 修改legal
	*
	* @param legalWalletRecharge legal
	* @return 结果
	*/
	@Override
	public int updateLegalWalletRecharge(LegalWalletRecharge legalWalletRecharge) {
		return legalWalletRechargeService.updateLegalWalletRecharge(legalWalletRecharge);
	}

	/**
	* 批量删除legal
	*
	* @param ids 需要删除的legalID
	* @return 结果
	*/
	@Override
	public int deleteLegalWalletRechargeByIds(Long[] ids) {
		return legalWalletRechargeService.deleteLegalWalletRechargeByIds(ids);
	}

	/**
	* 删除legal信息
	*
	* @param id legalID
	* @return 结果
	*/
	@Override
	public int deleteLegalWalletRechargeById(Long id) {
		return legalWalletRechargeService.deleteLegalWalletRechargeById(id);
	}

}
