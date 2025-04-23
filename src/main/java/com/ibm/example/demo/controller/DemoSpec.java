package com.ibm.example.demo.controller;

import com.ibm.example.demo.controller.dto.DemoEntity;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Tag(name = "Demo Controller", description = "Demo management APIs")
public interface DemoSpec {

    /**
     * GET request endpoint
     * @param name string
     * @return @ResponseEntity<DemoEntity> object
     */
    @Operation(summary = "Get string", description = "Returns demo entity object")
    @RequestMapping(
            method = RequestMethod.GET,
            value = "/demo/v1/{name}",
            produces = { "application/json" }
    )
    public ResponseEntity<DemoEntity> getDemoV1(final String name);
}
