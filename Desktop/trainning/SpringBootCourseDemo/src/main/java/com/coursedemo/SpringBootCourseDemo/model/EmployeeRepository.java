package com.coursedemo.SpringBootCourseDemo.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository - data access layer used to perform DML operation -select, insert,delete,update
//inbuild interfaces- 
//CurdRepository-old
//JpaRepository- new approach. it extends CurdRepository , PaginationSortingRepository-for sorting
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
