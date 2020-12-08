package com.common.api.mapper;

import com.common.api.model.Sign;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:08
  * Description: [sign服务实现]
 */
public interface SignMapper{

	/**
	* 查询sign
	*
	* @param id signID
	* @return sign
	*/
	public Sign selectSignById(Long id);

	/**
	* 查询sign列表
	*
	* @param sign sign
	* @return sign集合
	*/
	public List<Sign> selectSignList(Sign sign);

	/**
	* 新增sign
	*
	* @param sign sign
	* @return 结果
	*/
	public int insertSign(Sign sign);

	/**
	* 修改sign
	*
	* @param sign sign
	* @return 结果
	*/
	public int updateSign(Sign sign);

	/**
	* 删除sign
	*
	* @param id signID
	* @return 结果
	*/
	public int deleteSignById(Long id);

	/**
	* 批量删除sign
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteSignByIds(Long[] ids);

}
