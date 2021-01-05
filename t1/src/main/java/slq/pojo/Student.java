package slq.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Repository
public class Student implements Serializable {
    private int id ;
    private String name;
    private int age;
    @Autowired(required = false)
    private Teacher teacher;

    public static void main(String[] args) {
        System.out.println("what si shit");
    }
}
