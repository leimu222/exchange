package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.LegalWalletWithdrawMapper;
import com.common.api.model.LegalWalletWithdraw;
import com.common.api.service.ILegalWalletWithdrawService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:05
 * Description: [legalBiz服务实现]
 */
@Service
public class LegalWalletWithdrawBizServiceImpl extends CommonService implements ILegalWalletWithdrawBizService {
	@Autowired
	private ILegalWalletWithdrawService legalWalletWithdrawService;

	/**
	* 查询legal
	*
	* @param id legalID
	* @return legal
	*/
	@Override
	public LegalWalletWithdraw selectLegalWalletWithdrawById(Long id) {
		return legalWalletWithdrawService.selectLegalWalletWithdrawById(id);
	}

	/**
	* 查询legal列表
	*
	* @param legalWalletWithdraw legal
	* @return legal
	*/
	@Override
	public List<LegalWalletWithdraw> selectLegalWalletWithdrawList(LegalWalletWithdraw legalWalletWithdraw) {
		return legalWalletWithdrawService.selectLegalWalletWithdrawList(legalWalletWithdraw);
	}

	/**
	* 新增legal
	*
	* @param legalWalletWithdraw legal
	* @return 结果
	*/
	@Override
	public int insertLegalWalletWithdraw(LegalWalletWithdraw legalWalletWithdraw) {
		return legalWalletWithdrawService.insertLegalWalletWithdraw(legalWalletWithdraw);
	}

	/**
	* 修改legal
	*
	* @param legalWalletWithdraw legal
	* @return 结果
	*/
	@Override
	public int updateLegalWalletWithdraw(LegalWalletWithdraw legalWalletWithdraw) {
		return legalWalletWithdrawService.updateLegalWalletWithdraw(legalWalletWithdraw);
	}

	/**
	* 批量删除legal
	*
	* @param ids 需要删除的legalID
	* @return 结果
	*/
	@Override
	public int deleteLegalWalletWithdrawByIds(Long[] ids) {
		return legalWalletWithdrawService.deleteLegalWalletWithdrawByIds(ids);
	}

	/**
	* 删除legal信息
	*
	* @param id legalID
	* @return 结果
	*/
	@Override
	public int deleteLegalWalletWithdrawById(Long id) {
		return legalWalletWithdrawService.deleteLegalWalletWithdrawById(id);
	}

}
