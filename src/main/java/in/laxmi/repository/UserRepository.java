package in.laxmi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.laxmi.entity.Users;

public interface UserRepository extends JpaRepository<Users, Integer>{

}
