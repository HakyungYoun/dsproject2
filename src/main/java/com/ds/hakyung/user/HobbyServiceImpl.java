package com.ds.hakyung.user;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ds.hakyung.user.domain.HobbyDto;
import com.ds.hakyung.user.repository.HobbyDao;

import jakarta.annotation.Resource;

@Service("HobbyService")
public class HobbyServiceImpl implements HobbyService{

	@Resource(name="HobbyDao")
	HobbyDao dao;
	@Override
	public List<HobbyDto> getList(HobbyDto dto) {
		
		return dao.getList(dto);
	}

}