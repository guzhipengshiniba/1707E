package com.bw.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.bw.dw.Ss;

public interface SsMapper {

	@Select("select * from ss")
	List<Ss> list();

}
