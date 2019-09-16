package com.myhome.repository;

import java.util.List;

import com.myhome.model.Member;

public interface MemberDao {
	public List<Member> findAllMembers();
	
}
