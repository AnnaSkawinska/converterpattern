package software.xsolve.converterpattern.domain;

public class Account extends BaseEntity {
	protected String accountType;
	protected Boolean active;
	protected String email;
	protected String password;

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

	public static Builder builder() {
		return new Builder();
	}

	public static final class Builder {
		protected String accountType;
		protected Boolean active;
		protected String email;
		protected String password;

		public Builder from(Account account) {
			this.accountType = account.accountType;
			this.active = account.active;
			this.email = account.email;
			this.password = account.password;
			return this;
		}

		public Builder setAccountType(String accountType) {
			this.accountType = accountType;
			return this;
		}

		public Builder setActive(Boolean active) {
			this.active = active;
			return this;
		}

		public Builder setEmail(String email) {
			this.email = email;
			return this;
		}

		public Builder setPassword(String password) {
			this.password = password;
			return this;
		}

		public Account build() {
			Account account = new Account();
			account.active = this.active;
			account.email = this.email;
			account.password = this.password;
			account.accountType = this.accountType;
			return account;
		}
	}
}
