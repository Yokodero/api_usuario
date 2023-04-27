package com.api.api_user.Repository;

import com.api.api_user.Entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long>
{
    
}
