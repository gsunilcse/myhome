package com.myhome.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.myhome.entity.MemberEntity;
import com.myhome.model.Member;

@Repository
public class MemberDaoImpl implements MemberDao{
	
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	public List<Member> findAllMembers(){
		
		List<Member> memberList = jdbcTemplate.query("select * from member",  new RowMapper<Member>() {
            public Member mapRow(ResultSet rs,
                    int rowNum) throws SQLException {
              Member member = new Member();
              member.setmId(rs.getInt("mid"));
              member.setFirstName(rs.getString("firstname"));
              member.setMiddleName(rs.getString("middlename"));
              member.setLastName(rs.getString("lastname"));
              member.setGender(rs.getString("gender"));
              member.setDob(rs.getString("dob"));
              return member;
            }
          });
		
		return memberList;
		
	}
	
	
}
