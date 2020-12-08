package com.common.api.mapper;

import com.common.api.model.PoolGrade;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:08
  * Description: [pool服务实现]
 */
public interface PoolGradeMapper{

	/**
	* 查询pool
	*
	* @param id poolID
	* @return pool
	*/
	public PoolGrade selectPoolGradeById(Long id);

	/**
	* 查询pool列表
	*
	* @param poolGrade pool
	* @return pool集合
	*/
	public List<PoolGrade> selectPoolGradeList(PoolGrade poolGrade);

	/**
	* 新增pool
	*
	* @param poolGrade pool
	* @return 结果
	*/
	public int insertPoolGrade(PoolGrade poolGrade);

	/**
	* 修改pool
	*
	* @param poolGrade pool
	* @return 结果
	*/
	public int updatePoolGrade(PoolGrade poolGrade);

	/**
	* 删除pool
	*
	* @param id poolID
	* @return 结果
	*/
	public int deletePoolGradeById(Long id);

	/**
	* 批量删除pool
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deletePoolGradeByIds(Long[] ids);

}
