package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.CoinConvertMapper;
import com.common.api.model.CoinConvert;
import com.common.api.service.ICoinConvertService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:01
 * Description: [coinBiz服务实现]
 */
@Service
public class CoinConvertBizServiceImpl extends CommonService implements ICoinConvertBizService {
	@Autowired
	private ICoinConvertService coinConvertService;

	/**
	* 查询coin
	*
	* @param id coinID
	* @return coin
	*/
	@Override
	public CoinConvert selectCoinConvertById(Integer id) {
		return coinConvertService.selectCoinConvertById(id);
	}

	/**
	* 查询coin列表
	*
	* @param coinConvert coin
	* @return coin
	*/
	@Override
	public List<CoinConvert> selectCoinConvertList(CoinConvert coinConvert) {
		return coinConvertService.selectCoinConvertList(coinConvert);
	}

	/**
	* 新增coin
	*
	* @param coinConvert coin
	* @return 结果
	*/
	@Override
	public int insertCoinConvert(CoinConvert coinConvert) {
		return coinConvertService.insertCoinConvert(coinConvert);
	}

	/**
	* 修改coin
	*
	* @param coinConvert coin
	* @return 结果
	*/
	@Override
	public int updateCoinConvert(CoinConvert coinConvert) {
		return coinConvertService.updateCoinConvert(coinConvert);
	}

	/**
	* 批量删除coin
	*
	* @param ids 需要删除的coinID
	* @return 结果
	*/
	@Override
	public int deleteCoinConvertByIds(Integer[] ids) {
		return coinConvertService.deleteCoinConvertByIds(ids);
	}

	/**
	* 删除coin信息
	*
	* @param id coinID
	* @return 结果
	*/
	@Override
	public int deleteCoinConvertById(Integer id) {
		return coinConvertService.deleteCoinConvertById(id);
	}

}
