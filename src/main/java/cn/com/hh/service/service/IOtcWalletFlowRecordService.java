package com.common.api.service;

import java.util.List;

import com.common.api.model.otcWalletFlowRecord;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:08
 * Description: [otc服务]
 */
public interface IOtcWalletFlowRecordService {

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
	* 批量删除otc
	*
	* @param ids 需要删除的otcID
	* @return 结果
	*/
	public int deleteOtcWalletFlowRecordByIds(Long[] ids);

	/**
	* 删除otc信息
	*
	* @param id otcID
	* @return 结果
	*/
	public int deleteOtcWalletFlowRecordById(Long id);
	
}
