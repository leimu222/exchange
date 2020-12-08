package com.common.api.mapper;

import com.common.api.model.PanicBuying;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:08
  * Description: [panic服务实现]
 */
public interface PanicBuyingMapper{

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
	* 删除panic
	*
	* @param id panicID
	* @return 结果
	*/
	public int deletePanicBuyingById(Long id);

	/**
	* 批量删除panic
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deletePanicBuyingByIds(Long[] ids);

}
