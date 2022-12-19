package mediium.service;



import mediium.dao.WritingDao;
import mediium.model.Writing;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class WritingService {
    private WritingDao writingDao = new WritingDao();

    public void createWriting(Writing writing) {

        writingDao.createWriting(writing);
    }

    public List<Writing> getAllWritings() {
        return writingDao.findAllWritings();
    }

    public void printAll() {
        getAllWritings().forEach(writing -> System.out.println(writing.toString()));
    }
}
