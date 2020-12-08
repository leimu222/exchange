package com.common.api.mapper;

import com.common.api.model.OtcOrder;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:07
  * Description: [otc服务实现]
 */
public interface OtcOrderMapper{

	/**
	* 查询otc
	*
	* @param id otcID
	* @return otc
	*/
	public OtcOrder selectOtcOrderById(Long id);

	/**
	* 查询otc列表
	*
	* @param otcOrder otc
	* @return otc集合
	*/
	public List<OtcOrder> selectOtcOrderList(OtcOrder otcOrder);

	/**
	* 新增otc
	*
	* @param otcOrder otc
	* @return 结果
	*/
	public int insertOtcOrder(OtcOrder otcOrder);

	/**
	* 修改otc
	*
	* @param otcOrder otc
	* @return 结果
	*/
	public int updateOtcOrder(OtcOrder otcOrder);

	/**
	* 删除otc
	*
	* @param id otcID
	* @return 结果
	*/
	public int deleteOtcOrderById(Long id);

	/**
	* 批量删除otc
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteOtcOrderByIds(Long[] ids);

}
