package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.UnblockExchangeSymbolMapper;
import com.common.api.model.UnblockExchangeSymbol;
import com.common.api.service.IUnblockExchangeSymbolService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:09
 * Description: [unblock服务实现]
 */
@Service
public class UnblockExchangeSymbolServiceImpl implements IUnblockExchangeSymbolService {
	@Autowired
	private UnblockExchangeSymbolMapper unblockExchangeSymbolMapper;

	/**
	* 查询unblock
	*
	* @param symbol unblockID
	* @return unblock
	*/
	@Override
	public UnblockExchangeSymbol selectUnblockExchangeSymbolById(String symbol) {
		return unblockExchangeSymbolMapper.selectUnblockExchangeSymbolById(symbol);
	}

	/**
	* 查询unblock列表
	*
	* @param unblockExchangeSymbol unblock
	* @return unblock
	*/
	@Override
	public List<UnblockExchangeSymbol> selectUnblockExchangeSymbolList(UnblockExchangeSymbol unblockExchangeSymbol) {
		return unblockExchangeSymbolMapper.selectUnblockExchangeSymbolList(unblockExchangeSymbol);
	}

	/**
	* 新增unblock
	*
	* @param unblockExchangeSymbol unblock
	* @return 结果
	*/
	@Override
	public int insertUnblockExchangeSymbol(UnblockExchangeSymbol unblockExchangeSymbol) {
		return unblockExchangeSymbolMapper.insertUnblockExchangeSymbol(unblockExchangeSymbol);
	}

	/**
	* 修改unblock
	*
	* @param unblockExchangeSymbol unblock
	* @return 结果
	*/
	@Override
	public int updateUnblockExchangeSymbol(UnblockExchangeSymbol unblockExchangeSymbol) {
		return unblockExchangeSymbolMapper.updateUnblockExchangeSymbol(unblockExchangeSymbol);
	}

	/**
	* 批量删除unblock
	*
	* @param symbols 需要删除的unblockID
	* @return 结果
	*/
	@Override
	public int deleteUnblockExchangeSymbolByIds(String[] symbols) {
		return unblockExchangeSymbolMapper.deleteUnblockExchangeSymbolByIds(symbols);
	}

	/**
	* 删除unblock信息
	*
	* @param symbol unblockID
	* @return 结果
	*/
	@Override
	public int deleteUnblockExchangeSymbolById(String symbol) {
		return unblockExchangeSymbolMapper.deleteUnblockExchangeSymbolById(symbol);
	}

}
