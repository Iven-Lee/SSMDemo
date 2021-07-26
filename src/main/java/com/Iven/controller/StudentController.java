package com.Iven.controller;


import com.Iven.service.StudentService;
import com.Iven.sqlname.SqlName;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

//创建控制器对象
@Controller
@RequestMapping(path = "/student")
public class StudentController {

    @Resource
    private StudentService service;

    //注册学生
    @RequestMapping(path = "/addStudent")
    public ModelAndView addStudent(SqlName sqlName){
        ModelAndView mv = new ModelAndView();
        String tips = "注册失败";
        //调用service处理student
        int nums = service.addStudent(sqlName);
        if( nums > 0 ){
            //注册成功
            tips = "学生【" + sqlName.getUserName() + "】注册成功";
            System.out.println(tips);
        }
        //添加数据
        mv.addObject("tips" , tips);
        //指定结果页面
        mv.setViewName("result");
        return mv;

    }

    //处理查询，响应ajax
    @RequestMapping(path = "/queryStudent")
    @ResponseBody
    public List<SqlName> queryStudent(){
        //参数检查， 简单的数据处理
        List<SqlName> students = service.findStudents();
        return students;
    }
}
