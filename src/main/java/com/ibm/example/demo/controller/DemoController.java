package com.ibm.example.demo.controller;

import com.ibm.example.demo.controller.dto.DemoEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Demo REST API Controller
 */
@Controller
@RequestMapping("${app.config.service.base-path:}")
public class DemoController implements DemoSpec {

    public static final String DEMO_PREFIX = "Hello from DemoController";

    /**
     * GET request endpoint
     * @param name string
     * @return @ResponseEntity<DemoEntity> object
     */
    @Override
    public ResponseEntity<DemoEntity> getDemoV1(final String name) {
        final DemoEntity demoEntity = new DemoEntity();
        demoEntity.setDescription(String.format("%s, %s", DEMO_PREFIX, name));
        return ResponseEntity.ok(demoEntity);
    }
}
