package com.huan.study.cloud.alibaba.user;

import com.alibaba.cloud.nacos.NacosDiscoveryProperties;
import com.alibaba.cloud.nacos.NacosServiceManager;
import com.alibaba.nacos.api.exception.NacosException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author huan.fu 2020/10/24 - 11:21
 */
@RestController
@RequiredArgsConstructor
@Slf4j
public class UserController {

    private final DiscoveryClient discoveryClient;
    private final RestTemplate restTemplate;

    private final NacosServiceManager nacosServiceManager;
    private final NacosDiscoveryProperties nacosDiscoveryProperties;

    @GetMapping("getAllProduct")
    public String getAllProduct() {
        return restTemplate.getForObject("http://product-provider/findAll", String.class);
    }

    @GetMapping("/getProductProviderInstances")
    public List<ServiceInstance> getProductProviderInstances() {
        return discoveryClient.getInstances("product-provider");
    }

    /**
     * 将该服务从 nacos 注册中心中移除，此时该服务还是可以对外提供服务的
     *
     * @throws NacosException NacosException
     */
    @GetMapping("nacosServiceShutDown")
    public void nacosServiceShutDown() throws NacosException {
        nacosServiceManager.nacosServiceShutDown();
    }
}
