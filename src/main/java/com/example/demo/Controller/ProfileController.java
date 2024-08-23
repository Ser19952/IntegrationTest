package com.example.demo.Controller;

import com.example.demo.SystemProfile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ProfileController {
    private final SystemProfile systemProfile;

    public ProfileController(SystemProfile systemProfile) {
        this.systemProfile = systemProfile;
    }

    @GetMapping("profile")
    public String getProfile() {
        return systemProfile.getProfile();
    }
}
