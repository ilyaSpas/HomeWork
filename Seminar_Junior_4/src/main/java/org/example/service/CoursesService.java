package org.example.service;

import lombok.extern.slf4j.Slf4j;
import org.example.dao.CoursesDao;
import org.example.entity.Courses;

@Slf4j
public class CoursesService {

    private CoursesDao coursesDao = CoursesDao.getInstance();

    private static CoursesService INSTANCE = new CoursesService();

    private CoursesService() {

    }

    public void save(Courses course){
        coursesDao.save(course);
        log.warn("Created object: " + course.toString());
    }

    public Courses get(int id) {
        Courses course = CoursesDao.findById(id);
        return course;
    }

    public void update(Courses courses) {
        CoursesDao.update(courses);
        log.warn("Updated object: " + courses.toString());
    }

    public void delete(Courses courses) {
        CoursesDao.delete(courses);
        log.warn("Deleted object: " + courses.toString());
    }

    public static CoursesService getInstance(){
        return INSTANCE;
    }

}
