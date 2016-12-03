package com.jorugi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.jorugi.model.JorugiBoard;

/**
 * Created by maxwell on 2015-11-11.
 */
@Mapper
public interface JorugiBoardMapper {
    List<JorugiBoard> getJorugiBoardList();
}
