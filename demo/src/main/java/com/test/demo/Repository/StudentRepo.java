package com.test.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.test.demo.student;
public interface StudentRepo extends JpaRepository<student, Integer> {

}
