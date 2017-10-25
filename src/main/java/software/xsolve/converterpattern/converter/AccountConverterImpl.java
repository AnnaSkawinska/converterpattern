package software.xsolve.converterpattern.converter;

import software.xsolve.converterpattern.domain.Account;
import software.xsolve.converterpattern.dto.AccountDto;

public class AccountConverterImpl implements AccountConverter {

	@Override
	public Account createFrom(final AccountDto dto) {
		return updateEntity(new Account(), dto);
	}

	@Override
	public AccountDto createFrom(final Account entity) {
		return AccountDto.builder()
				.setAccountType(entity.getAccountType())
				.setActive(entity.getActive())
				.setEmail(entity.getEmail())
				.build();
	}

	@Override
	public Account updateEntity(final Account entity,
								final AccountDto dto) {
		return Account.builder()
				.from(entity)
				.setAccountType(dto.getAccountType())
				.setActive(dto.getActive())
				.setEmail(dto.getEmail())
				.setPassword(dto.getPassword())
				.build();
	}
}
