package com.login.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.login.domain.LoginVoImpl;

@Repository
public interface LoginRepository extends JpaRepository<LoginVoImpl, Integer>{
	
	@Query(value="SELECT vo FROM LoginVoImpl vo WHERE vo.login = :user AND vo.senha = :senha")
	LoginVoImpl findUserLogin(@Param("user") String user, @Param("senha") String senha);
}
