package com.jalasoft.solid.lsp.refactor;

/**
 * Defines a fixed term deposit account that don't supports withdraw action.
 */
public class FixedTermDepositAccount implements IAccount {

    /**
     * {@inheritDoc}
     */
    @Override
    public void deposit(final Double amount) {
        // Deposit to account.
    }
}
