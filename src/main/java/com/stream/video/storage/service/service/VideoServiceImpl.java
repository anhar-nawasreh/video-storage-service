package com.stream.video.storage.service.service;

import com.stream.video.storage.service.domain.Video;
import com.stream.video.storage.service.repository.VideoRepo;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VideoServiceImpl implements VideoService {

    final private VideoRepo videoRepo;
    @Override
    public Video save(Video video) {
        return videoRepo.save(video);
    }

    @Override
    public Video getVideo(int videoID) {
        return videoRepo.findById(videoID).get();

    }

    @Override
    public List<Video> getAllVideos() {
        return videoRepo.findAll();
    }
}
