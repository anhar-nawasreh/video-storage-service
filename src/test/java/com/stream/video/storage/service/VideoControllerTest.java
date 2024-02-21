package com.stream.video.storage.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.stream.video.storage.service.controller.VideoController;
import com.stream.video.storage.service.domain.Video;
import com.stream.video.storage.service.repository.VideoRepo;
import com.stream.video.storage.service.service.VideoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(VideoController.class)

@AutoConfigureMockMvc
public class VideoControllerTest {
    @MockBean
    VideoService videoService;

    @MockBean
    VideoRepo videoRepo;

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;


    @Test
    public void postRequestTest() throws Exception {
        Video video = new Video();
        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/videos")
                        .contentType(MediaType.APPLICATION_JSON).content(objectMapper.writeValueAsString(video)))
                .andExpect(status().isCreated());

    }



}
