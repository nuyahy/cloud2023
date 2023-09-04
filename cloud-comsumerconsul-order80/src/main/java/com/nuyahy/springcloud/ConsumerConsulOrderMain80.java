package com.nuyahy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 文件描述
 *
 * @ProductName: Hundsun sec-bcs
 * @ProjectName: cloud2023
 * @Package: com.nuyahy.springcloud
 * @Description: note
 * @Author: wangrui41024
 * @CreateDate: 2023/9/4 14:57
 * @UpdateUser: wangrui41024
 * @UpdateDate: 2023/9/4 14:57
 * @since: 2023/9/4 14:57
 * @UpdateRemark: The modified content
 * @Version: 4.0
 * <p>
 * Copyright © 2023 Hundsun Technologies   Inc. All Rights Reserved
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerConsulOrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerConsulOrderMain80.class, args);
    }
}
