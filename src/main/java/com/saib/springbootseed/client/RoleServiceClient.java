package com.saib.springbootseed.client;

import com.saib.springbootseed.entity.Role;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(name = "role-service", url = "${role-service.url}")
public interface RoleServiceClient {

    @GetMapping("/api/v1/roles/{id}")
    Role getRoleById(@PathVariable("id") Long id);
}

