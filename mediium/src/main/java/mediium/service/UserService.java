package mediium.service;



import mediium.dao.UserDao;
import mediium.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {
    private UserDao userDao = new UserDao();

    public void createUser(User user) {
        userDao.createUser(user);
    }

    public List<User> getAllUser() {
        return userDao.findAllUsers();
    }

    public void printAll() {
        getAllUser().forEach(user -> System.out.println(user.toString()));
    }
}
