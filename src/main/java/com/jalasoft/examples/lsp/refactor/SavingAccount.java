package com.jalasoft.examples.lsp.refactor;

/**
 * Defines a saving account that supports withdraw action.
 */
public class SavingAccount implements IWithDrawableAccount {

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
