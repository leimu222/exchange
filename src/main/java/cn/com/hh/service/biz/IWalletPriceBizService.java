package com.common.api.service;

import java.util.List;

import com.common.api.model.walletPrice;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:09
 * Description: [walletBiz服务]
 */
public interface IWalletPriceBizService {

	/**
	* 查询wallet
	*
	* @param id walletID
	* @return wallet
	*/
	public WalletPrice selectWalletPriceById(Integer id);

	/**
	* 查询wallet列表
	*
	* @param walletPrice wallet
	* @return wallet集合
	*/
	public List<WalletPrice> selectWalletPriceList(WalletPrice walletPrice);

	/**
	* 新增wallet
	*
	* @param walletPrice wallet
	* @return 结果
	*/
	public int insertWalletPrice(WalletPrice walletPrice);

	/**
	* 修改wallet
	*
	* @param walletPrice wallet
	* @return 结果
	*/
	public int updateWalletPrice(WalletPrice walletPrice);

	/**
	* 批量删除wallet
	*
	* @param ids 需要删除的walletID
	* @return 结果
	*/
	public int deleteWalletPriceByIds(Integer[] ids);

	/**
	* 删除wallet信息
	*
	* @param id walletID
	* @return 结果
	*/
	public int deleteWalletPriceById(Integer id);
	
}
