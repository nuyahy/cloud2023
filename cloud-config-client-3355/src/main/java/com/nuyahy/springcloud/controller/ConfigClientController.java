package com.nuyahy.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 文件描述
 *
 * @ProductName: Hundsun sec-bcs
 * @ProjectName: cloud2023
 * @Package: com.nuyahy.springcloud.controller
 * @Description: note
 * @Author: wangrui41024
 * @CreateDate: 2023/9/8 17:31
 * @UpdateUser: wangrui41024
 * @UpdateDate: 2023/9/8 17:31
 * @since: 2023/9/8 17:31
 * @UpdateRemark: The modified content
 * @Version: 4.0
 * <p>
 * Copyright © 2023 Hundsun Technologies   Inc. All Rights Reserved
 **/
@RestController
@RefreshScope
public class ConfigClientController {

    @Value("${config.x}")
    private String configInfo;

    @GetMapping("/configInfo")
    public String getConfigInfo(){
        return configInfo;
    }
}

