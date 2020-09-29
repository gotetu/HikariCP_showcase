package com.github.gotetu.db;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.SQLException;

public class HikariCPDataSource {
    private static final Logger logger = LogManager.getLogger(HikariCPDataSource.class.getName());

    private static final String DB_PROPERTIES = "src/main/resources/db.properties";
    private static final HikariConfig hikariConfig = new HikariConfig(DB_PROPERTIES);
    private static final HikariDataSource hikariDataSource = new HikariDataSource(hikariConfig);

    static {
        logger.info(hikariConfig.getLeakDetectionThreshold());
        logger.info(hikariConfig.getJdbcUrl());
        logger.info(hikariConfig.getMaxLifetime());
        logger.info(hikariConfig.getPoolName());
    }

    /**
     * データベース接続情報の取得.
     *
     * @return 接続情報
     * @throws SQLException データベース接続エラー
     */
    public static Connection getConnection() throws SQLException {
        logger.debug("Get database connection.");
        return hikariDataSource.getConnection();
    }

}
