package top.zixuan007.yeb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @author zixuan007
 * @description: 启动类
 * @date: 2021/7/19 上午10:40
 */
@SpringBootApplication
@MapperScan("top.zixuan007.yeb.mapper")
public class YebApplication {
    public static void main(String[] args) {
        SpringApplication.run(YebApplication.class, args);
    }
}
