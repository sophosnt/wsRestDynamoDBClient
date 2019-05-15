package com.sophos.poc.wsrestdynamodbclient.repositories;

import java.util.Optional;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import com.sophos.poc.wsrestdynamodbclient.dto.Account;

@EnableScan
public interface AccountRepository extends CrudRepository<Account, String> {     
	Optional<Account> findById(String id);
}