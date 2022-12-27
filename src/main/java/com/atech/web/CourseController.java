package com.atech.web;

import com.atech.entities.Course;
import com.atech.service.CourseService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author raed abu Sa'da
 * on 27/12/2022
 */
@Controller
@RequestMapping("/courses")
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping
    public String getAllCourses(Model model){

        List<Course> courses = courseService.getAllCourses();
        System.out.println(courses);
        model.addAttribute("courses", courses);
        return "courses";
    }
}
