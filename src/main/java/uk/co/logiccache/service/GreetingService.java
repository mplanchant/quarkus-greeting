package uk.co.logiccache.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {

    private static final Logger LOG = LoggerFactory.getLogger(GreetingService.class);

    public String greeting(String name) {
        LOG.info("Generating greeting especially for {}", name);
        return "hello " + name;
    }

}
