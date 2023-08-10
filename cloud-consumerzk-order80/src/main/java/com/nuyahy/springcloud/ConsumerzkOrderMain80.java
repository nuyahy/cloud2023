package com.nuyahy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ApplicationContext;

/**
 * 文件描述
 *
 * @ProductName: Hundsun sec-bcs
 * @ProjectName: cloud2023
 * @Package: com.nuyahy.springcloud
 * @Description: note
 * @Author: wangrui41024
 * @CreateDate: 2023/8/10 14:38
 * @UpdateUser: wangrui41024
 * @UpdateDate: 2023/8/10 14:38
 * @since: 2023/8/10 14:38
 * @UpdateRemark: The modified content
 * @Version: 4.0
 * <p>
 * Copyright © 2023 Hundsun Technologies   Inc. All Rights Reserved
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerzkOrderMain80 {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerzkOrderMain80.class, args);
    }
}
