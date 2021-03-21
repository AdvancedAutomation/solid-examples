package com.jalasoft.examples.lsp.original;

/**
 * Defines a current account.
 */
public class CurrentAccount implements IAccount {

    /**
     * {@inheritDoc}
     */
    @Override
    public void deposit(final Double amount) {
        // Deposit amount to account.
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void withdraw(final Double amount) {
        // Withdraw amount to account.
    }
}
