package com.common.api.mapper;

import com.common.api.model.UnblockCommonConfig;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:09
  * Description: [unblock服务实现]
 */
public interface UnblockCommonConfigMapper{

	/**
	* 查询unblock
	*
	* @param id unblockID
	* @return unblock
	*/
	public UnblockCommonConfig selectUnblockCommonConfigById(Long id);

	/**
	* 查询unblock列表
	*
	* @param unblockCommonConfig unblock
	* @return unblock集合
	*/
	public List<UnblockCommonConfig> selectUnblockCommonConfigList(UnblockCommonConfig unblockCommonConfig);

	/**
	* 新增unblock
	*
	* @param unblockCommonConfig unblock
	* @return 结果
	*/
	public int insertUnblockCommonConfig(UnblockCommonConfig unblockCommonConfig);

	/**
	* 修改unblock
	*
	* @param unblockCommonConfig unblock
	* @return 结果
	*/
	public int updateUnblockCommonConfig(UnblockCommonConfig unblockCommonConfig);

	/**
	* 删除unblock
	*
	* @param id unblockID
	* @return 结果
	*/
	public int deleteUnblockCommonConfigById(Long id);

	/**
	* 批量删除unblock
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteUnblockCommonConfigByIds(Long[] ids);

}
