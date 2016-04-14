package com.excercise.tests.web;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import com.excercise.web.HomeController;

public class HomeControllerTextCase {

	@Test
	public void testHomeMethodReturnsCorrectString() throws Exception {
		HomeController controller = new HomeController();
		assertEquals("home", controller.home());
	}

	@Test
	public void testHomePageGetRequestReturnsCorrectView() throws Exception {
		HomeController controller = new HomeController();
		MockMvc mockMvc = standaloneSetup(controller).build();

		mockMvc.perform(get("/")).andExpect(view().name("home"));
	}
}
