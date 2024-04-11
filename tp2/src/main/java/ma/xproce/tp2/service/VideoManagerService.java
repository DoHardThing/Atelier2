package ma.xproce.tp2.service;

import ma.xproce.tp2.dao.entities.Creator;
import ma.xproce.tp2.dao.entities.Video;
import ma.xproce.tp2.dao.repositories.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VideoManagerService implements VideoManager{
    @Autowired
    private VideoRepository videoRepository;

    @Override
    public Video addVideo(Video video) {
        try {
            return videoRepository.save(video);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
