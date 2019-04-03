package com.mx.prueba.repository;

import org.springframework.data.repository.CrudRepository;

import java.util.Set;

import com.mx.prueba.entities.User;

public interface UserRepository extends CrudRepository<User,Long>{

	Set<User> findByName(String name);
	Set<User> findByLastName(String lastName);
	Set<User> findByEmail(String email);
	Set<User> findByPhone(String phone);
	Set<User> findByAddress(String address);
}
