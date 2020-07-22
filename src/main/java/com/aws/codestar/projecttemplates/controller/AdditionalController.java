package com.aws.codestar.projecttemplates.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdditionalController {
@GetMapping("/newEndPoint")
public String justAnEndPoint() {
	return "Customised Response for CodeStar 3rd time trial";
}
}
