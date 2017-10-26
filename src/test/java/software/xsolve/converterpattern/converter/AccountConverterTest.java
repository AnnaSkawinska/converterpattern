package software.xsolve.converterpattern.converter;

import org.junit.Assert;
import org.junit.Test;

import software.xsolve.converterpattern.domain.Account;
import software.xsolve.converterpattern.dto.AccountDto;

public class AccountConverterTest {

	protected AccountConverter accountConverter = new AccountConverterImpl();

	@Test
	public void entityToDto() {
		Account account = Account.builder()
				.setAccountType("user")
				.setActive(true)
				.setEmail("anna.skawinska@xsolve.software")
				.setPassword("secret")
				.build();

		AccountDto accountDto = accountConverter.createFrom(account);

		Assert.assertEquals("user", accountDto.getAccountType());
		Assert.assertTrue(accountDto.getActive());
		Assert.assertEquals("anna.skawinska@xsolve.software", accountDto.getEmail());
		Assert.assertNull(accountDto.getPassword());
	}

	@Test
	public void dtoToEntity() {
		AccountDto accountDto = AccountDto.builder()
				.setActive(false)
				.setEmail("michal.witkowski@xsolve.software")
				.setAccountType("admin")
				.setPassword("tiger")
				.build();

		Account account = accountConverter.createFrom(accountDto);

		Assert.assertFalse(account.getActive());
		Assert.assertEquals("michal.witkowski@xsolve.software", account.getEmail());
		Assert.assertEquals("admin", account.getAccountType());
		Assert.assertEquals("tiger", account.getPassword());
	}

}
