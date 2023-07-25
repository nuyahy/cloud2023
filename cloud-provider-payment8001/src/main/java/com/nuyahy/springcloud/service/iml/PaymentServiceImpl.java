package com.nuyahy.springcloud.service.iml;

import com.nuyahy.springcloud.dao.PaymentDao;
import com.nuyahy.springcloud.entities.Payment;
import com.nuyahy.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.annotation.Resource;

/**
 * 文件描述
 *
 * @ProductName: Hundsun sec-bcs
 * @ProjectName: cloud2023
 * @Package: com.nuyahy.springcloud.service.iml
 * @Description: note
 * @Author: wangrui41024
 * @CreateDate: 2023/7/25 10:07
 * @UpdateUser: wangrui41024
 * @UpdateDate: 2023/7/25 10:07
 * @since: 2023/7/25 10:07
 * @UpdateRemark: The modified content
 * @Version: 4.0
 * <p>
 * Copyright © 2023 Hundsun Technologies   Inc. All Rights Reserved
 **/
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;


    @Override
    public int creat(Payment payment) {
        return paymentDao.creat(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
       return paymentDao.getPaymentById(id);
    }
}
