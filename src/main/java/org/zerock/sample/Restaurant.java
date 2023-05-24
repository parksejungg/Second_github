package org.zerock.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;
//@component = 재사용가능객체 어노테이션
@Component
@Data
public class Restaurant {

	@Setter(onMethod_ = @Autowired)
	private Chef chef;
	
	
}
