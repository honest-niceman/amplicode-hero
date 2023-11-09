package io.amplicode.amplicodehero.components;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
@CrossOrigin("")
public class MyRestController {
    @GetMapping("/path")
    public void getVoid() {

    }
}

