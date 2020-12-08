package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.AirdropMapper;
import com.common.api.model.Airdrop;
import com.common.api.service.IAirdropService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:01
 * Description: [airdrop服务实现]
 */
@Service
public class AirdropServiceImpl implements IAirdropService {
	@Autowired
	private AirdropMapper airdropMapper;

	/**
	* 查询airdrop
	*
	* @param id airdropID
	* @return airdrop
	*/
	@Override
	public Airdrop selectAirdropById(Long id) {
		return airdropMapper.selectAirdropById(id);
	}

	/**
	* 查询airdrop列表
	*
	* @param airdrop airdrop
	* @return airdrop
	*/
	@Override
	public List<Airdrop> selectAirdropList(Airdrop airdrop) {
		return airdropMapper.selectAirdropList(airdrop);
	}

	/**
	* 新增airdrop
	*
	* @param airdrop airdrop
	* @return 结果
	*/
	@Override
	public int insertAirdrop(Airdrop airdrop) {
		return airdropMapper.insertAirdrop(airdrop);
	}

	/**
	* 修改airdrop
	*
	* @param airdrop airdrop
	* @return 结果
	*/
	@Override
	public int updateAirdrop(Airdrop airdrop) {
		return airdropMapper.updateAirdrop(airdrop);
	}

	/**
	* 批量删除airdrop
	*
	* @param ids 需要删除的airdropID
	* @return 结果
	*/
	@Override
	public int deleteAirdropByIds(Long[] ids) {
		return airdropMapper.deleteAirdropByIds(ids);
	}

	/**
	* 删除airdrop信息
	*
	* @param id airdropID
	* @return 结果
	*/
	@Override
	public int deleteAirdropById(Long id) {
		return airdropMapper.deleteAirdropById(id);
	}

}
