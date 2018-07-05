package com.ufa.mall.mapper;

import com.ufa.mall.entity.Details;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface DetailsMapper {
    @Select("SELECT * FROM details WHERE id=#{id}")
    Details queryById(@Param("id") int id);
}
