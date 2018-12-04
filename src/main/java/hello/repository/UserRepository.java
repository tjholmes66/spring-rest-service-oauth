package hello.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hello.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>
{

    User findByLogin(String login);
}
