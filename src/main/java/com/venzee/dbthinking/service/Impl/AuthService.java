package com.venzee.dbthinking.service.Impl;

import com.venzee.dbthinking.dto.request.RegisterRequest;
import com.venzee.dbthinking.dto.response.ApiResponse;
import com.venzee.dbthinking.entites.User;
import com.venzee.dbthinking.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository userRepository;


    public ResponseEntity<ApiResponse> register(RegisterRequest request) {
        User user = User.builder()
                .username(request.getUsername())
                .role(request.getRole())
                .password(request.getPassword())
                .build();

        ApiResponse apiResponse =buildApiResponse(user,HttpStatus.CREATED,"Registration Success");
     return ResponseEntity.ok(apiResponse);
    }

    private ApiResponse buildApiResponse(Object object, HttpStatus status, String message) {
        return ApiResponse.builder()
                .status(status.value())
                .message(message)
                .timeStamp(LocalDateTime.now())
                .build();
    }
}
