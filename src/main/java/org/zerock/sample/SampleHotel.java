package org.zerock.sample;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

//@AllArgsConstructor 모든 인수를 생성자로 만들어줌
//@RequiredArgsConstructor 생성자로 만들어주는데 @NonNull로 되어있는 항목만 생성자로 만들어줌
@Component
@ToString
@Getter
//@AllArgsConstructor 
@RequiredArgsConstructor
public class SampleHotel {

	@NonNull
	private Chef chef;
	private int age;
	
	
//	public SampleHotel(Chef chef) {
//		this.chef = chef;
//	}
	
	
	
}
