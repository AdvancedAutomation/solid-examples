package com.jalasoft.solid.lsp.refactor;

/**
 * Defines account base abstraction that supports deposit and withdraw actions.
 */
public interface IWithDrawableAccount extends IAccount {

    /**
     * Deposits to account.
     *
     * @param amount deposit amount.
     */
    void withdraw(Double amount);
}
