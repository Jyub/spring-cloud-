package biao.yu.springcloudconsulclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @version v1.0
 * @author: yubiao
 * @date: 2019/5/15 17:55
 * @description:
 */
@RestController
public class ConsulController {

    private DiscoveryClient discoveryClient;

    @Autowired
    public ConsulController(DiscoveryClient discoveryClient) {
        this.discoveryClient = discoveryClient;
    }

    @GetMapping("/services")
    public List<String> getServices(){
        return  discoveryClient.getServices();
    }

    @GetMapping("/description")
    public String description(){
        return discoveryClient.description();
    }

    @GetMapping("/getOrder")
    public int getOrder(){
        return discoveryClient.getOrder();
    }

    @GetMapping("/getInstances/{id}")
    public List getInstances(@PathVariable String id){
        return discoveryClient.getInstances(id);
    }
}
