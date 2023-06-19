package com.icwd.repositories;

import com.icwd.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users,String> {

    //if you want to any custom method
    //write

}
