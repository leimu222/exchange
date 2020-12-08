package com.common.api.mapper;

import com.common.api.model.DepositRecord;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:04
  * Description: [deposit服务实现]
 */
public interface DepositRecordMapper{

	/**
	* 查询deposit
	*
	* @param id depositID
	* @return deposit
	*/
	public DepositRecord selectDepositRecordById(String id);

	/**
	* 查询deposit列表
	*
	* @param depositRecord deposit
	* @return deposit集合
	*/
	public List<DepositRecord> selectDepositRecordList(DepositRecord depositRecord);

	/**
	* 新增deposit
	*
	* @param depositRecord deposit
	* @return 结果
	*/
	public int insertDepositRecord(DepositRecord depositRecord);

	/**
	* 修改deposit
	*
	* @param depositRecord deposit
	* @return 结果
	*/
	public int updateDepositRecord(DepositRecord depositRecord);

	/**
	* 删除deposit
	*
	* @param id depositID
	* @return 结果
	*/
	public int deleteDepositRecordById(String id);

	/**
	* 批量删除deposit
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteDepositRecordByIds(String[] ids);

}
