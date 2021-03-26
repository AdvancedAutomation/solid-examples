package com.jalasoft.solid.lsp.refactor;

/**
 * Defines a current account that supports withdraw action.
 */
public class CurrentAccount implements IWithDrawableAccount {

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
