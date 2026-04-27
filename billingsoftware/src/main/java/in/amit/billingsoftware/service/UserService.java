package in.amit.billingsoftware.service;

import in.amit.billingsoftware.io.UserRequest;
import in.amit.billingsoftware.io.UserResponse;

import java.util.List;

public interface UserService {

    UserResponse createUser(UserRequest request);

    String getUserRole(String email);

    List<UserResponse> readUsers();

    void deleteUser(String id);
}
