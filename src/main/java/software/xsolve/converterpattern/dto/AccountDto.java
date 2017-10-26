package software.xsolve.converterpattern.dto;

public class AccountDto extends AbstractDto {
	protected String accountType;
	protected String email;
	protected String password;
	protected Boolean active;

	public String getAccountType() {
		return accountType;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}


	public static AccountDtoBuilder builder() {
		return new AccountDtoBuilder();
	}

	public static final class AccountDtoBuilder {
		protected String accountType;
		protected String email;
		protected String password;
		protected Boolean active;

		private AccountDtoBuilder() {
		}

		public AccountDtoBuilder from(AccountDto accountDto) {
			this.accountType = accountDto.accountType;
			this.email = accountDto.email;
			this.password = accountDto.password;
			this.active = accountDto.active;
			return this;
		}

		public AccountDtoBuilder setAccountType(String accountType) {
			this.accountType = accountType;
			return this;
		}

		public AccountDtoBuilder setEmail(String email) {
			this.email = email;
			return this;
		}

		public AccountDtoBuilder setPassword(String password) {
			this.password = password;
			return this;
		}

		public AccountDtoBuilder setActive(Boolean active) {
			this.active = active;
			return this;
		}

		public AccountDto build() {
			AccountDto accountDto = new AccountDto();
			accountDto.setActive(active);
			accountDto.email = this.email;
			accountDto.accountType = this.accountType;
			accountDto.password = this.password;
			return accountDto;
		}
	}
}
