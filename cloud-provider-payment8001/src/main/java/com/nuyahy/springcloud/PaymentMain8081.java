package com.nuyahy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 文件描述
 *
 * @ProductName: Hundsun sec-bcs
 * @ProjectName: cloud2023
 * @Package: com.nuyahy
 * @Description: note
 * @Author: wangrui41024
 * @CreateDate: 2023/7/24 10:07
 * @UpdateUser: wangrui41024
 * @UpdateDate: 2023/7/24 10:07
 * @since: 2023/7/24 10:07
 * @UpdateRemark: The modified content
 * @Version: 4.0
 * <p>
 * Copyright © 2023 Hundsun Technologies   Inc. All Rights Reserved
 **/
@SpringBootApplication
@EnableEurekaClient
public class PaymentMain8081 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8081.class, args);
    }
}
