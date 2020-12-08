package com.common.api.service;

import java.util.List;

import com.common.api.model.depositWallet;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:04
 * Description: [depositBiz服务]
 */
public interface IDepositWalletBizService {

	/**
	* 查询deposit
	*
	* @param id depositID
	* @return deposit
	*/
	public DepositWallet selectDepositWalletById(Integer id);

	/**
	* 查询deposit列表
	*
	* @param depositWallet deposit
	* @return deposit集合
	*/
	public List<DepositWallet> selectDepositWalletList(DepositWallet depositWallet);

	/**
	* 新增deposit
	*
	* @param depositWallet deposit
	* @return 结果
	*/
	public int insertDepositWallet(DepositWallet depositWallet);

	/**
	* 修改deposit
	*
	* @param depositWallet deposit
	* @return 结果
	*/
	public int updateDepositWallet(DepositWallet depositWallet);

	/**
	* 批量删除deposit
	*
	* @param ids 需要删除的depositID
	* @return 结果
	*/
	public int deleteDepositWalletByIds(Integer[] ids);

	/**
	* 删除deposit信息
	*
	* @param id depositID
	* @return 结果
	*/
	public int deleteDepositWalletById(Integer id);
	
}
