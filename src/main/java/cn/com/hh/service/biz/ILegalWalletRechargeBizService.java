package com.common.api.service;

import java.util.List;

import com.common.api.model.legalWalletRecharge;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:05
 * Description: [legalBiz服务]
 */
public interface ILegalWalletRechargeBizService {

	/**
	* 查询legal
	*
	* @param id legalID
	* @return legal
	*/
	public LegalWalletRecharge selectLegalWalletRechargeById(Long id);

	/**
	* 查询legal列表
	*
	* @param legalWalletRecharge legal
	* @return legal集合
	*/
	public List<LegalWalletRecharge> selectLegalWalletRechargeList(LegalWalletRecharge legalWalletRecharge);

	/**
	* 新增legal
	*
	* @param legalWalletRecharge legal
	* @return 结果
	*/
	public int insertLegalWalletRecharge(LegalWalletRecharge legalWalletRecharge);

	/**
	* 修改legal
	*
	* @param legalWalletRecharge legal
	* @return 结果
	*/
	public int updateLegalWalletRecharge(LegalWalletRecharge legalWalletRecharge);

	/**
	* 批量删除legal
	*
	* @param ids 需要删除的legalID
	* @return 结果
	*/
	public int deleteLegalWalletRechargeByIds(Long[] ids);

	/**
	* 删除legal信息
	*
	* @param id legalID
	* @return 结果
	*/
	public int deleteLegalWalletRechargeById(Long id);
	
}
