package com.yuzhi.msmember.mapper;

import com.yuzhi.msmember.domain.entity.Member;

/**
 * @author yuzhi
 */
public interface MemberMapper {
    int deleteByPrimaryKey(Integer mId);

    int insert(Member record);

    int insertSelective(Member record);

    Member selectByPrimaryKey(Integer mId);

    int updateByPrimaryKeySelective(Member record);

    int updateByPrimaryKey(Member record);
}