package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.MemberGradeMapper;
import com.common.api.model.MemberGrade;
import com.common.api.service.IMemberGradeService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:06
 * Description: [memberBiz服务实现]
 */
@Service
public class MemberGradeBizServiceImpl extends CommonService implements IMemberGradeBizService {
	@Autowired
	private IMemberGradeService memberGradeService;

	/**
	* 查询member
	*
	* @param id memberID
	* @return member
	*/
	@Override
	public MemberGrade selectMemberGradeById(Long id) {
		return memberGradeService.selectMemberGradeById(id);
	}

	/**
	* 查询member列表
	*
	* @param memberGrade member
	* @return member
	*/
	@Override
	public List<MemberGrade> selectMemberGradeList(MemberGrade memberGrade) {
		return memberGradeService.selectMemberGradeList(memberGrade);
	}

	/**
	* 新增member
	*
	* @param memberGrade member
	* @return 结果
	*/
	@Override
	public int insertMemberGrade(MemberGrade memberGrade) {
		return memberGradeService.insertMemberGrade(memberGrade);
	}

	/**
	* 修改member
	*
	* @param memberGrade member
	* @return 结果
	*/
	@Override
	public int updateMemberGrade(MemberGrade memberGrade) {
		return memberGradeService.updateMemberGrade(memberGrade);
	}

	/**
	* 批量删除member
	*
	* @param ids 需要删除的memberID
	* @return 结果
	*/
	@Override
	public int deleteMemberGradeByIds(Long[] ids) {
		return memberGradeService.deleteMemberGradeByIds(ids);
	}

	/**
	* 删除member信息
	*
	* @param id memberID
	* @return 结果
	*/
	@Override
	public int deleteMemberGradeById(Long id) {
		return memberGradeService.deleteMemberGradeById(id);
	}

}
