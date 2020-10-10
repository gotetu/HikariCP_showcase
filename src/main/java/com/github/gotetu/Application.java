package com.github.gotetu;

import com.github.gotetu.domain.model.StravaSummaryActivityModel;
import com.github.gotetu.domain.service.StravaSummaryActivityService;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        StravaSummaryActivityService service = new StravaSummaryActivityService();
        List<StravaSummaryActivityModel> result =  service.findAll();
        for (StravaSummaryActivityModel model : result) {
            System.out.println(model.toString());
        }
    }
}
