package com.app;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultMatcher;

@SpringBootTest
@AutoConfigureMockMvc
class DemoIueMgmApplicationTests {
	@Autowired
	private MockMvc mockMvc;
	

	/*@Test
	void contextLoads() throws Exception {
		
		
		
		 * RequestBuilder request = get("/greeting").param("name", "IUE");
		 * 
		 * ResultMatcher requestExpected = jsonPath("$.content") .value("Hello, IUE");
		 * this.mockMvc.perform(request) .andDo(print()).andExpect(status().isOk())
		 * .andExpect(requestExpected);
		 
		 

	}*/

}
