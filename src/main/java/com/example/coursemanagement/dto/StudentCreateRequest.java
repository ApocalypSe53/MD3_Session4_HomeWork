package com.example.coursemanagement.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter

public class StudentCreateRequest {
    private String name;
    private String email;
}
