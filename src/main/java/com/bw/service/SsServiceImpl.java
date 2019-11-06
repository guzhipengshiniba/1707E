package com.bw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bw.dw.Ss;
import com.bw.mapper.SsMapper;

@Service
public class SsServiceImpl implements SsService {

	@Autowired
	private SsMapper ssMapper;

	@Override
	public List<Ss> list() {
		// TODO Auto-generated method stub
		return ssMapper.list();
	}
}
