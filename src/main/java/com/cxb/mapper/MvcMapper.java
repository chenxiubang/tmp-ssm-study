package com.cxb.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface MvcMapper {
    Map method();
}
