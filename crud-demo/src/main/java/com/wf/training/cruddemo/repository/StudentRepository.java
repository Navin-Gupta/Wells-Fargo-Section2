package com.wf.training.cruddemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.wf.training.cruddemo.entity.Student;

// public interface StudentRepository extends CrudRepository<T, ID>{
// @Component
@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
