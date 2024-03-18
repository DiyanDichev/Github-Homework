package Day11_SOLID.P04InterfaceSegregation.identity.interfaces;

public interface UserService {
    Iterable<User> getAllUsersOnline();

    Iterable<User> getAllUsers();

    User getUserByName(String name);
}
