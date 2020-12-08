package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.OtcOrderMapper;
import com.common.api.model.OtcOrder;
import com.common.api.service.IOtcOrderService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:07
 * Description: [otcBiz服务实现]
 */
@Service
public class OtcOrderBizServiceImpl extends CommonService implements IOtcOrderBizService {
	@Autowired
	private IOtcOrderService otcOrderService;

	/**
	* 查询otc
	*
	* @param id otcID
	* @return otc
	*/
	@Override
	public OtcOrder selectOtcOrderById(Long id) {
		return otcOrderService.selectOtcOrderById(id);
	}

	/**
	* 查询otc列表
	*
	* @param otcOrder otc
	* @return otc
	*/
	@Override
	public List<OtcOrder> selectOtcOrderList(OtcOrder otcOrder) {
		return otcOrderService.selectOtcOrderList(otcOrder);
	}

	/**
	* 新增otc
	*
	* @param otcOrder otc
	* @return 结果
	*/
	@Override
	public int insertOtcOrder(OtcOrder otcOrder) {
		return otcOrderService.insertOtcOrder(otcOrder);
	}

	/**
	* 修改otc
	*
	* @param otcOrder otc
	* @return 结果
	*/
	@Override
	public int updateOtcOrder(OtcOrder otcOrder) {
		return otcOrderService.updateOtcOrder(otcOrder);
	}

	/**
	* 批量删除otc
	*
	* @param ids 需要删除的otcID
	* @return 结果
	*/
	@Override
	public int deleteOtcOrderByIds(Long[] ids) {
		return otcOrderService.deleteOtcOrderByIds(ids);
	}

	/**
	* 删除otc信息
	*
	* @param id otcID
	* @return 结果
	*/
	@Override
	public int deleteOtcOrderById(Long id) {
		return otcOrderService.deleteOtcOrderById(id);
	}

}
