package com.example.coursemanagement.service;

import com.example.coursemanagement.Model.Entities.Instructor;
import com.example.coursemanagement.dto.InstructorCreateRequest;
import com.example.coursemanagement.repository.InstructorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class InstructorService {
    private final InstructorRepository instructorRepository;

    public List<Instructor> findAllInstructors() {
        return instructorRepository.findAll();
    }

    public Instructor findInstructorById(Long id) {
        Optional<Instructor> optionalInstructor = instructorRepository.findById(id);

        return optionalInstructor.orElse(null);
    }

    public Instructor createInstructor(InstructorCreateRequest req) {
        Instructor instructor = new Instructor();
        instructor.setName(req.getName());
        instructor.setEmail(req.getEmail());

        return instructorRepository.save(instructor);
    }
}
