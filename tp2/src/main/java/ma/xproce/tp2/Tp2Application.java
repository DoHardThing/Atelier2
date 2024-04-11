package ma.xproce.tp2;

import org.springframework.context.annotation.Bean;
import ma.xproce.tp2.dao.entities.Creator;
import ma.xproce.tp2.dao.entities.Video;
import ma.xproce.tp2.dao.repositories.CreatorRepository;
import ma.xproce.tp2.dao.repositories.VideoRepository;
import ma.xproce.tp2.service.CreatorManager;
import ma.xproce.tp2.service.VideoManager;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;
import java.util.Date;

@SpringBootApplication
public class Tp2Application {
    public static void main(String[] args) {
        SpringApplication.run(Tp2Application.class, args);
    }

    @Bean
    CommandLineRunner startDAO(CreatorRepository creatorRepository, VideoRepository videoRepository){
        return args -> {
            Creator creator = new Creator(1,"c1","x@gmail.com",new ArrayList<>());
            creatorRepository.save(creator);
            Video video = new Video();
            video.setId(1);
            video.setName("v1");
            video.setUrl("url1");
            video.setDescription("Description 1");
            video.setDate_publication(new Date(2022,07,01));
            videoRepository.save(video);
        };
    }

    @Bean
    CommandLineRunner startService(CreatorManager creatorManager, VideoManager videoManager){
        return args -> {
            Creator creator = new Creator(2,"c1","x@gmail.com",new ArrayList<>());
            creatorManager.addCreator(creator);
            Video video = new Video();
            video.setId(2);
            video.setName("v2");
            video.setUrl("url2");
            video.setDescription("Description 2");
            video.setDate_publication(new Date(2022,07,01));
            videoManager.addVideo(video);
        };
    }
}
