package com.springrest.springrest.services;

import com.springrest.springrest.entities.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{

    List<Course> list;

    public CourseServiceImpl() {
        list = new ArrayList<>();
        list.add(new Course(101,"Java","Java for Beginners"));
        list.add(new Course(102,"Python","Python for Beginners"));
    }

    @Override
    public List<Course> getCourses() {
        return list;
    }

    @Override
    public Course getCourse(int courseId) {
        Course course = null;
        for (Course course1 : list) {
            if (course1.getId() == courseId) {
                course = course1;
                break;
            }
        }
        return course;
    }

    @Override
    public Course addCourse(Course course) {
        list.add(course);
        return course;
    }

    @Override
    public Course updateCourse(Course course) {
        for (Course course1 : list) {
            if (course.getId() == course1.getId()) {
                course1.setName(course.getName());
                course1.setDescription(course.getDescription());
                break;
            }
        }
        return course;
    }

    @Override
    public void deleteCourse(int courseId) {
        Course course = null;
        for (Course course1 : list) {
            if (courseId == course1.getId()) {
                course = course1;
                list.remove(course1);
                break;
            }
        }
    }
}
