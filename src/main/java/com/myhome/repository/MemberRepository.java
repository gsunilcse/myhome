package com.myhome.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myhome.entity.MemberEntity;

public interface MemberRepository extends JpaRepository<MemberEntity, Integer> {
	
	//MemberEntity save(MemberEntity meEntity);
}
