package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
    public void newAccountShouldHaveZeroBalance(){
        Account account = new Account();
        assertThat(account.getBalance()).isZero();
    }

    @Test
	 public void depositAnAmountToIncreaseTheBalance() {
        Account account = new Account();
        assertThat(account.depositAnAmountToIncreaseTheBalance(10)).isEqualTo(10);
    }
}
