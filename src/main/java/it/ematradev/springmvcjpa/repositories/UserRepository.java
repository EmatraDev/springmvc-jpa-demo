package it.ematradev.springmvcjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import it.ematradev.springmvcjpa.domain.User;
public interface UserRepository extends JpaRepository<User, Integer>
{
	
}
