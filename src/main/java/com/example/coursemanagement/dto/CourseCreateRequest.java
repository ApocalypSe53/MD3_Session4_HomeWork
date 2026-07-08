package com.example.coursemanagement.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class CourseCreateRequest {
    private String title;
    private String status;
    private Long instructorId;
}
