package com.boot.handler;

import com.boot.entity.Student;
import com.boot.repository.StudentRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class StudentHandler {
    @Autowired
    private StudentRespository studentRespository;

    @GetMapping("/findAll")
    public List<Student> findAll(){
        return studentRespository.findAll();
    }

    @GetMapping("/findById/{id}")
    public  Student findById(@PathVariable("id") Integer id){
        return studentRespository.findById(id);

    }
}
