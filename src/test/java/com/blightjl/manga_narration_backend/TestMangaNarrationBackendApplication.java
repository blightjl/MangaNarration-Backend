package com.blightjl.manga_narration_backend;

import org.springframework.boot.SpringApplication;

public class TestMangaNarrationBackendApplication {

	public static void main(String[] args) {
		SpringApplication.from(MangaNarrationBackendApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
