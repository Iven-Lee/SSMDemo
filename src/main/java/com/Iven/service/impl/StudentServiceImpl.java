package com.Iven.service.impl;

import com.Iven.dao.StudentDao;
import com.Iven.service.StudentService;
import com.Iven.sqlname.SqlName;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


//创建service对象
@Service
public class StudentServiceImpl implements StudentService {
    /*
        1、spring配置文件：resources/conf/applicationContext.xml声明
        2、<!--声明mybatis的扫描器，创建dao对象-->
           <bean class="org.mybatis.spring.mapper.MapperScannerConfigurer">
             <property name="sqlSessionFactoryBeanName" value="sqlSessionFactory" />
             <property name="basePackage" value="com.Iven.dao" />
           </bean>
        3、@Resource默认采用byName自动注入（通过bean标签声明了dao对象）
    */
    //引用类型自动注入@Autowired, @Resource
    @Resource
    private StudentDao studentDao;

    @Override
    public int addStudent(SqlName sqlName) {
        int nums = studentDao.insertStudent(sqlName);
        return nums;
    }

    @Override
    public List<SqlName> findStudents() {
        return studentDao.selectStudents();
    }
}
