package com.github.gotetu.domain.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;

@Getter
@Setter
public class StravaSummaryActivityModel {
    private Long id;
    private String external_id;
    private Long upload_id;
    private Long athlete_id;
    private String activity_name;
    private Float distance;
    private Integer moving_time;
    private Integer elapsed_time;
    private Float total_elevation_gain;
    private Float elev_high;
    private Float elev_low;
    private Integer activity_type;
    private ZonedDateTime start_date;
    private LocalDateTime start_local_date;
    private String timezone;
    private Float start_latitude;
    private Float start_longitude;
    private Float end_latitude;
    private Float end_longitude;
    private Integer achievement_count;
    private Integer kudos_count;
    private Integer comment_count;
    private Integer athlete_count;
    private Integer photo_count;
    private Integer total_photo_count;
    private Boolean recorded_trainer;
    private Boolean commute_activity;
    private Boolean create_manual;
    private Boolean private_activity;
    private Boolean flagged_activity;
    private Integer workout_type;
    private String upload_id_str;
    private Float average_speed;
    private Float max_speed;
    private Boolean has_kudoed;
    private Integer gear_id;
    private Float kilojoules;
    private Float average_watts;
    private Boolean device_watts;
    private Integer max_watts;
    private Integer weighted_average_watts;
}
