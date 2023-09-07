package com.nuyahy.springcloud.service.impl;

import com.nuyahy.springcloud.service.PaymentHystrixService;
import org.springframework.stereotype.Component;

/**
 * 文件描述
 *
 * @ProductName: Hundsun sec-bcs
 * @ProjectName: cloud2023
 * @Package: com.nuyahy.springcloud.service.impl
 * @Description: note
 * @Author: wangrui41024
 * @CreateDate: 2023/9/6 17:02
 * @UpdateUser: wangrui41024
 * @UpdateDate: 2023/9/6 17:02
 * @since: 2023/9/6 17:02
 * @UpdateRemark: The modified content
 * @Version: 4.0
 * <p>
 * Copyright © 2023 Hundsun Technologies   Inc. All Rights Reserved
 **/
@Component
public class PaymentFallbakService implements PaymentHystrixService {
    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK , (┬＿┬)";
    }

    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut , (┬＿┬)";
    }
}
