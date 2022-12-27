package com.atech.repository;

import com.atech.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author raed abu Sa'da
 * on 27/12/2022
 */
public interface CourseRepository extends JpaRepository<Course, Long> {
}
