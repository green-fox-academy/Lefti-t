package com.gfa.reddit.repositories;

import com.gfa.reddit.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    boolean findByUsername(String username);
    User getByUsername(String username);
    User findByUsernameAndPassword(String username, String password);

}
