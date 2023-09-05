package com.nuyahy.springcloud.service;

import com.nuyahy.springcloud.entities.CommonResult;
import com.nuyahy.springcloud.entities.Payment;
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
 * @CreateDate: 2023/9/5 10:53
 * @UpdateUser: wangrui41024
 * @UpdateDate: 2023/9/5 10:53
 * @since: 2023/9/5 10:53
 * @UpdateRemark: The modified content
 * @Version: 4.0
 * <p>
 * Copyright © 2023 Hundsun Technologies   Inc. All Rights Reserved
 **/
@Component
@FeignClient(value = "CLOUD-PROVIDER-PAYMENT")
public interface PaymentFeignService {

    @GetMapping(value = "/payment/get/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

    @GetMapping(value = "/payment/feign/timeout")
    String paymentFeignTimeOut();

}
