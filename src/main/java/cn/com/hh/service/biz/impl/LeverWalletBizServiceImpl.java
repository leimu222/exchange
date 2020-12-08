package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.LeverWalletMapper;
import com.common.api.model.LeverWallet;
import com.common.api.service.ILeverWalletService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:05
 * Description: [leverBiz服务实现]
 */
@Service
public class LeverWalletBizServiceImpl extends CommonService implements ILeverWalletBizService {
	@Autowired
	private ILeverWalletService leverWalletService;

	/**
	* 查询lever
	*
	* @param id leverID
	* @return lever
	*/
	@Override
	public LeverWallet selectLeverWalletById(Long id) {
		return leverWalletService.selectLeverWalletById(id);
	}

	/**
	* 查询lever列表
	*
	* @param leverWallet lever
	* @return lever
	*/
	@Override
	public List<LeverWallet> selectLeverWalletList(LeverWallet leverWallet) {
		return leverWalletService.selectLeverWalletList(leverWallet);
	}

	/**
	* 新增lever
	*
	* @param leverWallet lever
	* @return 结果
	*/
	@Override
	public int insertLeverWallet(LeverWallet leverWallet) {
		return leverWalletService.insertLeverWallet(leverWallet);
	}

	/**
	* 修改lever
	*
	* @param leverWallet lever
	* @return 结果
	*/
	@Override
	public int updateLeverWallet(LeverWallet leverWallet) {
		return leverWalletService.updateLeverWallet(leverWallet);
	}

	/**
	* 批量删除lever
	*
	* @param ids 需要删除的leverID
	* @return 结果
	*/
	@Override
	public int deleteLeverWalletByIds(Long[] ids) {
		return leverWalletService.deleteLeverWalletByIds(ids);
	}

	/**
	* 删除lever信息
	*
	* @param id leverID
	* @return 结果
	*/
	@Override
	public int deleteLeverWalletById(Long id) {
		return leverWalletService.deleteLeverWalletById(id);
	}

}
