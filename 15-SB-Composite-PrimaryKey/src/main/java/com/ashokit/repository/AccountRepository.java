package com.ashokit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.entity.Account;
import com.ashokit.entity.AccountPK;

public interface AccountRepository extends JpaRepository<Account,AccountPK>{

}
