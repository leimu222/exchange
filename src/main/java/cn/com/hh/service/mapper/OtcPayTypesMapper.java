package com.common.api.mapper;

import com.common.api.model.OtcPayTypes;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:07
  * Description: [otc服务实现]
 */
public interface OtcPayTypesMapper{

	/**
	* 查询otc
	*
	* @param id otcID
	* @return otc
	*/
	public OtcPayTypes selectOtcPayTypesById(Integer id);

	/**
	* 查询otc列表
	*
	* @param otcPayTypes otc
	* @return otc集合
	*/
	public List<OtcPayTypes> selectOtcPayTypesList(OtcPayTypes otcPayTypes);

	/**
	* 新增otc
	*
	* @param otcPayTypes otc
	* @return 结果
	*/
	public int insertOtcPayTypes(OtcPayTypes otcPayTypes);

	/**
	* 修改otc
	*
	* @param otcPayTypes otc
	* @return 结果
	*/
	public int updateOtcPayTypes(OtcPayTypes otcPayTypes);

	/**
	* 删除otc
	*
	* @param id otcID
	* @return 结果
	*/
	public int deleteOtcPayTypesById(Integer id);

	/**
	* 批量删除otc
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteOtcPayTypesByIds(Integer[] ids);

}
