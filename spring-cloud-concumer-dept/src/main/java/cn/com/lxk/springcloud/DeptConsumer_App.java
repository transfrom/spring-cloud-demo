package cn.com.lxk.springcloud;

import cn.com.lxk.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
//自定义rule MySelfRule不能放在@componentScan 所扫描的包及子包下
@RibbonClient(name="SPRING-CLOUD-DEPT",configuration = MySelfRule.class)
public class DeptConsumer_App {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_App.class,args);
    }

}
