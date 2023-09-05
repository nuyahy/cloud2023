package com.nuyahy.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 文件描述
 *
 * @ProductName: Hundsun sec-bcs
 * @ProjectName: cloud2023
 * @Package: com.nuyahy.springcloud.config
 * @Description: note
 * @Author: wangrui41024
 * @CreateDate: 2023/9/5 11:45
 * @UpdateUser: wangrui41024
 * @UpdateDate: 2023/9/5 11:45
 * @since: 2023/9/5 11:45
 * @UpdateRemark: The modified content
 * @Version: 4.0
 * <p>
 * Copyright © 2023 Hundsun Technologies   Inc. All Rights Reserved
 **/
@Configuration
public class FeignConfig {
    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
