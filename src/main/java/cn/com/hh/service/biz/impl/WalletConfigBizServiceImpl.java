package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.WalletConfigMapper;
import com.common.api.model.WalletConfig;
import com.common.api.service.IWalletConfigService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:09
 * Description: [walletBiz服务实现]
 */
@Service
public class WalletConfigBizServiceImpl extends CommonService implements IWalletConfigBizService {
	@Autowired
	private IWalletConfigService walletConfigService;

	/**
	* 查询wallet
	*
	* @param id walletID
	* @return wallet
	*/
	@Override
	public WalletConfig selectWalletConfigById(Integer id) {
		return walletConfigService.selectWalletConfigById(id);
	}

	/**
	* 查询wallet列表
	*
	* @param walletConfig wallet
	* @return wallet
	*/
	@Override
	public List<WalletConfig> selectWalletConfigList(WalletConfig walletConfig) {
		return walletConfigService.selectWalletConfigList(walletConfig);
	}

	/**
	* 新增wallet
	*
	* @param walletConfig wallet
	* @return 结果
	*/
	@Override
	public int insertWalletConfig(WalletConfig walletConfig) {
		return walletConfigService.insertWalletConfig(walletConfig);
	}

	/**
	* 修改wallet
	*
	* @param walletConfig wallet
	* @return 结果
	*/
	@Override
	public int updateWalletConfig(WalletConfig walletConfig) {
		return walletConfigService.updateWalletConfig(walletConfig);
	}

	/**
	* 批量删除wallet
	*
	* @param ids 需要删除的walletID
	* @return 结果
	*/
	@Override
	public int deleteWalletConfigByIds(Integer[] ids) {
		return walletConfigService.deleteWalletConfigByIds(ids);
	}

	/**
	* 删除wallet信息
	*
	* @param id walletID
	* @return 结果
	*/
	@Override
	public int deleteWalletConfigById(Integer id) {
		return walletConfigService.deleteWalletConfigById(id);
	}

}
