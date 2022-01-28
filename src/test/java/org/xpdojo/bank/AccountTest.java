package org.xpdojo.bank;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
    public void initialAccount_shouldHaveZeroBalance() {
        Account account = new Account(0);
        assertThat(account.balance).isEqualTo(0);
    }

    @Test
    public void depositAmountShouldIcreaseBalancebySomeAmount(){
        Account account= new Account(0);
        account.deposit(10);
        assertThat(account.getBalance()).isEqualTo(10);
    }

    @Test
    public void depositMultipleAmounts(){
        Account account= new Account(0);
        account.deposit(10);
        account.deposit(20);
        assertThat(account.getBalance()).isEqualTo(30);
    }

}
