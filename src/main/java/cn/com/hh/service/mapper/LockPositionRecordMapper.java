package com.common.api.mapper;

import com.common.api.model.LockPositionRecord;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:05
  * Description: [lock服务实现]
 */
public interface LockPositionRecordMapper{

	/**
	* 查询lock
	*
	* @param id lockID
	* @return lock
	*/
	public LockPositionRecord selectLockPositionRecordById(Long id);

	/**
	* 查询lock列表
	*
	* @param lockPositionRecord lock
	* @return lock集合
	*/
	public List<LockPositionRecord> selectLockPositionRecordList(LockPositionRecord lockPositionRecord);

	/**
	* 新增lock
	*
	* @param lockPositionRecord lock
	* @return 结果
	*/
	public int insertLockPositionRecord(LockPositionRecord lockPositionRecord);

	/**
	* 修改lock
	*
	* @param lockPositionRecord lock
	* @return 结果
	*/
	public int updateLockPositionRecord(LockPositionRecord lockPositionRecord);

	/**
	* 删除lock
	*
	* @param id lockID
	* @return 结果
	*/
	public int deleteLockPositionRecordById(Long id);

	/**
	* 批量删除lock
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteLockPositionRecordByIds(Long[] ids);

}
