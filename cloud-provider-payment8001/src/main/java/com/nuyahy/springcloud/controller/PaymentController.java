package com.nuyahy.springcloud.controller;

import com.nuyahy.springcloud.entities.CommonResult;
import com.nuyahy.springcloud.entities.Payment;
import com.nuyahy.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 文件描述
 *
 * @ProductName: Hundsun sec-bcs
 * @ProjectName: cloud2023
 * @Package: com.nuyahy.springcloud.controller
 * @Description: note
 * @Author: wangrui41024
 * @CreateDate: 2023/7/25 10:14
 * @UpdateUser: wangrui41024
 * @UpdateDate: 2023/7/25 10:14
 * @since: 2023/7/25 10:14
 * @UpdateRemark: The modified content
 * @Version: 4.0
 * <p>
 * Copyright © 2023 Hundsun Technologies   Inc. All Rights Reserved
 **/
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping("/payment/create")
    public CommonResult<Integer> create(@RequestBody Payment payment){
        int creat = paymentService.creat(payment);
        log.info("订单记录插入结果：- {}", creat);
        if (creat > 0){
            return new CommonResult<>(200, "订单记录插入成功, serverPort:" + serverPort, creat);
        }else {
            return new CommonResult<>(444, "订单记录插入失败", null);
        }
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("订单记录查询结果：- {}", payment);
        if (payment != null){
            return new CommonResult<>(200, "订单记录查询-成功, serverPort:" + serverPort, payment);
        }else {
            return new CommonResult<>(444, "订单记录查询-失败："+id, null);
        }
    }

}
