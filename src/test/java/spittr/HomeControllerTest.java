package spittr;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import spittr.web.HomeController;

import static junit.framework.Assert.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

public class HomeControllerTest {

    @Test
    public void testHomePage() {
        HomeController controller = new HomeController();
        assertEquals("home",controller.home());
    }

    @Test
    public void testHomePage2() throws Exception {
        HomeController controller = new HomeController();
        MockMvc mockMvc = standaloneSetup(controller).build();
        mockMvc.perform(get("/")).andExpect(view().name("home"));
    }
}
