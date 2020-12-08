package com.common.api.mapper;

import com.common.api.model.LeverWalletTransferRecord;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:05
  * Description: [lever服务实现]
 */
public interface LeverWalletTransferRecordMapper{

	/**
	* 查询lever
	*
	* @param id leverID
	* @return lever
	*/
	public LeverWalletTransferRecord selectLeverWalletTransferRecordById(Long id);

	/**
	* 查询lever列表
	*
	* @param leverWalletTransferRecord lever
	* @return lever集合
	*/
	public List<LeverWalletTransferRecord> selectLeverWalletTransferRecordList(LeverWalletTransferRecord leverWalletTransferRecord);

	/**
	* 新增lever
	*
	* @param leverWalletTransferRecord lever
	* @return 结果
	*/
	public int insertLeverWalletTransferRecord(LeverWalletTransferRecord leverWalletTransferRecord);

	/**
	* 修改lever
	*
	* @param leverWalletTransferRecord lever
	* @return 结果
	*/
	public int updateLeverWalletTransferRecord(LeverWalletTransferRecord leverWalletTransferRecord);

	/**
	* 删除lever
	*
	* @param id leverID
	* @return 结果
	*/
	public int deleteLeverWalletTransferRecordById(Long id);

	/**
	* 批量删除lever
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteLeverWalletTransferRecordByIds(Long[] ids);

}
