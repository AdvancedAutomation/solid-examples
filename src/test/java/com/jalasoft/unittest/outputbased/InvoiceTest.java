package com.jalasoft.unittest.outputbased;

import com.jalasoft.unittest.statebased.Invoice;
import com.jalasoft.unittest.statebased.Product;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InvoiceTest {

    private static final double DELTA = 0.001;

    @Test
    public void testCalculateTotalAmountWithoutProducts() {
        Invoice invoice = new Invoice();

        double actualTotalAmount = invoice.calculateTotalAmount();
        int actualTotalProducts = invoice.getProducts().size();

        final double expectedTotalAmount = 0;
        assertEquals(expectedTotalAmount, actualTotalAmount, DELTA);
        final int expectedTotalProducts = 0;
        assertEquals(expectedTotalProducts, actualTotalProducts);
    }

    @Test
    public void testCalculateTotalAmountWithProducts() {
        Invoice invoice = new Invoice();
        final double breadPrice = 1.0;
        invoice.addProduct(new Product("Bread", breadPrice));
        final double noodlesPrice = 5.0;
        invoice.addProduct(new Product("Noodles", noodlesPrice));
        final double milkBagPrice = 6.0;
        invoice.addProduct(new Product("Milk bag", milkBagPrice));

        double actualTotalAmount = invoice.calculateTotalAmount();
        int actualTotalProducts = invoice.getProducts().size();

        final double expectedTotalAmount = 12;
        assertEquals(expectedTotalAmount, actualTotalAmount, DELTA);
        final int expectedTotalProducts = 3;
        assertEquals(expectedTotalProducts, actualTotalProducts);
    }

}
