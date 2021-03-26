package com.jalasoft.solid.lsp.original;

/**
 * Defines account base abstraction that supports deposit and withdraw actions.
 */
public interface IAccount {

    /**
     * Deposits to account.
     *
     * @param amount deposit amount.
     */
    void deposit(Double amount);

    /**
     * Deposits to account.
     *
     * @param amount deposit amount.
     */
    void withdraw(Double amount);
}
