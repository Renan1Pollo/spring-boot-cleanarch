package br.com.renanpollo.springbootcleanarch.repository;

import br.com.renanpollo.springbootcleanarch.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}
