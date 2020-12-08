package com.common.api.service;

import java.util.List;

import com.common.api.model.panicBuying;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:08
 * Description: [panicBiz服务]
 */
public interface IPanicBuyingBizService {

	/**
	* 查询panic
	*
	* @param id panicID
	* @return panic
	*/
	public PanicBuying selectPanicBuyingById(Long id);

	/**
	* 查询panic列表
	*
	* @param panicBuying panic
	* @return panic集合
	*/
	public List<PanicBuying> selectPanicBuyingList(PanicBuying panicBuying);

	/**
	* 新增panic
	*
	* @param panicBuying panic
	* @return 结果
	*/
	public int insertPanicBuying(PanicBuying panicBuying);

	/**
	* 修改panic
	*
	* @param panicBuying panic
	* @return 结果
	*/
	public int updatePanicBuying(PanicBuying panicBuying);

	/**
	* 批量删除panic
	*
	* @param ids 需要删除的panicID
	* @return 结果
	*/
	public int deletePanicBuyingByIds(Long[] ids);

	/**
	* 删除panic信息
	*
	* @param id panicID
	* @return 结果
	*/
	public int deletePanicBuyingById(Long id);
	
}
