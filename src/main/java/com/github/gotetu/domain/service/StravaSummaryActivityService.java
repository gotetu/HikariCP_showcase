package com.github.gotetu.domain.service;

import com.github.gotetu.db.HikariCPDataSource;
import com.github.gotetu.domain.model.StravaSummaryActivityModel;
import com.github.gotetu.domain.repository.StravaSummaryActivityRepository;
import com.github.gotetu.mybatis.MybatisFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class StravaSummaryActivityService {

    private SqlSession getSqlSession(Class<?> modelClass) {
        MybatisFactory factory = new MybatisFactory(HikariCPDataSource.getDataSource());
        SqlSessionFactory sqlSessionFactory = factory.buildSqlSessionFactory(modelClass);
        return sqlSessionFactory.openSession();
    }

    public List<StravaSummaryActivityModel> findAll() {
        SqlSession sqlSession = getSqlSession(StravaSummaryActivityModel.class);
        StravaSummaryActivityRepository repository = sqlSession.getMapper(StravaSummaryActivityRepository.class);
        return repository.findAll();
    }
}
