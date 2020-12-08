package com.common.api.mapper;

import com.common.api.model.WholeNetInsuranceFundWalletRecord;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:09
  * Description: [whole服务实现]
 */
public interface WholeNetInsuranceFundWalletRecordMapper{

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
	* 删除whole
	*
	* @param id wholeID
	* @return 结果
	*/
	public int deleteWholeNetInsuranceFundWalletRecordById(Long id);

	/**
	* 批量删除whole
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteWholeNetInsuranceFundWalletRecordByIds(Long[] ids);

}
