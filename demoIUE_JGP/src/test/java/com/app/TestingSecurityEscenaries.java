package com.app;
import static org.junit.jupiter.api.Assertions.assertTrue;
/*
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestBuilders.formLogin;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.httpBasic;
import static org.springframework.security.test.web.servlet.response.SecurityMockMvcResultMatchers.authenticated;
import static org.springframework.security.test.web.servlet.response.SecurityMockMvcResultMatchers.unauthenticated;
*/
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;

@SpringBootTest
@AutoConfigureMockMvc
public class TestingSecurityEscenaries {

	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void shouldReturnParamMessage() throws Exception {
		// (Escenario)
		// (Given) some context
		// (When) some action is carried out
		// (Then) a particular set of observable consequences should obtain
		/*
		 * Un ejemplo: Retiro de un Cajero Dado que mi cuenta bancaria tiene crédito y
		 * no hice retiros recientemente, Cuando intento retirar una cantidad menor que
		 * el límite de mi tarjeta, Entonces el retiro debe completarse sin errores ni
		 * advertencias. // JBehave, RSpec o Cucumber
		 * https://openwebinars.net/blog/que-es-gherkin/
		 */
				
		// Escenario 1: Realizo el llamado a la URL
		// GIVEN: Dado que el servicio Esta respondiendo
		// WHEN: Cuando invoco la URL
		// THEN: El servicio responde el Saludo Hello, World!!
		
	/*	String URL = "/greeting?name=Juan!";
		MockHttpServletRequestBuilder peticionBuilder = get(URL).with(httpBasic("admin", "adminPass"));
		
		MvcResult mvcResult = this.mockMvc.perform(peticionBuilder)
			      .andDo(print()).andExpect(status().isOk())
			      .andReturn();
	    String body = mvcResult.getResponse().getContentAsString();
			    				
		assertTrue("{\"id\":2,\"content\":\"Hello, Juan!!\"}".equals(body));*/
		
	}
	
	@Test	
	public void shouldReturnDefaultMessage() throws Exception {
		// (Escenario)
		// (Given) some context
		// (When) some action is carried out
		// (Then) a particular set of observable consequences should obtain

		/*
		 * Un ejemplo: Retiro de un Cajero Dado que mi cuenta bancaria tiene crédito y
		 * no hice retiros recientemente, Cuando intento retirar una cantidad menor que
		 * el límite de mi tarjeta, Entonces el retiro debe completarse sin errores ni
		 * advertencias. // JBehave, RSpec o Cucumber
		 * https://openwebinars.net/blog/que-es-gherkin/
		 */
				
		// Escenario 1: Realizo el llamado a la URL me saluda con mi nombre
		// GIVEN: Dado que el servicio Esta respondiendo
		// WHEN: Cuando invoco la URL
		// THEN: El servicio responde el Saludo con mi nombre: Hello, Juan!
		
		/*String URL = "/greeting";
		MockHttpServletRequestBuilder peticionBuilder = get(URL).with(httpBasic("admin", "adminPass"));
		MvcResult mvcResult = this.mockMvc.perform(peticionBuilder)
			      .andDo(print()).andExpect(status().isOk())
			      .andReturn();
		
				String body = mvcResult.getResponse().getContentAsString();
			    
		assertTrue("{\"id\":1,\"content\":\"Hello, World!\"}".equals(body));*/
		
		
	}
	
	/*
	@Test
    public void accessProtected() throws Exception {
        this.mockMvc.perform(get("/ADMIN"))
                .andExpect(status().isUnauthorized());
    }

    @Test
    public void loginUser() throws Exception {
        this.mockMvc.perform(get("/ADMIN").with(httpBasic("ADMIN", "password")))
                .andExpect(authenticated());
    }

    @Test
    public void loginUserUNAutorized() throws Exception {
        this.mockMvc.perform(get("/ADMIN").with(httpBasic("user", "password")))
                .andExpect(unauthenticated());
    }
    
    
    @Test
    public void loginInvalidUser() throws Exception {
        MvcResult result = this.mockMvc.perform(formLogin().user("invalid").password("invalid"))
                .andExpect(unauthenticated())
                .andExpect(status().is4xxClientError())
                .andReturn();
        assertTrue(result.getResponse().getContentAsString().contains("HTTP Status 401"));
    }
	*/
	
}
