package com.common.api.service;

import java.util.List;

import com.common.api.model.wholeNetInsuranceFundWalletRecord;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:09
 * Description: [whole服务]
 */
public interface IWholeNetInsuranceFundWalletRecordService {

	/**
	* 查询whole
	*
	* @param id wholeID
	* @return whole
	*/
	public WholeNetInsuranceFundWalletRecord selectWholeNetInsuranceFundWalletRecordById(Long id);

	/**
	* 查询whole列表
	*
	* @param wholeNetInsuranceFundWalletRecord whole
	* @return whole集合
	*/
	public List<WholeNetInsuranceFundWalletRecord> selectWholeNetInsuranceFundWalletRecordList(WholeNetInsuranceFundWalletRecord wholeNetInsuranceFundWalletRecord);

	/**
	* 新增whole
	*
	* @param wholeNetInsuranceFundWalletRecord whole
	* @return 结果
	*/
	public int insertWholeNetInsuranceFundWalletRecord(WholeNetInsuranceFundWalletRecord wholeNetInsuranceFundWalletRecord);

	/**
	* 修改whole
	*
	* @param wholeNetInsuranceFundWalletRecord whole
	* @return 结果
	*/
	public int updateWholeNetInsuranceFundWalletRecord(WholeNetInsuranceFundWalletRecord wholeNetInsuranceFundWalletRecord);

	/**
	* 批量删除whole
	*
	* @param ids 需要删除的wholeID
	* @return 结果
	*/
	public int deleteWholeNetInsuranceFundWalletRecordByIds(Long[] ids);

	/**
	* 删除whole信息
	*
	* @param id wholeID
	* @return 结果
	*/
	public int deleteWholeNetInsuranceFundWalletRecordById(Long id);
	
}
