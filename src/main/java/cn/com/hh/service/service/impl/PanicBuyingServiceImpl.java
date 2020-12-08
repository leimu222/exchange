package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.PanicBuyingMapper;
import com.common.api.model.PanicBuying;
import com.common.api.service.IPanicBuyingService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:08
 * Description: [panic服务实现]
 */
@Service
public class PanicBuyingServiceImpl implements IPanicBuyingService {
	@Autowired
	private PanicBuyingMapper panicBuyingMapper;

	/**
	* 查询panic
	*
	* @param id panicID
	* @return panic
	*/
	@Override
	public PanicBuying selectPanicBuyingById(Long id) {
		return panicBuyingMapper.selectPanicBuyingById(id);
	}

	/**
	* 查询panic列表
	*
	* @param panicBuying panic
	* @return panic
	*/
	@Override
	public List<PanicBuying> selectPanicBuyingList(PanicBuying panicBuying) {
		return panicBuyingMapper.selectPanicBuyingList(panicBuying);
	}

	/**
	* 新增panic
	*
	* @param panicBuying panic
	* @return 结果
	*/
	@Override
	public int insertPanicBuying(PanicBuying panicBuying) {
		return panicBuyingMapper.insertPanicBuying(panicBuying);
	}

	/**
	* 修改panic
	*
	* @param panicBuying panic
	* @return 结果
	*/
	@Override
	public int updatePanicBuying(PanicBuying panicBuying) {
		return panicBuyingMapper.updatePanicBuying(panicBuying);
	}

	/**
	* 批量删除panic
	*
	* @param ids 需要删除的panicID
	* @return 结果
	*/
	@Override
	public int deletePanicBuyingByIds(Long[] ids) {
		return panicBuyingMapper.deletePanicBuyingByIds(ids);
	}

	/**
	* 删除panic信息
	*
	* @param id panicID
	* @return 结果
	*/
	@Override
	public int deletePanicBuyingById(Long id) {
		return panicBuyingMapper.deletePanicBuyingById(id);
	}

}
