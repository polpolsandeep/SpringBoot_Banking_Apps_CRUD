package com.sandeep.Bannking_Apps.Bannking_Apps.Service.Impl;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.sandeep.Bannking_Apps.Bannking_Apps.Dto.AccountDto;
import com.sandeep.Bannking_Apps.Bannking_Apps.Entity.Account;
import com.sandeep.Bannking_Apps.Bannking_Apps.Mapper.AccountMapper;
import com.sandeep.Bannking_Apps.Bannking_Apps.Repository.AccountRepository;
import com.sandeep.Bannking_Apps.Bannking_Apps.Service.AccountService;

@Service
public class AccountServiceImpl implements AccountService{

	private AccountRepository accountRepository;
	
	public AccountServiceImpl(AccountRepository accountRepository) {
		super();
		this.accountRepository = accountRepository;
	}

	@Override
	public AccountDto createAccount(AccountDto accountDto) {
		Account account = AccountMapper.mapToAccount(accountDto);
		Account savedAccount=accountRepository.save(account);
		return AccountMapper.mapToAccountDto(savedAccount);
	}

	@Override
	public AccountDto getAccountById(Long id) {
		Account account=accountRepository.findById(id).orElseThrow(()-> new RuntimeException("Account does Exist..!!"));
		return AccountMapper.mapToAccountDto(account);
	}

	@Override
	public AccountDto deposit(Long id, double amount) {
		Account account=accountRepository.findById(id).orElseThrow(()-> new RuntimeException("Account does Exist..!!"));
		double totalBalance=account.getBalance()+amount;
		account.setBalance(totalBalance);
		Account savedAccount=accountRepository.save(account);
		return AccountMapper.mapToAccountDto(savedAccount);
	}

	@Override
	public AccountDto withdraw(Long id, double amount) {
		Account account=accountRepository.findById(id).orElseThrow(()-> new RuntimeException("Account does Exist..!!"));
		if(account.getBalance()< amount) {
			throw new RuntimeException("Insufficient Balance..!!");
		}
		double totalBalance=account.getBalance()-amount;
		account.setBalance(totalBalance);
		Account savedAccount=accountRepository.save(account);
		return AccountMapper.mapToAccountDto(savedAccount);
	}

	@Override
	public List<AccountDto> getAllAccounts() {
		return accountRepository.findAll().stream().map((account)->AccountMapper.
				mapToAccountDto(account)).collect(Collectors.toList());
	}

	@Override
	public void deleteAccount(Long id) {
		Account account=accountRepository.findById(id).orElseThrow(()-> new RuntimeException("Account does Exist..!!"));
		accountRepository.delete(account);
		
	}
}
