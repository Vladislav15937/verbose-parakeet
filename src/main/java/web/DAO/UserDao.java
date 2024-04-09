package web.DAO;

import web.model.User;

import java.util.List;

public interface UserDao {

    void addUser(User user);

    List<User> getListUsers();

    void deleteUsersById(Long id);

    User getUserById(Long id);

    void updateUserIntoId(User user, Long id);
}
