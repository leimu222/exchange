package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.HotWalletInfoMapper;
import com.common.api.model.HotWalletInfo;
import com.common.api.service.IHotWalletInfoService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:05
 * Description: [hotBiz服务实现]
 */
@Service
public class HotWalletInfoBizServiceImpl extends CommonService implements IHotWalletInfoBizService {
	@Autowired
	private IHotWalletInfoService hotWalletInfoService;

	/**
	* 查询hot
	*
	* @param id hotID
	* @return hot
	*/
	@Override
	public HotWalletInfo selectHotWalletInfoById(Integer id) {
		return hotWalletInfoService.selectHotWalletInfoById(id);
	}

	/**
	* 查询hot列表
	*
	* @param hotWalletInfo hot
	* @return hot
	*/
	@Override
	public List<HotWalletInfo> selectHotWalletInfoList(HotWalletInfo hotWalletInfo) {
		return hotWalletInfoService.selectHotWalletInfoList(hotWalletInfo);
	}

	/**
	* 新增hot
	*
	* @param hotWalletInfo hot
	* @return 结果
	*/
	@Override
	public int insertHotWalletInfo(HotWalletInfo hotWalletInfo) {
		return hotWalletInfoService.insertHotWalletInfo(hotWalletInfo);
	}

	/**
	* 修改hot
	*
	* @param hotWalletInfo hot
	* @return 结果
	*/
	@Override
	public int updateHotWalletInfo(HotWalletInfo hotWalletInfo) {
		return hotWalletInfoService.updateHotWalletInfo(hotWalletInfo);
	}

	/**
	* 批量删除hot
	*
	* @param ids 需要删除的hotID
	* @return 结果
	*/
	@Override
	public int deleteHotWalletInfoByIds(Integer[] ids) {
		return hotWalletInfoService.deleteHotWalletInfoByIds(ids);
	}

	/**
	* 删除hot信息
	*
	* @param id hotID
	* @return 结果
	*/
	@Override
	public int deleteHotWalletInfoById(Integer id) {
		return hotWalletInfoService.deleteHotWalletInfoById(id);
	}

}
