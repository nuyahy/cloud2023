package com.nuyahy.springcloud.service;

import com.nuyahy.springcloud.entities.Payment;

/**
 * 文件描述
 *
 * @ProductName: Hundsun sec-bcs
 * @ProjectName: cloud2023
 * @Package: com.nuyahy.springcloud.service
 * @Description: note
 * @Author: wangrui41024
 * @CreateDate: 2023/7/25 10:06
 * @UpdateUser: wangrui41024
 * @UpdateDate: 2023/7/25 10:06
 * @since: 2023/7/25 10:06
 * @UpdateRemark: The modified content
 * @Version: 4.0
 * <p>
 * Copyright © 2023 Hundsun Technologies   Inc. All Rights Reserved
 **/
public interface PaymentService {

    public int creat(Payment payment);

    public Payment getPaymentById(Long id);
}
