package com.common.api.service;

import java.util.List;

import com.common.api.model.poolGrade;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:08
 * Description: [poolBiz服务]
 */
public interface IPoolGradeBizService {

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
	* 批量删除pool
	*
	* @param ids 需要删除的poolID
	* @return 结果
	*/
	public int deletePoolGradeByIds(Long[] ids);

	/**
	* 删除pool信息
	*
	* @param id poolID
	* @return 结果
	*/
	public int deletePoolGradeById(Long id);
	
}
