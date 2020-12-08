package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.OtcWalletMapper;
import com.common.api.model.OtcWallet;
import com.common.api.service.IOtcWalletService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:07
 * Description: [otc服务实现]
 */
@Service
public class OtcWalletServiceImpl implements IOtcWalletService {
	@Autowired
	private OtcWalletMapper otcWalletMapper;

	/**
	* 查询otc
	*
	* @param id otcID
	* @return otc
	*/
	@Override
	public OtcWallet selectOtcWalletById(Long id) {
		return otcWalletMapper.selectOtcWalletById(id);
	}

	/**
	* 查询otc列表
	*
	* @param otcWallet otc
	* @return otc
	*/
	@Override
	public List<OtcWallet> selectOtcWalletList(OtcWallet otcWallet) {
		return otcWalletMapper.selectOtcWalletList(otcWallet);
	}

	/**
	* 新增otc
	*
	* @param otcWallet otc
	* @return 结果
	*/
	@Override
	public int insertOtcWallet(OtcWallet otcWallet) {
		return otcWalletMapper.insertOtcWallet(otcWallet);
	}

	/**
	* 修改otc
	*
	* @param otcWallet otc
	* @return 结果
	*/
	@Override
	public int updateOtcWallet(OtcWallet otcWallet) {
		return otcWalletMapper.updateOtcWallet(otcWallet);
	}

	/**
	* 批量删除otc
	*
	* @param ids 需要删除的otcID
	* @return 结果
	*/
	@Override
	public int deleteOtcWalletByIds(Long[] ids) {
		return otcWalletMapper.deleteOtcWalletByIds(ids);
	}

	/**
	* 删除otc信息
	*
	* @param id otcID
	* @return 结果
	*/
	@Override
	public int deleteOtcWalletById(Long id) {
		return otcWalletMapper.deleteOtcWalletById(id);
	}

}
