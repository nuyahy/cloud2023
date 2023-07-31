package com.nuyahy.springcloud.dao;

import com.nuyahy.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 文件描述
 *
 * @ProductName: Hundsun sec-bcs
 * @ProjectName: cloud2023
 * @Package: com.nuyahy.springcloud.dao
 * @Description: note
 * @Author: wangrui41024
 * @CreateDate: 2023/7/24 16:32
 * @UpdateUser: wangrui41024
 * @UpdateDate: 2023/7/24 16:32
 * @since: 2023/7/24 16:32
 * @UpdateRemark: The modified content
 * @Version: 4.0
 * <p>
 * Copyright © 2023 Hundsun Technologies   Inc. All Rights Reserved
 **/
@Mapper
public interface PaymentDao {
    public int creat(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
