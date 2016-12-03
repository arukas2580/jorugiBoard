package com.jorugi.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.jorugi.model.JorugiTable;

import java.util.List;

/**
 * Created by maxwell on 2015-11-11.
 */
@Mapper
public interface JorugiTableMapper {
    List<JorugiTable> getJorugiAll();
}
