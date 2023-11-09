package io.amplicode.amplicodehero.components;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/mvc")
public class MvcController {
    @GetMapping("/path")
    public void getVoid() {}

    @PostMapping("/path")
    public void postVoid() {}

    @DeleteMapping("/path")
    public void deleteVoid() {}

    @PatchMapping("/path")
    public void patchVoid() {}

    @RequestMapping("/path")
    public void requestVoid() {}
}

