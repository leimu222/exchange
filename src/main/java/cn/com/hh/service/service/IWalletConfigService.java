package com.common.api.service;

import java.util.List;

import com.common.api.model.walletConfig;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:09
 * Description: [wallet服务]
 */
public interface IWalletConfigService {

	/**
	* 查询wallet
	*
	* @param id walletID
	* @return wallet
	*/
	public WalletConfig selectWalletConfigById(Integer id);

	/**
	* 查询wallet列表
	*
	* @param walletConfig wallet
	* @return wallet集合
	*/
	public List<WalletConfig> selectWalletConfigList(WalletConfig walletConfig);

	/**
	* 新增wallet
	*
	* @param walletConfig wallet
	* @return 结果
	*/
	public int insertWalletConfig(WalletConfig walletConfig);

	/**
	* 修改wallet
	*
	* @param walletConfig wallet
	* @return 结果
	*/
	public int updateWalletConfig(WalletConfig walletConfig);

	/**
	* 批量删除wallet
	*
	* @param ids 需要删除的walletID
	* @return 结果
	*/
	public int deleteWalletConfigByIds(Integer[] ids);

	/**
	* 删除wallet信息
	*
	* @param id walletID
	* @return 结果
	*/
	public int deleteWalletConfigById(Integer id);
	
}
