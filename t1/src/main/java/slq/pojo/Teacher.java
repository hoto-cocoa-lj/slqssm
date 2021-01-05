package slq.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.List;

@Data
@Repository
public class Teacher {

    @Value("1")
    private int id ;
    @Value("teacher li")
    private String name;
    private List<Student> students;
}
