package com.myhome.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.myhome.entity.MemberEntity;
import com.myhome.exceptions.RecordNotFoundException;
import com.myhome.services.MemberService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	@GetMapping("/myhome/members")
	public ResponseEntity<List<MemberEntity>> getAllMembers(){
		List<MemberEntity> members = memberService.getAllMembers();
		return new ResponseEntity<List<MemberEntity>>(members,HttpStatus.OK) ;
	}
	
	@PostMapping("/myhome/members")
	public ResponseEntity<Integer> addMember(@RequestBody MemberEntity member){
		int mId =  memberService.addMember(member);
		return new ResponseEntity<Integer>(mId,HttpStatus.OK) ;
	}
	
	@DeleteMapping("myhome/members/{id}")
	public HttpStatus deleteMemberById(@PathVariable("id") Integer id) throws RecordNotFoundException{
		memberService.deleteMemberById(id);
		return HttpStatus.FORBIDDEN ;
	}
	
	@GetMapping("myhome/members/{id}")
	public ResponseEntity<MemberEntity> findMemberById(@PathVariable("id") Integer id) throws RecordNotFoundException{
		MemberEntity memberEntity =  memberService.findMemberById(id);
		return new ResponseEntity<MemberEntity>(memberEntity,HttpStatus.OK) ;
	}
	

}
