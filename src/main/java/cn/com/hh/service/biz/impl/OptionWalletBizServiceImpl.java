package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.OptionWalletMapper;
import com.common.api.model.OptionWallet;
import com.common.api.service.IOptionWalletService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:07
 * Description: [optionBiz服务实现]
 */
@Service
public class OptionWalletBizServiceImpl extends CommonService implements IOptionWalletBizService {
	@Autowired
	private IOptionWalletService optionWalletService;

	/**
	* 查询option
	*
	* @param id optionID
	* @return option
	*/
	@Override
	public OptionWallet selectOptionWalletById(Long id) {
		return optionWalletService.selectOptionWalletById(id);
	}

	/**
	* 查询option列表
	*
	* @param optionWallet option
	* @return option
	*/
	@Override
	public List<OptionWallet> selectOptionWalletList(OptionWallet optionWallet) {
		return optionWalletService.selectOptionWalletList(optionWallet);
	}

	/**
	* 新增option
	*
	* @param optionWallet option
	* @return 结果
	*/
	@Override
	public int insertOptionWallet(OptionWallet optionWallet) {
		return optionWalletService.insertOptionWallet(optionWallet);
	}

	/**
	* 修改option
	*
	* @param optionWallet option
	* @return 结果
	*/
	@Override
	public int updateOptionWallet(OptionWallet optionWallet) {
		return optionWalletService.updateOptionWallet(optionWallet);
	}

	/**
	* 批量删除option
	*
	* @param ids 需要删除的optionID
	* @return 结果
	*/
	@Override
	public int deleteOptionWalletByIds(Long[] ids) {
		return optionWalletService.deleteOptionWalletByIds(ids);
	}

	/**
	* 删除option信息
	*
	* @param id optionID
	* @return 结果
	*/
	@Override
	public int deleteOptionWalletById(Long id) {
		return optionWalletService.deleteOptionWalletById(id);
	}

}
