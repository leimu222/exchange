package com.common.api.mapper;

import com.common.api.model.UnblockExchangeSymbol;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:09
  * Description: [unblock服务实现]
 */
public interface UnblockExchangeSymbolMapper{

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
	* 删除unblock
	*
	* @param symbol unblockID
	* @return 结果
	*/
	public int deleteUnblockExchangeSymbolById(String symbol);

	/**
	* 批量删除unblock
	*
	* @param symbols 需要删除的数据ID
	* @return 结果
	*/
	public int deleteUnblockExchangeSymbolByIds(String[] symbols);

}
