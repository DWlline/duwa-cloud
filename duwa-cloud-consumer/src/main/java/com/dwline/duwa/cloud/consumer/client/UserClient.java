package com.dwline.duwa.cloud.consumer.client;

import com.dwline.duwa.cloud.consumer.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "duwa-cloud-provider")
public interface UserClient {

    @GetMapping(value = "/user/getUsers", consumes = "application/json")
    List<User> getUsers();
}
