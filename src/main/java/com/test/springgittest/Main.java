package com.test.springgittest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright (c) BizMotion Ltd. All Rights Reserved.
 *
 * @author boron
 * @since 10/23/21 11:37 PM
 */
@RestController
public class Main {

    @GetMapping("/first")
    public String getFirst(){
        return "Hello GIT";
    }


}
