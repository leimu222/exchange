package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.DepositWalletMapper;
import com.common.api.model.DepositWallet;
import com.common.api.service.IDepositWalletService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:04
 * Description: [depositBiz服务实现]
 */
@Service
public class DepositWalletBizServiceImpl extends CommonService implements IDepositWalletBizService {
	@Autowired
	private IDepositWalletService depositWalletService;

	/**
	* 查询deposit
	*
	* @param id depositID
	* @return deposit
	*/
	@Override
	public DepositWallet selectDepositWalletById(Integer id) {
		return depositWalletService.selectDepositWalletById(id);
	}

	/**
	* 查询deposit列表
	*
	* @param depositWallet deposit
	* @return deposit
	*/
	@Override
	public List<DepositWallet> selectDepositWalletList(DepositWallet depositWallet) {
		return depositWalletService.selectDepositWalletList(depositWallet);
	}

	/**
	* 新增deposit
	*
	* @param depositWallet deposit
	* @return 结果
	*/
	@Override
	public int insertDepositWallet(DepositWallet depositWallet) {
		return depositWalletService.insertDepositWallet(depositWallet);
	}

	/**
	* 修改deposit
	*
	* @param depositWallet deposit
	* @return 结果
	*/
	@Override
	public int updateDepositWallet(DepositWallet depositWallet) {
		return depositWalletService.updateDepositWallet(depositWallet);
	}

	/**
	* 批量删除deposit
	*
	* @param ids 需要删除的depositID
	* @return 结果
	*/
	@Override
	public int deleteDepositWalletByIds(Integer[] ids) {
		return depositWalletService.deleteDepositWalletByIds(ids);
	}

	/**
	* 删除deposit信息
	*
	* @param id depositID
	* @return 结果
	*/
	@Override
	public int deleteDepositWalletById(Integer id) {
		return depositWalletService.deleteDepositWalletById(id);
	}

}
