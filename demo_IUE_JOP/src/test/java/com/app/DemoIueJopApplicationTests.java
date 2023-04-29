package com.app;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultMatcher;

@SpringBootTest
@AutoConfigureMockMvc
class DemoIueJopApplicationTests {
	
	/*private MockMvc mockMvc;

	/*@Test
/*	void test2() throws Exception {
		
		// (Escenario)
		//(Give) some context
		RequestBuilder request = get("/greeting").param("name", "IUE");
		
		// (when) some action is carried out
		
		ResultMatcher requestExpected = jsonPath("$.content")
										.value("Hello, IUE");
		// (Then) a particular set of observable consequences should obtain
		this.mockMvc.perform(request)
					.andDo(print()).andExpect(status().isOk())
					.andExpect(requestExpected);
		
	}
	
		

}*/
}
