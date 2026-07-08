package com.example.coursemanagement.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
public class CourseUpdateRequest {
    private String title;
    private String status;
    private Long instructorId;
}
