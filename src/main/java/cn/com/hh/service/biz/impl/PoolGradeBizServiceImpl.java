package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.PoolGradeMapper;
import com.common.api.model.PoolGrade;
import com.common.api.service.IPoolGradeService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:08
 * Description: [poolBiz服务实现]
 */
@Service
public class PoolGradeBizServiceImpl extends CommonService implements IPoolGradeBizService {
	@Autowired
	private IPoolGradeService poolGradeService;

	/**
	* 查询pool
	*
	* @param id poolID
	* @return pool
	*/
	@Override
	public PoolGrade selectPoolGradeById(Long id) {
		return poolGradeService.selectPoolGradeById(id);
	}

	/**
	* 查询pool列表
	*
	* @param poolGrade pool
	* @return pool
	*/
	@Override
	public List<PoolGrade> selectPoolGradeList(PoolGrade poolGrade) {
		return poolGradeService.selectPoolGradeList(poolGrade);
	}

	/**
	* 新增pool
	*
	* @param poolGrade pool
	* @return 结果
	*/
	@Override
	public int insertPoolGrade(PoolGrade poolGrade) {
		return poolGradeService.insertPoolGrade(poolGrade);
	}

	/**
	* 修改pool
	*
	* @param poolGrade pool
	* @return 结果
	*/
	@Override
	public int updatePoolGrade(PoolGrade poolGrade) {
		return poolGradeService.updatePoolGrade(poolGrade);
	}

	/**
	* 批量删除pool
	*
	* @param ids 需要删除的poolID
	* @return 结果
	*/
	@Override
	public int deletePoolGradeByIds(Long[] ids) {
		return poolGradeService.deletePoolGradeByIds(ids);
	}

	/**
	* 删除pool信息
	*
	* @param id poolID
	* @return 结果
	*/
	@Override
	public int deletePoolGradeById(Long id) {
		return poolGradeService.deletePoolGradeById(id);
	}

}
