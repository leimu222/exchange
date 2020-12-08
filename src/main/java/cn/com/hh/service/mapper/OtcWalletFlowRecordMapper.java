package com.common.api.mapper;

import com.common.api.model.OtcWalletFlowRecord;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:08
  * Description: [otc服务实现]
 */
public interface OtcWalletFlowRecordMapper{

	/**
	* 查询otc
	*
	* @param id otcID
	* @return otc
	*/
	public OtcWalletFlowRecord selectOtcWalletFlowRecordById(Long id);

	/**
	* 查询otc列表
	*
	* @param otcWalletFlowRecord otc
	* @return otc集合
	*/
	public List<OtcWalletFlowRecord> selectOtcWalletFlowRecordList(OtcWalletFlowRecord otcWalletFlowRecord);

	/**
	* 新增otc
	*
	* @param otcWalletFlowRecord otc
	* @return 结果
	*/
	public int insertOtcWalletFlowRecord(OtcWalletFlowRecord otcWalletFlowRecord);

	/**
	* 修改otc
	*
	* @param otcWalletFlowRecord otc
	* @return 结果
	*/
	public int updateOtcWalletFlowRecord(OtcWalletFlowRecord otcWalletFlowRecord);

	/**
	* 删除otc
	*
	* @param id otcID
	* @return 结果
	*/
	public int deleteOtcWalletFlowRecordById(Long id);

	/**
	* 批量删除otc
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteOtcWalletFlowRecordByIds(Long[] ids);

}
