package ma.xproce.tp2.service;

import ma.xproce.tp2.dao.entities.Creator;
import ma.xproce.tp2.dao.repositories.CreatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CreatorManagerService implements CreatorManager {
    private final CreatorRepository creatorRepository;

    @Autowired
    public CreatorManagerService(CreatorRepository creatorRepository) {
        this.creatorRepository = creatorRepository;
    }

    @Override
    public Creator addCreator(Creator creator) {
        try {
            return creatorRepository.save(creator);
        } catch (Exception e) {
            throw new RuntimeException("Failed to add creator: " + e.getMessage(), e);
        }
    }

    @Override
    public boolean deleteCreator(Creator product) {
        return false;
    }

    @Override
    public boolean deleteCreatorById(Integer id) {
        return false;
    }

    @Override
    public Creator updateCreator(Creator product) {
        return null;
    }

    @Override
    public Creator getCreatorById(Integer id) {
        try {
            return creatorRepository.findById(id)
                    .orElseThrow(() -> new RuntimeException("Creator not found with id: " + id));
        } catch (Exception e) {
            throw new RuntimeException("Failed to get creator by id: " + e.getMessage(), e);
        }
    }
    @Override
    public List<Creator> getAllCreator() {
        // Implement logic to get all creators
        return creatorRepository.findAll();
    }
}

