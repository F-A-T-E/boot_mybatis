package com.boot.repository;

import com.boot.entity.Student;

import java.util.List;

public interface StudentRespository {

    public List<Student> findAll();
    public  Student findById(int id);
    public  void save(Student student);
    public  void  update(Student student);
    public  void  deleteById(int id);

}
