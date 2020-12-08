package com.common.api.service;

import java.util.List;

import com.common.api.model.poolWallet;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:08
 * Description: [poolBiz服务]
 */
public interface IPoolWalletBizService {

	/**
	* 查询pool
	*
	* @param id poolID
	* @return pool
	*/
	public PoolWallet selectPoolWalletById(Long id);

	/**
	* 查询pool列表
	*
	* @param poolWallet pool
	* @return pool集合
	*/
	public List<PoolWallet> selectPoolWalletList(PoolWallet poolWallet);

	/**
	* 新增pool
	*
	* @param poolWallet pool
	* @return 结果
	*/
	public int insertPoolWallet(PoolWallet poolWallet);

	/**
	* 修改pool
	*
	* @param poolWallet pool
	* @return 结果
	*/
	public int updatePoolWallet(PoolWallet poolWallet);

	/**
	* 批量删除pool
	*
	* @param ids 需要删除的poolID
	* @return 结果
	*/
	public int deletePoolWalletByIds(Long[] ids);

	/**
	* 删除pool信息
	*
	* @param id poolID
	* @return 结果
	*/
	public int deletePoolWalletById(Long id);
	
}
