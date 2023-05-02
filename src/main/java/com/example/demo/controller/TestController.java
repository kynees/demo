package com.example.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "컨트롤러이름")
@RestController
public class TestController {

	@Operation(summary="요약", description="설명")
	@ApiResponse(code = 200, message="ok")
	@GetMapping("/api/hello1")
	public String hello1() {
		return "hello";
	}
}