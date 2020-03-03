package com.example.carros;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users,Long>{

	Users findByLogin(String login);

}
