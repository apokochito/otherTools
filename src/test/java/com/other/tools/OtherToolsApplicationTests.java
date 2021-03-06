package com.other.tools;

import com.other.tools.controller.TestController;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = TestController.class)
@RunWith(SpringRunner.class)
class OtherToolsApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void printHelloTest() throws Exception {
		mockMvc.perform( MockMvcRequestBuilders
				.get("/hello?name=John")
				.accept(MediaType.TEXT_PLAIN))
				.andDo(print())
				.andExpect(status().isOk());
	}

}
