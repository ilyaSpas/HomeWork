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
        return coursesDao.findById(id);
    }

    public void update(Courses courses) {
        coursesDao.update(courses);
        log.warn("Updated object: " + courses);
    }

    public void delete(Courses courses) {
        coursesDao.delete(courses);
        log.warn("Deleted object: " + courses);
    }

    public static CoursesService getInstance(){
        return INSTANCE;
    }

}
