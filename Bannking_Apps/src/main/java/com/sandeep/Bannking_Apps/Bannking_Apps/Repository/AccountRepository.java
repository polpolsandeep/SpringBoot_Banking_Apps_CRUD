package com.sandeep.Bannking_Apps.Bannking_Apps.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sandeep.Bannking_Apps.Bannking_Apps.Entity.Account;
@Repository
public interface AccountRepository extends JpaRepository<Account,Long> {

}
