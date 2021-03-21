package com.jalasoft.examples.lsp.original;

/**
 * Defines a fixed term deposit account.
 */
public class FixedTermDepositAccount implements IAccount {

    /**
     * {@inheritDoc}
     */
    @Override
    public void deposit(final Double amount) {
        // Deposit to account.
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void withdraw(final Double amount) {
        throw new UnsupportedOperationException("Withdraw not supported for this account type.");
    }
}
