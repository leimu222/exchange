package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.ReleaseBalanceMapper;
import com.common.api.model.ReleaseBalance;
import com.common.api.service.IReleaseBalanceService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:08
 * Description: [release服务实现]
 */
@Service
public class ReleaseBalanceServiceImpl implements IReleaseBalanceService {
	@Autowired
	private ReleaseBalanceMapper releaseBalanceMapper;

	/**
	* 查询release
	*
	* @param id releaseID
	* @return release
	*/
	@Override
	public ReleaseBalance selectReleaseBalanceById(Long id) {
		return releaseBalanceMapper.selectReleaseBalanceById(id);
	}

	/**
	* 查询release列表
	*
	* @param releaseBalance release
	* @return release
	*/
	@Override
	public List<ReleaseBalance> selectReleaseBalanceList(ReleaseBalance releaseBalance) {
		return releaseBalanceMapper.selectReleaseBalanceList(releaseBalance);
	}

	/**
	* 新增release
	*
	* @param releaseBalance release
	* @return 结果
	*/
	@Override
	public int insertReleaseBalance(ReleaseBalance releaseBalance) {
		return releaseBalanceMapper.insertReleaseBalance(releaseBalance);
	}

	/**
	* 修改release
	*
	* @param releaseBalance release
	* @return 结果
	*/
	@Override
	public int updateReleaseBalance(ReleaseBalance releaseBalance) {
		return releaseBalanceMapper.updateReleaseBalance(releaseBalance);
	}

	/**
	* 批量删除release
	*
	* @param ids 需要删除的releaseID
	* @return 结果
	*/
	@Override
	public int deleteReleaseBalanceByIds(Long[] ids) {
		return releaseBalanceMapper.deleteReleaseBalanceByIds(ids);
	}

	/**
	* 删除release信息
	*
	* @param id releaseID
	* @return 结果
	*/
	@Override
	public int deleteReleaseBalanceById(Long id) {
		return releaseBalanceMapper.deleteReleaseBalanceById(id);
	}

}
