package br.com.renanpollo.springbootcleanarch.main;

import br.com.renanpollo.springbootcleanarch.application.gateways.UserGateway;
import br.com.renanpollo.springbootcleanarch.application.usecases.CreateUserInteractor;
import br.com.renanpollo.springbootcleanarch.infrastructure.controllers.UserDTOMapper;
import br.com.renanpollo.springbootcleanarch.infrastructure.gateways.UserEntityMapper;
import br.com.renanpollo.springbootcleanarch.infrastructure.gateways.UserRepositoryGateway;
import br.com.renanpollo.springbootcleanarch.infrastructure.persistence.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {
    @Bean
    CreateUserInteractor createUserCase(UserGateway userGateway) {
        return new CreateUserInteractor(userGateway);
    }

    @Bean
    UserGateway userGateway(UserRepository userRepository, UserEntityMapper userEntityMapper) {
        return new UserRepositoryGateway(userRepository, userEntityMapper);
    }

    @Bean
    UserEntityMapper userEntityMapper() {
        return new UserEntityMapper();
    }

    @Bean
    UserDTOMapper userDTOMapper() {
        return new UserDTOMapper();
    }
}
