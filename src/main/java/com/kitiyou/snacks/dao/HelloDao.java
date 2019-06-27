package com.kitiyou.snacks.dao;

import com.kitiyou.snacks.entity.FirstCategory;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface HelloDao {

    @Select("SELECT * FROM tb_first_category")
    List<FirstCategory> listAll();

}
