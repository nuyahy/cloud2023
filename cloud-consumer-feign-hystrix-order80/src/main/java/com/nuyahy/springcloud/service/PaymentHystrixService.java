package com.nuyahy.springcloud.service;

import com.nuyahy.springcloud.service.impl.PaymentFallbakService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 文件描述
 *
 * @ProductName: Hundsun sec-bcs
 * @ProjectName: cloud2023
 * @Package: com.nuyahy.springcloud.service
 * @Description: note
 * @Author: wangrui41024
 * @CreateDate: 2023/9/5 17:58
 * @UpdateUser: wangrui41024
 * @UpdateDate: 2023/9/5 17:58
 * @since: 2023/9/5 17:58
 * @UpdateRemark: The modified content
 * @Version: 4.0
 * <p>
 * Copyright © 2023 Hundsun Technologies   Inc. All Rights Reserved
 **/
@Component
@FeignClient(value = "cloud-provider-hystrix-payment", fallback = PaymentFallbakService.class)
public interface PaymentHystrixService {

    @GetMapping(value = "/payment/hystrix/timeout/{id}")
    String paymentInfo_TimeOut(@PathVariable("id") Integer id);

    @GetMapping(value = "/payment/hystrix/ok/{id}")
    String paymentInfo_OK(@PathVariable("id") Integer id);
}
