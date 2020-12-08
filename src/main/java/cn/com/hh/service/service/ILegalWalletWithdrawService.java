package com.common.api.service;

import java.util.List;

import com.common.api.model.legalWalletWithdraw;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:05
 * Description: [legal服务]
 */
public interface ILegalWalletWithdrawService {

	/**
	* 查询legal
	*
	* @param id legalID
	* @return legal
	*/
	public LegalWalletWithdraw selectLegalWalletWithdrawById(Long id);

	/**
	* 查询legal列表
	*
	* @param legalWalletWithdraw legal
	* @return legal集合
	*/
	public List<LegalWalletWithdraw> selectLegalWalletWithdrawList(LegalWalletWithdraw legalWalletWithdraw);

	/**
	* 新增legal
	*
	* @param legalWalletWithdraw legal
	* @return 结果
	*/
	public int insertLegalWalletWithdraw(LegalWalletWithdraw legalWalletWithdraw);

	/**
	* 修改legal
	*
	* @param legalWalletWithdraw legal
	* @return 结果
	*/
	public int updateLegalWalletWithdraw(LegalWalletWithdraw legalWalletWithdraw);

	/**
	* 批量删除legal
	*
	* @param ids 需要删除的legalID
	* @return 结果
	*/
	public int deleteLegalWalletWithdrawByIds(Long[] ids);

	/**
	* 删除legal信息
	*
	* @param id legalID
	* @return 结果
	*/
	public int deleteLegalWalletWithdrawById(Long id);
	
}
