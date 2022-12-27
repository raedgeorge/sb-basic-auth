package com.atech.service;

import com.atech.entities.Course;

import java.util.List;

/**
 * @author raed abu Sa'da
 * on 27/12/2022
 */
public interface CourseService {

    List<Course> getAllCourses();

    void AddCourse(Course course);
}
