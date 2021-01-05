package slq.mapper;

import org.springframework.stereotype.Service;
import slq.pojo.Student;

public interface StudentMapper {
    public Student getOne(int id);
    public void insert1(Student s);
    public void del(int id);
}
