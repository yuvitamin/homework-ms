package com.yuzhi.msscore.mapper;

import com.yuzhi.msscore.domain.entity.Score;

/**
 * @author yuzhi
 */
public interface ScoreMapper {
    int deleteByPrimaryKey(Integer sId);

    int insert(Score record);

    int insertSelective(Score record);

    Score selectByPrimaryKey(Integer sId);

    int updateByPrimaryKeySelective(Score record);

    int updateByPrimaryKey(Score record);
}