package edu.fra.uas.hello;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@SpringBootTest
@AutoConfigureMockMvc
class HomeControllerTest {

    @Autowired
    MockMvc mvc;

    @Test
    void rootRendersTemplateWithBeanMessage() throws Exception {
        mvc.perform(get("/"))
           .andExpect(status().isOk())
           .andExpect(content().string(org.hamcrest.Matchers.containsString("Hallo aus dem Bean!")));
    }
}
