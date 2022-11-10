package com.lucas.consumerTwo.client;

import com.lucas.consumerTwo.dtos.UserRequestDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.FeignClientProperties;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "${app.gc-one.name}",
        url = "${app.gc-one.url}", configuration = FeignClientProperties.FeignClientConfiguration.class)
public interface ClientGcOne {

    @RequestMapping(
            value = "/user-send",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    ResponseEntity<String> sendUser(
            @RequestBody UserRequestDTO userRequestDTO);

}
