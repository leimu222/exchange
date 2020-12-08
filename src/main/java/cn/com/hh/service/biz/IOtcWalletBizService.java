package com.common.api.service;

import java.util.List;

import com.common.api.model.otcWallet;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:07
 * Description: [otcBiz服务]
 */
public interface IOtcWalletBizService {

	/**
	* 查询otc
	*
	* @param id otcID
	* @return otc
	*/
	public OtcWallet selectOtcWalletById(Long id);

	/**
	* 查询otc列表
	*
	* @param otcWallet otc
	* @return otc集合
	*/
	public List<OtcWallet> selectOtcWalletList(OtcWallet otcWallet);

	/**
	* 新增otc
	*
	* @param otcWallet otc
	* @return 结果
	*/
	public int insertOtcWallet(OtcWallet otcWallet);

	/**
	* 修改otc
	*
	* @param otcWallet otc
	* @return 结果
	*/
	public int updateOtcWallet(OtcWallet otcWallet);

	/**
	* 批量删除otc
	*
	* @param ids 需要删除的otcID
	* @return 结果
	*/
	public int deleteOtcWalletByIds(Long[] ids);

	/**
	* 删除otc信息
	*
	* @param id otcID
	* @return 结果
	*/
	public int deleteOtcWalletById(Long id);
	
}
