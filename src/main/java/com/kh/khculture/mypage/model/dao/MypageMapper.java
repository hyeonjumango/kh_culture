package com.kh.khculture.mypage.model.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.kh.khculture.lecture.model.vo.LectureOpen;

@Mapper
public interface MypageMapper {
	/* 김현주 */
	List<LectureOpen> getCartList(int mno);
	
	int getcartCount(int mno);

	int putCart(@Param("mno") int mno, @Param("lrNo") int lrNo);

	int deleteCart(@Param("lrNo") Integer lrNo, @Param("mno") int mno);

	int checkCart(@Param("mno") int mno, @Param("lrNo") int lrNo);
	/* 김현주 */
}
