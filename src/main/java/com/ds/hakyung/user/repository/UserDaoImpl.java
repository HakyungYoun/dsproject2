package com.ds.hakyung.user.repository;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ds.hakyung.user.domain.UserDto;

@Repository("UserDao")
public class UserDaoImpl implements UserDao{
	
	@Autowired
	SqlSessionTemplate sm;
	
	@Override
	public void insert(UserDto dto) {
		sm.insert("User_insert",dto);
	}

	@Override
	public List<UserDto> getList(UserDto dto) {
		
		return sm.selectList("user_list",dto);
	}

}
