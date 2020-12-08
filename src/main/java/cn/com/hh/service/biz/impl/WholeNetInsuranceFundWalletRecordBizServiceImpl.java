package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.WholeNetInsuranceFundWalletRecordMapper;
import com.common.api.model.WholeNetInsuranceFundWalletRecord;
import com.common.api.service.IWholeNetInsuranceFundWalletRecordService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:09
 * Description: [wholeBiz服务实现]
 */
@Service
public class WholeNetInsuranceFundWalletRecordBizServiceImpl extends CommonService implements IWholeNetInsuranceFundWalletRecordBizService {
	@Autowired
	private IWholeNetInsuranceFundWalletRecordService wholeNetInsuranceFundWalletRecordService;

	/**
	* 查询whole
	*
	* @param id wholeID
	* @return whole
	*/
	@Override
	public WholeNetInsuranceFundWalletRecord selectWholeNetInsuranceFundWalletRecordById(Long id) {
		return wholeNetInsuranceFundWalletRecordService.selectWholeNetInsuranceFundWalletRecordById(id);
	}

	/**
	* 查询whole列表
	*
	* @param wholeNetInsuranceFundWalletRecord whole
	* @return whole
	*/
	@Override
	public List<WholeNetInsuranceFundWalletRecord> selectWholeNetInsuranceFundWalletRecordList(WholeNetInsuranceFundWalletRecord wholeNetInsuranceFundWalletRecord) {
		return wholeNetInsuranceFundWalletRecordService.selectWholeNetInsuranceFundWalletRecordList(wholeNetInsuranceFundWalletRecord);
	}

	/**
	* 新增whole
	*
	* @param wholeNetInsuranceFundWalletRecord whole
	* @return 结果
	*/
	@Override
	public int insertWholeNetInsuranceFundWalletRecord(WholeNetInsuranceFundWalletRecord wholeNetInsuranceFundWalletRecord) {
		return wholeNetInsuranceFundWalletRecordService.insertWholeNetInsuranceFundWalletRecord(wholeNetInsuranceFundWalletRecord);
	}

	/**
	* 修改whole
	*
	* @param wholeNetInsuranceFundWalletRecord whole
	* @return 结果
	*/
	@Override
	public int updateWholeNetInsuranceFundWalletRecord(WholeNetInsuranceFundWalletRecord wholeNetInsuranceFundWalletRecord) {
		return wholeNetInsuranceFundWalletRecordService.updateWholeNetInsuranceFundWalletRecord(wholeNetInsuranceFundWalletRecord);
	}

	/**
	* 批量删除whole
	*
	* @param ids 需要删除的wholeID
	* @return 结果
	*/
	@Override
	public int deleteWholeNetInsuranceFundWalletRecordByIds(Long[] ids) {
		return wholeNetInsuranceFundWalletRecordService.deleteWholeNetInsuranceFundWalletRecordByIds(ids);
	}

	/**
	* 删除whole信息
	*
	* @param id wholeID
	* @return 结果
	*/
	@Override
	public int deleteWholeNetInsuranceFundWalletRecordById(Long id) {
		return wholeNetInsuranceFundWalletRecordService.deleteWholeNetInsuranceFundWalletRecordById(id);
	}

}
