package io.amplicode.amplicodehero.components;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.ReactiveCloudFoundryActuatorAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.data.annotation.Persistent;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Component
//@RequestMapping("/mvc")
//@RequiredArgsConstructor
public class MvcController {

    @GetMapping("/path")
    public void getVoid() {

    }

    @PostMapping("/path")
    public void postVoid() {}

    @DeleteMapping("/path")
    public void deleteVoid() {}

    @PatchMapping("/path")
    public void patchVoid() {}

    @RequestMapping("/path")
    public void requestVoid() {}
}

