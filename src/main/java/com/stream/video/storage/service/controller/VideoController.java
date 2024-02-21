package com.stream.video.storage.service.controller;


import com.stream.video.storage.service.domain.Video;
import com.stream.video.storage.service.service.VideoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/videos")
@RequiredArgsConstructor
public class VideoController {

    private final VideoService videoService;

    @PostMapping
    public ResponseEntity saveVideo(@Valid @RequestBody Video video)
    {
        Video newVideo = videoService.save(video);
        return new ResponseEntity( newVideo, HttpStatus.CREATED);
    }

    @GetMapping("/{videoID}")
    public ResponseEntity getVideo( @PathVariable int videoID)
    {
        return new ResponseEntity(videoService.getVideo(videoID),HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity getAllVideos( )
    {
        return new ResponseEntity(videoService.getAllVideos(),HttpStatus.OK);
    }


}
