package com.github.gotetu.domain.repository;

import com.github.gotetu.domain.model.StravaSummaryActivityModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Optional;

@Mapper
public interface StravaSummaryActivityRepository {
    @Select("SELECT * FROM straca_summary_activity")
    List<StravaSummaryActivityModel> findAll();

    @Select("SELECT * FROM strava_summary_activity where id = #{id}")
    Optional<StravaSummaryActivityModel> findById(Integer id);
}
