package com.cybersoft18.BaiTapStudentController.configBean;

import com.cybersoft18.BaiTapStudentController.model.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentBeanConfig {

    @Bean
    public Student createBeanStudent(){
        Student student = new Student();
        student.setName("khanhDz");
        student.setAge(22);
        return student;
    }

}
