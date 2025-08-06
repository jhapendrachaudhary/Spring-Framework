package org.example.RemovingConfigFile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "org.example.RemovingConfigFile")
public class JavaConfig {
    @Bean(name={"temp","class"})
    public Student getStudent(){
        return new Student(getPaper());
    }
    @Bean
    public Paper getPaper(){
        return new Paper();
    }
}
