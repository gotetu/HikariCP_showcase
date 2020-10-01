package com.github.gotetu.mybatis;

import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

import javax.sql.DataSource;

public class MybatisFactory {
    final DataSource dataSource;

    /**
     * コンストラクタ.
     *
     * @param dataSource データソース
     */
    public MybatisFactory(DataSource dataSource) {
        org.apache.ibatis.logging.LogFactory.useSlf4jLogging();
        this.dataSource = dataSource;
    }

    /**
     * SqlSessionFactory を構築する.
     *
     * @param mapperClass マッパークラス
     * @return SqlSessionFactory
     */
    SqlSessionFactory buildSqlSessionFactory(Class<?> mapperClass) {
        TransactionFactory transactionFactory = new JdbcTransactionFactory();
        Environment environment = new Environment("development", transactionFactory, dataSource);
        Configuration configuration = new Configuration(environment);
        configuration.addMapper(mapperClass);
        return new SqlSessionFactoryBuilder().build(configuration);
    }
}
