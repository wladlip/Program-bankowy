package pl.bankowosc;

import javax.swing.*;

public class AccountTest {

    public static void main(String[] args)
    {
        String input; //Przechowywanie danych wejściowych od użytkownika.

        // Pobieranie stanu początkowego konta.
        input = JOptionPane.showInputDialog(
                "Jaki jest początkowy stan Twojego konta?");

        // Tworzenie obietku typu BankAccount.
        BankAccount account = new BankAccount(input);

        // Pobieranie wysokości pensji.
        input = JOptionPane.showInputDialog(
                "Jakie wynagrodzenie otrzymałeś w tym miesiącu?");

        // Deponowanie wynagrodzenia użytkownika na koncie.
        account.deposit(input);

        // Wyświetlanie nowego stanu konta.
        JOptionPane.showMessageDialog(null,
                String.format("Twoje wynagrodzenie zostało zdeponowane. \n" +
                        "Obecny stan konta wynosi %,.2f złotych.",
                        account.getBalance()));

        // Wycofanie części pieniędzy z konta.
        input = JOptionPane.showInputDialog(
                "Jaką kwotę chcesz wypłacić?");
        account.withdraw(input);

        // Wyświetlanie nowego stanu konta.
        JOptionPane.showMessageDialog(null,
                String.format("Obecny stan konta wynosi %,.2f złotych.",
                                account.getBalance()));
        System.exit(0);
    }
}
