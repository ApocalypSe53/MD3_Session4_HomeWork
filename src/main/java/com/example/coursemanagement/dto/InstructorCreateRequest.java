package com.example.coursemanagement.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class InstructorCreateRequest {
    private String name;
    private String email;
}
