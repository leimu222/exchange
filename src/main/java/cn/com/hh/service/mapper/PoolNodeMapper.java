package com.common.api.mapper;

import com.common.api.model.PoolNode;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:08
  * Description: [pool服务实现]
 */
public interface PoolNodeMapper{

	/**
	* 查询pool
	*
	* @param id poolID
	* @return pool
	*/
	public PoolNode selectPoolNodeById(Long id);

	/**
	* 查询pool列表
	*
	* @param poolNode pool
	* @return pool集合
	*/
	public List<PoolNode> selectPoolNodeList(PoolNode poolNode);

	/**
	* 新增pool
	*
	* @param poolNode pool
	* @return 结果
	*/
	public int insertPoolNode(PoolNode poolNode);

	/**
	* 修改pool
	*
	* @param poolNode pool
	* @return 结果
	*/
	public int updatePoolNode(PoolNode poolNode);

	/**
	* 删除pool
	*
	* @param id poolID
	* @return 结果
	*/
	public int deletePoolNodeById(Long id);

	/**
	* 批量删除pool
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deletePoolNodeByIds(Long[] ids);

}
