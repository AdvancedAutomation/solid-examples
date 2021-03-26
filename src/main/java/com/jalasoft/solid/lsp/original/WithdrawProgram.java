package com.jalasoft.solid.lsp.original;

import java.util.ArrayList;
import java.util.List;

/**
 * Defines example program for withdraw actions.
 */
public final class WithdrawProgram {

    private static final double AMOUNT_TO_WITHDRAW = 100.0;

    /**
     * Private constructor for example program.
     */
    private WithdrawProgram() {
        // Default constructor.
    }

    /**
     * Program entry point.
     *
     * @param args program arguments.
     */
    public static void main(final String[] args) {
        // Creates a list of accounts.
        List<IAccount> accounts = new ArrayList<>();

        // Since fixed term deposit account does not support withdraw actions, the current implementation  is
        // breaking the LSP, it's necessary to re-design the abstraction classes.
        accounts.add(new SavingAccount());
        accounts.add(new FixedTermDepositAccount());
        accounts.add(new CurrentAccount());

        // Loops over the accounts to perform a withdraw action.
        for (IAccount account : accounts) {
            account.withdraw(AMOUNT_TO_WITHDRAW);
        }
    }
}
