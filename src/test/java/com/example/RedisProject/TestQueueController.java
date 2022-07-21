package com.example.RedisProject;

import com.example.RedisProject.Service.QueueInterface;
import com.example.RedisProject.controller.CustomQueue;
import com.example.RedisProject.controller.QueueSelector;
import com.example.RedisProject.controller.RabbitQ;
import com.example.RedisProject.model.Converter;
import com.example.RedisProject.model.UserRequest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestQueueController {
    @Mock
    private Converter converter;
    @Mock
    private QueueInterface<UserRequest> queueInterface;
    private MockMvc mvc;

//    private CustomQueue customQueue;
//
//    private RabbitQ rabbitQ;
    @Autowired
    @Qualifier("customqueue")
    private CustomQueue custom;
    @Mock
    private RabbitQ rabbit;
    private UserRequest userRequest;

    @BeforeEach
    public void beforeEach() {
        userRequest = new UserRequest(1L, "user1", 26, "01/01/1995", "chennai");
    }
//
//    @Test
//    @Order(1)
//    public void testEnque() throws Exception {
//        String uri = "/enque";
//        custom.enque(userRequest);
//        String inputJson = userRequest.toString();
//        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.post(uri)
//                .contentType(MediaType.APPLICATION_JSON_VALUE)
//                .content(inputJson)).andReturn();
//
//        int status = mvcResult.getResponse().getStatus();
//        assertEquals(202, status);
//    }

}
