package cn.live.recommendation.lrs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableAutoConfiguration
@MapperScan(value = "cn.live.recommendation.lrs.dao")
public class LrsApplication {

    public static void main(String[] args) {
        SpringApplication.run(LrsApplication.class, args);
    }

}
