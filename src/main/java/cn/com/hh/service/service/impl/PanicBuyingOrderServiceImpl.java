package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.PanicBuyingOrderMapper;
import com.common.api.model.PanicBuyingOrder;
import com.common.api.service.IPanicBuyingOrderService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:08
 * Description: [panic服务实现]
 */
@Service
public class PanicBuyingOrderServiceImpl implements IPanicBuyingOrderService {
	@Autowired
	private PanicBuyingOrderMapper panicBuyingOrderMapper;

	/**
	* 查询panic
	*
	* @param id panicID
	* @return panic
	*/
	@Override
	public PanicBuyingOrder selectPanicBuyingOrderById(Long id) {
		return panicBuyingOrderMapper.selectPanicBuyingOrderById(id);
	}

	/**
	* 查询panic列表
	*
	* @param panicBuyingOrder panic
	* @return panic
	*/
	@Override
	public List<PanicBuyingOrder> selectPanicBuyingOrderList(PanicBuyingOrder panicBuyingOrder) {
		return panicBuyingOrderMapper.selectPanicBuyingOrderList(panicBuyingOrder);
	}

	/**
	* 新增panic
	*
	* @param panicBuyingOrder panic
	* @return 结果
	*/
	@Override
	public int insertPanicBuyingOrder(PanicBuyingOrder panicBuyingOrder) {
		return panicBuyingOrderMapper.insertPanicBuyingOrder(panicBuyingOrder);
	}

	/**
	* 修改panic
	*
	* @param panicBuyingOrder panic
	* @return 结果
	*/
	@Override
	public int updatePanicBuyingOrder(PanicBuyingOrder panicBuyingOrder) {
		return panicBuyingOrderMapper.updatePanicBuyingOrder(panicBuyingOrder);
	}

	/**
	* 批量删除panic
	*
	* @param ids 需要删除的panicID
	* @return 结果
	*/
	@Override
	public int deletePanicBuyingOrderByIds(Long[] ids) {
		return panicBuyingOrderMapper.deletePanicBuyingOrderByIds(ids);
	}

	/**
	* 删除panic信息
	*
	* @param id panicID
	* @return 结果
	*/
	@Override
	public int deletePanicBuyingOrderById(Long id) {
		return panicBuyingOrderMapper.deletePanicBuyingOrderById(id);
	}

}
