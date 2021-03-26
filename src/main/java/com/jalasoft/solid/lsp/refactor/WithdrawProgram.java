package com.jalasoft.solid.lsp.refactor;

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
        // Creates a list of accounts that supports withdraw actions.
        List<IWithDrawableAccount> accounts = new ArrayList<>();

        // According to the new abstraction a fixed term deposit account don't support with draw actions.
        // Therefore will be a compilation error if we try to add this type of account to the list.
        accounts.add(new SavingAccount());
//         accounts.add(new FixedTermDepositAccount());
        accounts.add(new CurrentAccount());

        // Loops over the accounts to perform a withdraw action.
        for (IWithDrawableAccount account : accounts) {
            account.withdraw(AMOUNT_TO_WITHDRAW);
        }
    }
}
