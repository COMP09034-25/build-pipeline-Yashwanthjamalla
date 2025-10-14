package ie.atu.cloudnative.catalogservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "atu") // Binds properties starting with "atu."
public class AtuProperties {
    private String greeting; // Maps to atu.greeting property
    public String getGreeting() { return greeting; }
    public void setGreeting(String greeting) { this.greeting = greeting; }
}