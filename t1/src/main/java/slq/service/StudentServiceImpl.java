package slq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import slq.mapper.StudentMapper;
import slq.pojo.Student;
@Service("studentService")
@Transactional
public class StudentServiceImpl implements StudentService{
    @Autowired
    StudentMapper m;
    public Student getStudent(int id) {
        return m.getOne(id);
    }

    public void add(Student s) {
        m.insert1(s);
        delete(0);
    }

    public void delete(int id) {
        m.del(id);
    }
}
