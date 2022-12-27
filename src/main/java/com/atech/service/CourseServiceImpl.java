package com.atech.service;

import com.atech.entities.Course;
import com.atech.repository.CourseRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author raed abu Sa'da
 * on 27/12/2022
 */
@AllArgsConstructor
@Service
public class CourseServiceImpl implements CourseService {

    private final CourseRepository courseRepository;

    @Override
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public void AddCourse(Course course) {
        courseRepository.save(course);
    }
}
