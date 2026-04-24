package pl.zajecia.jenkinsheroku;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class JenkinsherokuApplicationTests {
    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldReturnDefaultMessage() throws Exception {
    this.mockMvc.perform(get("/"))
            .andDo(print())
            .andExpect(status().isOk())
            .andExpect(content().string("Hello Jenkins"));
    }
}
/*
W teście odwołaj się do wstrzykniętego obiektu mockMvc.
Użyj metody perform w ramach której zdefiniuj że: chcesz odpytać główny endpoint z wykorzystaniem metody get,
następnie wypisać wynik z użyciem metody print, kolejno, że spodziewasz się otrzymać satus ok, oraz że spodziewasz
się otrzymać taką samą zawartość jaka jest zdefiniowana w metodzie get aplikacji:
 */