package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.OtcCoinMapper;
import com.common.api.model.OtcCoin;
import com.common.api.service.IOtcCoinService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:07
 * Description: [otcBiz服务实现]
 */
@Service
public class OtcCoinBizServiceImpl extends CommonService implements IOtcCoinBizService {
	@Autowired
	private IOtcCoinService otcCoinService;

	/**
	* 查询otc
	*
	* @param id otcID
	* @return otc
	*/
	@Override
	public OtcCoin selectOtcCoinById(Long id) {
		return otcCoinService.selectOtcCoinById(id);
	}

	/**
	* 查询otc列表
	*
	* @param otcCoin otc
	* @return otc
	*/
	@Override
	public List<OtcCoin> selectOtcCoinList(OtcCoin otcCoin) {
		return otcCoinService.selectOtcCoinList(otcCoin);
	}

	/**
	* 新增otc
	*
	* @param otcCoin otc
	* @return 结果
	*/
	@Override
	public int insertOtcCoin(OtcCoin otcCoin) {
		return otcCoinService.insertOtcCoin(otcCoin);
	}

	/**
	* 修改otc
	*
	* @param otcCoin otc
	* @return 结果
	*/
	@Override
	public int updateOtcCoin(OtcCoin otcCoin) {
		return otcCoinService.updateOtcCoin(otcCoin);
	}

	/**
	* 批量删除otc
	*
	* @param ids 需要删除的otcID
	* @return 结果
	*/
	@Override
	public int deleteOtcCoinByIds(Long[] ids) {
		return otcCoinService.deleteOtcCoinByIds(ids);
	}

	/**
	* 删除otc信息
	*
	* @param id otcID
	* @return 结果
	*/
	@Override
	public int deleteOtcCoinById(Long id) {
		return otcCoinService.deleteOtcCoinById(id);
	}

}
