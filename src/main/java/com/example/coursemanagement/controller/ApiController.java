package com.example.coursemanagement.controller;

import com.example.coursemanagement.dto.*;
import com.example.coursemanagement.service.CourseService;
import com.example.coursemanagement.service.InstructorService;
import com.example.coursemanagement.service.StudentEnrollmentService;
import com.example.coursemanagement.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiController {

    private final InstructorService instructorService;
    private final CourseService courseService;
    private final StudentService studentService;
    private final StudentEnrollmentService enrollmentService;

    public ApiController(InstructorService instructorService, CourseService courseService,
                         StudentService studentService, StudentEnrollmentService enrollmentService) {
        this.instructorService = instructorService;
        this.courseService = courseService;
        this.studentService = studentService;
        this.enrollmentService = enrollmentService;
    }

    // 1. POST /instructors
    @PostMapping("/instructors")
    public ResponseEntity<ApiResponse<Void>> createInstructor(@RequestBody InstructorCreateRequest req) {
        instructorService.createInstructor(req);
        return ResponseEntity.ok(new ApiResponse<>("Tạo giảng viên thành công", null));
    }

    // 2. POST /courses
    @PostMapping("/courses")
    public ResponseEntity<ApiResponse<Void>> createCourse(@RequestBody CourseCreateRequest req) {
        courseService.createCourse(req);
        return ResponseEntity.ok(new ApiResponse<>("Tạo khóa học thành công", null));
    }

    // 3. PUT /courses/{id}
    @PutMapping("/courses/{id}")
    public ResponseEntity<ApiResponse<Void>> updateCourse(@PathVariable Long id, @RequestBody CourseUpdateRequest req) {
        courseService.updateCourse(id, req);
        return ResponseEntity.ok(new ApiResponse<>("Cập nhật khóa học thành công", null));
    }

    // 4. POST /students
    @PostMapping("/students")
    public ResponseEntity<ApiResponse<Void>> createStudent(@RequestBody StudentCreateRequest req) {
        studentService.createStudent(req);
        return ResponseEntity.ok(new ApiResponse<>("Tạo sinh viên thành công", null));
    }

    // 5. POST /students-enrollments
    @PostMapping("/students-enrollments")
    public ResponseEntity<ApiResponse<Void>> enrollStudent(@RequestBody EnrollmentRequest req) {
        enrollmentService.enrollStudent(req.getStudentId(), req.getCourseId());
        return ResponseEntity.ok(new ApiResponse<>("Đăng ký khóa học thành công", null));
    }
}
