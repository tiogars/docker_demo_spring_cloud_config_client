package fr.tiogars.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class DefaultController {
    
    @Value("${message:Hello from local}")
	private String message;

    @GetMapping("/")
    public String index() {
        return this.message;
    }
}
