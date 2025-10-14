package ie.atu.cloudnative.catalogservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ie.atu.cloudnative.catalogservice.config.AtuProperties;
import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class HomeController {
    private final AtuProperties atuProperties;  // Automatically injected by Spring
    public HomeController(AtuProperties atuProperties) {
        this.atuProperties = atuProperties;
    }
    @GetMapping("/")
    public String getGreeting() {
        return atuProperties.getGreeting();  // Returns the configured greeting
    }
}