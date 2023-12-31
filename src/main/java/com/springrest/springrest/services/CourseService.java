package com.springrest.springrest.services;
import com.springrest.springrest.entities.Course;
import java.util.List;

public interface CourseService {
    List<Course> getCourses();
    Course getCourse(int courseId);
    Course addCourse(Course course);
    Course updateCourse(Course course);
    void deleteCourse(int courseId);
}
