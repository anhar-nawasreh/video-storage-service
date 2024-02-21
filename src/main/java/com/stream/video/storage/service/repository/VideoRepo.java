package com.stream.video.storage.service.repository;

import com.stream.video.storage.service.domain.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepo extends JpaRepository<Video, Integer> {


}
