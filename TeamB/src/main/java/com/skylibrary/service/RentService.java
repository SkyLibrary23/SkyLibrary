package com.skylibrary.service;

import java.util.List;

import com.skylibrary.vo.RentVO;
import com.skylibrary.vo.UserVO;

public interface RentService {

	public List<RentVO> list(UserVO vo) throws Exception;
}
