package com.jalasoft.solid.lsp.refactor;

/**
 * Defines account base abstraction that supports deposit actions.
 */
public interface IAccount {

    /**
     * Deposits to account.
     *
     * @param amount deposit amount.
     */
    void deposit(Double amount);
}
