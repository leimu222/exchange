package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.PoolWalletMapper;
import com.common.api.model.PoolWallet;
import com.common.api.service.IPoolWalletService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:08
 * Description: [poolBiz服务实现]
 */
@Service
public class PoolWalletBizServiceImpl extends CommonService implements IPoolWalletBizService {
	@Autowired
	private IPoolWalletService poolWalletService;

	/**
	* 查询pool
	*
	* @param id poolID
	* @return pool
	*/
	@Override
	public PoolWallet selectPoolWalletById(Long id) {
		return poolWalletService.selectPoolWalletById(id);
	}

	/**
	* 查询pool列表
	*
	* @param poolWallet pool
	* @return pool
	*/
	@Override
	public List<PoolWallet> selectPoolWalletList(PoolWallet poolWallet) {
		return poolWalletService.selectPoolWalletList(poolWallet);
	}

	/**
	* 新增pool
	*
	* @param poolWallet pool
	* @return 结果
	*/
	@Override
	public int insertPoolWallet(PoolWallet poolWallet) {
		return poolWalletService.insertPoolWallet(poolWallet);
	}

	/**
	* 修改pool
	*
	* @param poolWallet pool
	* @return 结果
	*/
	@Override
	public int updatePoolWallet(PoolWallet poolWallet) {
		return poolWalletService.updatePoolWallet(poolWallet);
	}

	/**
	* 批量删除pool
	*
	* @param ids 需要删除的poolID
	* @return 结果
	*/
	@Override
	public int deletePoolWalletByIds(Long[] ids) {
		return poolWalletService.deletePoolWalletByIds(ids);
	}

	/**
	* 删除pool信息
	*
	* @param id poolID
	* @return 结果
	*/
	@Override
	public int deletePoolWalletById(Long id) {
		return poolWalletService.deletePoolWalletById(id);
	}

}
