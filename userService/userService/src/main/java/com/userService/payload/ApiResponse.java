package com.userService.payload;

import lombok.*;
import org.apache.http.HttpStatus;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApiResponse {
    private  String message;
    private boolean success;

}
