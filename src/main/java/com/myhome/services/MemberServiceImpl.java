package com.myhome.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myhome.entity.MemberEntity;
import com.myhome.exceptions.RecordNotFoundException;
import com.myhome.repository.MemberRepository;

@Service
public class MemberServiceImpl implements MemberService {

	//@Autowired
	//private MemberDao memberDao;

	@Autowired
	MemberRepository memberRepository;

	public List<MemberEntity> getAllMembers() {

		// List<Member> memberList = memberDao.findAllMembers();
		List<MemberEntity> memberList = memberRepository.findAll();

		return memberList;
	}

	public int addMember(MemberEntity member) {
		MemberEntity m = memberRepository.save(member);

		return m.getmId();
	}

	@Override
	public void deleteMemberById(Integer id) throws RecordNotFoundException {

		Optional<MemberEntity> member = memberRepository.findById(id);
		if (member.isPresent()) {
			memberRepository.deleteById(id);
		} else {
			throw new RecordNotFoundException("No employee record exist for given id");
		}
	}

	@Override
	public MemberEntity findMemberById(Integer id) throws RecordNotFoundException {
		// TODO Auto-generated method stub
		Optional<MemberEntity> member = memberRepository.findById(id);
		if (member.isPresent()) {
			return member.get();
		} else {
			throw new RecordNotFoundException("No employee record exist for given id");
		}

	}

}
