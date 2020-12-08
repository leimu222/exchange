package com.common.api.mapper;

import com.common.api.model.TbSms;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:09
  * Description: [tb服务实现]
 */
public interface TbSmsMapper{

	/**
	* 查询tb
	*
	* @param id tbID
	* @return tb
	*/
	public TbSms selectTbSmsById(Long id);

	/**
	* 查询tb列表
	*
	* @param tbSms tb
	* @return tb集合
	*/
	public List<TbSms> selectTbSmsList(TbSms tbSms);

	/**
	* 新增tb
	*
	* @param tbSms tb
	* @return 结果
	*/
	public int insertTbSms(TbSms tbSms);

	/**
	* 修改tb
	*
	* @param tbSms tb
	* @return 结果
	*/
	public int updateTbSms(TbSms tbSms);

	/**
	* 删除tb
	*
	* @param id tbID
	* @return 结果
	*/
	public int deleteTbSmsById(Long id);

	/**
	* 批量删除tb
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteTbSmsByIds(Long[] ids);

}
