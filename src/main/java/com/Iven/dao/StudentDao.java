package com.Iven.dao;
//数据逻辑层
//操作t_users数据表


import com.Iven.sqlname.SqlName;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface StudentDao {
    //查询student表的所有的数据
    public List<SqlName> selectStudents();

    //插入方法
    //参数： student ,表示要插入到数据库的数据
    //返回值： int ， 表示执行insert操作后的 影响数据库的行数
    public int insertStudent(SqlName sqlName);



    /**
     *  test文件中AppTest.java中测试
     *  传入一个或多个简单类型的参数：
     *  简单类型： mybatis把java的基本数据类型和String都叫简单类型。
     *  在mapper文件获取简单类型的一个参数的值，使用 #{任意字符}
     *  方法：命名参数，在形参定义的前面加入 @Param("自定义参数名称")
     */
     List<SqlName> selectMultiParam(@Param("myname") String name,
                                    @Param("mypass") String pass);

}
