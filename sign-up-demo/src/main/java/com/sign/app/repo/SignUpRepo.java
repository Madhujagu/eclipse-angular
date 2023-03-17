package com.sign.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import com.sign.app.model.Signup;

@Service
public interface SignUpRepo extends JpaRepository<Signup, Integer> {

}
