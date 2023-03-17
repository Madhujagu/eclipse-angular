package com.login.UserRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import com.login.Model.User;

@Service
public interface UserRepo extends JpaRepository<User, Integer> {

}
