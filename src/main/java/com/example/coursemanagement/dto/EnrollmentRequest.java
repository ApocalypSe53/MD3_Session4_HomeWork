package com.example.coursemanagement.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
public class EnrollmentRequest {
    private Long studentId;
    private Long courseId;
}
