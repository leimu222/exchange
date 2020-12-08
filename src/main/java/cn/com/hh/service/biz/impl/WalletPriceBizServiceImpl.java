package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.WalletPriceMapper;
import com.common.api.model.WalletPrice;
import com.common.api.service.IWalletPriceService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:09
 * Description: [walletBiz服务实现]
 */
@Service
public class WalletPriceBizServiceImpl extends CommonService implements IWalletPriceBizService {
	@Autowired
	private IWalletPriceService walletPriceService;

	/**
	* 查询wallet
	*
	* @param id walletID
	* @return wallet
	*/
	@Override
	public WalletPrice selectWalletPriceById(Integer id) {
		return walletPriceService.selectWalletPriceById(id);
	}

	/**
	* 查询wallet列表
	*
	* @param walletPrice wallet
	* @return wallet
	*/
	@Override
	public List<WalletPrice> selectWalletPriceList(WalletPrice walletPrice) {
		return walletPriceService.selectWalletPriceList(walletPrice);
	}

	/**
	* 新增wallet
	*
	* @param walletPrice wallet
	* @return 结果
	*/
	@Override
	public int insertWalletPrice(WalletPrice walletPrice) {
		return walletPriceService.insertWalletPrice(walletPrice);
	}

	/**
	* 修改wallet
	*
	* @param walletPrice wallet
	* @return 结果
	*/
	@Override
	public int updateWalletPrice(WalletPrice walletPrice) {
		return walletPriceService.updateWalletPrice(walletPrice);
	}

	/**
	* 批量删除wallet
	*
	* @param ids 需要删除的walletID
	* @return 结果
	*/
	@Override
	public int deleteWalletPriceByIds(Integer[] ids) {
		return walletPriceService.deleteWalletPriceByIds(ids);
	}

	/**
	* 删除wallet信息
	*
	* @param id walletID
	* @return 结果
	*/
	@Override
	public int deleteWalletPriceById(Integer id) {
		return walletPriceService.deleteWalletPriceById(id);
	}

}
