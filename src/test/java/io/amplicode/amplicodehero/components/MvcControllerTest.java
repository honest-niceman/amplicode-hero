package io.amplicode.amplicodehero.components;

import io.amplicode.amplicodehero.configurations.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.anonymous;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.csrf;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Test class for the {@link MvcController}
 */
@Import({WebSecurityConfiguration.class, WebSecurityJwtConfiguration.class, WebSecurityOAuth2Configuration.class, WebSecuritySASConfiguration.class, WebSecurityLDAPConfiguration.class, WebSecurityCustomConfiguration.class})
@WebMvcTest({MvcController.class})
public class MvcControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @BeforeEach
    public void setup() {

    }

    @Test
    @DisplayName("Test delete void")
    public void deleteVoidTest() throws Exception {
        mockMvc.perform(delete("/mvc/path"))
                .andExpect(status().isOk())
                .andDo(print());
    }

    @Test
    @DisplayName("Test get void")
    public void getVoidTest() throws Exception {
        mockMvc.perform(get("/mvc/path"))
                .andExpect(status().isOk())
                .andDo(print());
    }

    @Test
    @DisplayName("Test patch void")
    public void patchVoidTest() throws Exception {
        mockMvc.perform(patch("/mvc/path"))
                .andExpect(status().isOk())
                .andDo(print());
    }

    @Test
    @DisplayName("Test post void")
    public void postVoidTest() throws Exception {
        mockMvc.perform(post("/mvc/path")
                        .with(csrf())
                        .with(anonymous()))
                .andExpect(status().isOk())
                .andDo(print());
    }

    @Test
    @DisplayName("Test request void")
    public void requestVoidTest() throws Exception {

    }
}
