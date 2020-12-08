package com.common.api.service;

import java.util.List;

import com.common.api.model.unblockExchangeSymbol;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:09
 * Description: [unblockBiz服务]
 */
public interface IUnblockExchangeSymbolBizService {

	/**
	* 查询unblock
	*
	* @param symbol unblockID
	* @return unblock
	*/
	public UnblockExchangeSymbol selectUnblockExchangeSymbolById(String symbol);

	/**
	* 查询unblock列表
	*
	* @param unblockExchangeSymbol unblock
	* @return unblock集合
	*/
	public List<UnblockExchangeSymbol> selectUnblockExchangeSymbolList(UnblockExchangeSymbol unblockExchangeSymbol);

	/**
	* 新增unblock
	*
	* @param unblockExchangeSymbol unblock
	* @return 结果
	*/
	public int insertUnblockExchangeSymbol(UnblockExchangeSymbol unblockExchangeSymbol);

	/**
	* 修改unblock
	*
	* @param unblockExchangeSymbol unblock
	* @return 结果
	*/
	public int updateUnblockExchangeSymbol(UnblockExchangeSymbol unblockExchangeSymbol);

	/**
	* 批量删除unblock
	*
	* @param symbols 需要删除的unblockID
	* @return 结果
	*/
	public int deleteUnblockExchangeSymbolByIds(String[] symbols);

	/**
	* 删除unblock信息
	*
	* @param symbol unblockID
	* @return 结果
	*/
	public int deleteUnblockExchangeSymbolById(String symbol);
	
}
