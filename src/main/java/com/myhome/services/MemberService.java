package com.myhome.services;

import java.util.List;

import com.myhome.entity.MemberEntity;
import com.myhome.exceptions.RecordNotFoundException;

public interface MemberService {

	public List<MemberEntity> getAllMembers();

	public int addMember(MemberEntity member);

	public void deleteMemberById(Integer id) throws RecordNotFoundException;

	public MemberEntity findMemberById(Integer id) throws RecordNotFoundException;

}
