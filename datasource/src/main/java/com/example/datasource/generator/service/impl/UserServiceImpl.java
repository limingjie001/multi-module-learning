package com.example.datasource.generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.datasource.annotation.DataSource;
import com.example.datasource.enums.DataSourceType;
import com.example.datasource.generator.domain.User;
import com.example.datasource.generator.mapper.UserMapper;
import com.example.datasource.generator.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author li290
 * @description 针对表【user】的数据库操作Service实现
 * @createDate 2022-03-31 16:51:18
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
        implements UserService {
    @Override
    @DataSource(DataSourceType.SLAVE)
    public List<User> list() {
        return super.list();
    }
}




