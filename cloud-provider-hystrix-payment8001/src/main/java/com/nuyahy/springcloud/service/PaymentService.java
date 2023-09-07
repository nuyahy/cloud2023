package com.nuyahy.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * 文件描述
 *
 * @ProductName: Hundsun sec-bcs
 * @ProjectName: cloud2023
 * @Package: com.nuyahy.springcloud.service
 * @Description: note
 * @Author: wangrui41024
 * @CreateDate: 2023/9/5 16:37
 * @UpdateUser: wangrui41024
 * @UpdateDate: 2023/9/5 16:37
 * @since: 2023/9/5 16:37
 * @UpdateRemark: The modified content
 * @Version: 4.0
 * <p>
 * Copyright © 2023 Hundsun Technologies   Inc. All Rights Reserved
 **/
@Service
public class PaymentService {

    public String paymentInfo_OK(Integer id){
        return "线程池：" + Thread.currentThread().getName() + "payment_OK, id = "+id+"\t"+"O(∩_∩)O哈哈";
    }

    @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "5000")
    })
    public String paymentInfo_TimeOut(Integer id){
        int TIME_OUT = 3;
        try {
            TimeUnit.SECONDS.sleep(TIME_OUT);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return "线程池：" + Thread.currentThread().getName() + "payment_OK, id = "+id+"\t"+"/(ㄒoㄒ)/~~哭泣 睡眠"+TIME_OUT+"秒钟";
    }

    public String paymentInfo_TimeOutHandler(Integer id){
        return "线程池：" + Thread.currentThread().getName() + "paymentInfo_TimeOutHandler, id = "+id+"\t"+"~~~(^v^)~~~微笑";
    }


}
