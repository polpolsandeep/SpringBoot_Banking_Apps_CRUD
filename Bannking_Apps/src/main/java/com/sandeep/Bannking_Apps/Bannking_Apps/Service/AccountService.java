package com.sandeep.Bannking_Apps.Bannking_Apps.Service;

import java.util.List;

import com.sandeep.Bannking_Apps.Bannking_Apps.Dto.AccountDto;

public interface AccountService {
	
	AccountDto createAccount(AccountDto accountDto);
	
	AccountDto getAccountById(Long Id);
	
	AccountDto deposit(Long id,double amount);
	
	AccountDto withdraw(Long id,double amount);
	
	List<AccountDto> getAllAccounts();
	
	void deleteAccount (Long id);

}
