package br.com.renanpollo.springbootcleanarch.application.gateways;

import br.com.renanpollo.springbootcleanarch.domain.entity.User;

public interface UserGateway {
    User createUser(User user);
}
