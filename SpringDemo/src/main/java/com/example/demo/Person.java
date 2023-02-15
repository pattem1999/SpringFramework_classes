package com.example.demo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnSingleCandidate;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Data
@Builder
public class Person {

	private String name;
	private String email;
	
}
