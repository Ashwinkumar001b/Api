package com.example.Test1.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.Test1.Entity.UserEntity;
@Repository
public interface Repo extends JpaRepository<UserEntity,Integer> {

	 
}
