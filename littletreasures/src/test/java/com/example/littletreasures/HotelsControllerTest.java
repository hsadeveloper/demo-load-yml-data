package com.example.littletreasures;

import static org.mockito.Mockito.times;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.client.ExpectedCount;
import org.springframework.test.web.client.MockRestServiceServer;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class HotelsControllerTest {

    
    @Autowired
    private RestTemplate restTemplate; 

   
    @Test
    public void testGetHotelsByThemeAsian() throws Exception {
        
        MockRestServiceServer mockServer = MockRestServiceServer.bindTo(restTemplate).build();
        mockServer.expect(requestTo("http://localhost:55302/hotels/all")).andRespond(withSuccess());
        mockServer.expect(requestTo("http://localhost:55302/hotels/theme/Asian")).andRespond(withSuccess());


        // Mock the external call that ymlService makes
//        mockServer.expect(ExpectedCount.once(),
//                requestTo("http://localhost:55302/hotels")) // replace with actual URL
//                .andRespond(withSuccess(jsonResponse, MediaType.APPLICATION_JSON));
//
//        // Call the endpoint
//        mockMvc.perform(get("/theme/Asian"))
//                .andExpect(status().isOk())
//                // Add further assertions as needed, e.g., check the returned JSON
//                .andExpect(jsonPath("$[0].name").value("The Linq")); // example assertion

        // Verify that the mock server was called
        mockServer.verify();
    }
}
