package com.bn.pds.repository;

import com.bn.pds.domain.User;

import org.joda.time.DateTime;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Spring Data MongoDB repository for the User entity.
 */
public interface UserRepository extends MongoRepository<User, String> {

    User findOneByActivationKey(String activationKey);

    List<User> findAllByActivatedIsFalseAndCreatedDateBefore(DateTime dateTime);

    User findOneByResetKey(String resetKey);

    User findOneByLogin(String login);

    User findOneByEmail(String email);

}
