package com.Iven.service;



import com.Iven.sqlname.SqlName;

import java.util.List;

public interface StudentService {

    int addStudent(SqlName sqlName);
    List<SqlName> findStudents();
}
