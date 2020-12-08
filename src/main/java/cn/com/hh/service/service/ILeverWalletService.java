package com.common.api.service;

import java.util.List;

import com.common.api.model.leverWallet;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:05
 * Description: [lever服务]
 */
public interface ILeverWalletService {

	/**
	* 查询lever
	*
	* @param id leverID
	* @return lever
	*/
	public LeverWallet selectLeverWalletById(Long id);

	/**
	* 查询lever列表
	*
	* @param leverWallet lever
	* @return lever集合
	*/
	public List<LeverWallet> selectLeverWalletList(LeverWallet leverWallet);

	/**
	* 新增lever
	*
	* @param leverWallet lever
	* @return 结果
	*/
	public int insertLeverWallet(LeverWallet leverWallet);

	/**
	* 修改lever
	*
	* @param leverWallet lever
	* @return 结果
	*/
	public int updateLeverWallet(LeverWallet leverWallet);

	/**
	* 批量删除lever
	*
	* @param ids 需要删除的leverID
	* @return 结果
	*/
	public int deleteLeverWalletByIds(Long[] ids);

	/**
	* 删除lever信息
	*
	* @param id leverID
	* @return 结果
	*/
	public int deleteLeverWalletById(Long id);
	
}
