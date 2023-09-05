package com.nuyahy.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * 文件描述
 *
 * @ProductName: Hundsun sec-bcs
 * @ProjectName: cloud2023
 * @Package: com.nuyahy.lb
 * @Description: note
 * @Author: wangrui41024
 * @CreateDate: 2023/9/5 9:23
 * @UpdateUser: wangrui41024
 * @UpdateDate: 2023/9/5 9:23
 * @since: 2023/9/5 9:23
 * @UpdateRemark: The modified content
 * @Version: 4.0
 * <p>
 * Copyright © 2023 Hundsun Technologies   Inc. All Rights Reserved
 **/
public interface LoadBalancer {

    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
