package cn.live.recommendation.lrs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "cn.live.recommendation.lrs.dao")
public class LrsApplication {

    public static void main(String[] args) {
        SpringApplication.run(LrsApplication.class, args);
    }

}
