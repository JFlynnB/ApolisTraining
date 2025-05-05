package com.example.JSPFront.config;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@Import(WebConfig.class)
@WebAppConfiguration
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {WebConfig.class, DummyController.class})
public class WebConfigTest {

    @Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;

    @BeforeEach
    void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }

    @Test
    void testViewResolverResolvesToCorrectJspPath() throws Exception {
        mockMvc.perform(get("/dummy"))  // assumes DummyController maps "/dummy" to "home"
               .andExpect(status().isOk())
               .andExpect(view().name("home"))
               .andExpect(forwardedUrl("/WEB-INF/views/home.jsp"));
    }
}

@Controller
class DummyController {
    @GetMapping("/dummy")
    public String dummy() {
        return "home";
    }
}
