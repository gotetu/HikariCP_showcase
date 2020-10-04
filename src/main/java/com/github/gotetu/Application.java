package com.github.gotetu;

import com.github.gotetu.db.HikariCPDataSource;
import com.github.gotetu.mybatis.MybatisFactory;

public class Application {
    public static void main(String[] args) {
        MybatisFactory factory = new MybatisFactory(HikariCPDataSource.getDataSource());
        // SqlSessionFactory sqlSessionFactory = factory.buildSqlSessionFactory(MapperClass.class);
    }
}
