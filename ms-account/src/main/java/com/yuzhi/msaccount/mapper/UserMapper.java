package com.yuzhi.msaccount.mapper;

import com.yuzhi.msaccount.domain.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author yuzhi
 */
public interface UserMapper {
    int deleteByPrimaryKey(Integer uId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(@Param("uid") Integer uid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

}