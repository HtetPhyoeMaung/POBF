package com.venzee.dbthinking.controller;

import com.venzee.dbthinking.dto.response.ApiResponse;
import com.venzee.dbthinking.dto.down.CreateDownRequest;
import com.venzee.dbthinking.service.impl.DashboardService;
import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/dashboard")
@RequiredArgsConstructor
public class DashBoardController {

    private final DashboardService dashboardService;

    @PostMapping("/create-downline")
    public ResponseEntity<ApiResponse> createDownLine(@RequestBody CreateDownRequest request){
        return dashboardService.createDownLine(request);
    }
}
