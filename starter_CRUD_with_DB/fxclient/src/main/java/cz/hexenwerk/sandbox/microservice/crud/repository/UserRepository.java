package cz.hexenwerk.sandbox.microservice.crud.repository;

import cz.hexenwerk.sandbox.microservice.crud.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>
{

    User findByEmail(String email);
}
