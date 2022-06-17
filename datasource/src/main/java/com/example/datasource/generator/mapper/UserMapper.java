package com.example.datasource.generator.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.datasource.generator.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author li290
 * @description 针对表【user】的数据库操作Mapper
 * @createDate 2022-03-31 16:51:18
 * @Entity generator.domain.User
 */
@Mapper
@Repository
public interface UserMapper extends BaseMapper<User> {

}




