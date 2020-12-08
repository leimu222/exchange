package com.common.api.mapper;

import com.common.api.model.RiskRecord;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:08
  * Description: [risk服务实现]
 */
public interface RiskRecordMapper{

	/**
	* 查询risk
	*
	* @param id riskID
	* @return risk
	*/
	public RiskRecord selectRiskRecordById(Long id);

	/**
	* 查询risk列表
	*
	* @param riskRecord risk
	* @return risk集合
	*/
	public List<RiskRecord> selectRiskRecordList(RiskRecord riskRecord);

	/**
	* 新增risk
	*
	* @param riskRecord risk
	* @return 结果
	*/
	public int insertRiskRecord(RiskRecord riskRecord);

	/**
	* 修改risk
	*
	* @param riskRecord risk
	* @return 结果
	*/
	public int updateRiskRecord(RiskRecord riskRecord);

	/**
	* 删除risk
	*
	* @param id riskID
	* @return 结果
	*/
	public int deleteRiskRecordById(Long id);

	/**
	* 批量删除risk
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteRiskRecordByIds(Long[] ids);

}
