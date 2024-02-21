package com.stream.video.storage.service.service;

import com.stream.video.storage.service.domain.Video;
import org.springframework.stereotype.Service;

import java.util.List;


public interface VideoService {
    Video save(Video video);

    Video getVideo(int videoID);

    List<Video> getAllVideos();
}
