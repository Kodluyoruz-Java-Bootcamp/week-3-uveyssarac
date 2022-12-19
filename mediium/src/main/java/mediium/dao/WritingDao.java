package mediium.dao;

import mediium.model.Writing;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class WritingDao {
    private static List<Writing> writingList = new ArrayList<Writing>();

    public void createWriting(Writing writing) {
        writingList.add(writing);
    }

    public List<Writing> findAllWritings() {
        return writingList;
    }
}
