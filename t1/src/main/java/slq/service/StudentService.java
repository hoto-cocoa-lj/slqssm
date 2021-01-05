package slq.service;

import slq.pojo.Student;

public interface StudentService {
    Student getStudent(int id);
    void add(Student s);
    void delete(int id);
}
