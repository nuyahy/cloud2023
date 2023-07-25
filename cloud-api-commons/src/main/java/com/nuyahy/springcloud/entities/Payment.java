package com.nuyahy.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 文件描述
 *
 * @ProductName: Hundsun sec-bcs
 * @ProjectName: cloud2023
 * @Package: com.nuyahy.springcloud.entities
 * @Description: note
 * @Author: wangrui41024
 * @CreateDate: 2023/7/24 16:22
 * @UpdateUser: wangrui41024
 * @UpdateDate: 2023/7/24 16:22
 * @since: 2023/7/24 16:22
 * @UpdateRemark: The modified content
 * @Version: 4.0
 * <p>
 * Copyright © 2023 Hundsun Technologies   Inc. All Rights Reserved
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {

    private Long id;

    private String serial;
}
