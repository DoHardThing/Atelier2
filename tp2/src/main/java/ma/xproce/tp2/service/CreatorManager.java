package ma.xproce.tp2.service;

import ma.xproce.tp2.dao.entities.Creator;
import java.util.List;

public interface CreatorManager {
    public Creator addCreator(Creator creator);
    public boolean deleteCreator(Creator product);
    public boolean deleteCreatorById(Integer id);
    public Creator updateCreator(Creator product);
    public Creator getCreatorById(Integer id);
    public List<Creator> getAllCreator();


}
