package com.buongiorno.cat.microservices.configServer;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;


//@RunWith(SpringRunner.class)
//@SpringBootTest // (webEnvironment = WebEnvironment.RANDOM_PORT)
//@AutoConfigureMockMvc
public class ConfigServerApplicationTests {

//
//	@Autowired
//	private MockMvc mockMvc;

//	@Test
//	public void configurationAvailable() throws Exception {
//		
//		this.mockMvc.perform(post("/")).andDo(print()).andExpect(status().isOk())
//		.andExpect(content().string(containsString("")));		
//	}
//
//	@Test
//	public void envPostAvailable() throws Exception {
//
//		this.mockMvc.perform(post("/admin/env")).andDo(print()).andExpect(status().isOk())
//		.andExpect(content().string(containsString("")));		
//	}
//	
}
