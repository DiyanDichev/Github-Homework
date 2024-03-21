package Day17_TestDrivenDevelopment;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

public class InstockTest {
    private static final String LABEL_1 = "Water";
    private static final double PRICE_1 = 1.20;
    private static final int QUANTITY_1 = 2;
    private static final String LABEL_2 = "Bread";
    private static final double PRICE_2 = 1.90;
    private static final int QUANTITY_2 = 3;
    private static final int CHANGE_QUANTITY_2 = 9;
    private static final String LABEL_3 = "Cheese";
    private static final double PRICE_3 = 3.40;
    private static final int QUANTITY_3 = 5;
    private static final String INVALID_LABEL = "Wine";
    private static final double INVALID_LABEL_PRICE = 13.40;
    private static final int INVALID_LABEL_QUANTITY = 8;
    private static final int COUNT_0 = 0;
    private static final int COUNT_1 = 1;
    private static final int COUNT_3 = 3;
    private static final int CORRECT_INDEX = 2;
    private static final int INVALID_INDEX = 3;
    private static final int NEGATIVE_INDEX = -1;
    private static final int TAKE_INDEX = 1;
    private static final int RETURN_ELEMENTS = 3;
    private static final int RETURN_INVALID_ELEMENTS = 5;
    private static final double PRICE_INVALID_LO = 1.90;
    private static final double PRICE_INVALID_HI = 1.90;
    private ProductStock productStock;

    @Before
    public void setup() {
        this.productStock = new Instock();
    }

    @Test
    public void testContainsAndAdd() {
        Product product = new Product(LABEL_1, PRICE_1, QUANTITY_1);
        Assert.assertFalse(this.productStock.contains(product));
        this.productStock.add(product);
        Assert.assertTrue(this.productStock.contains(product));
    }

    @Test
    public void testGetCount() {
        Assert.assertEquals(this.productStock.getCount(), COUNT_0);
        fillStock();
        Assert.assertEquals(this.productStock.getCount(), COUNT_3);
    }

    @Test
    public void testFindReturnCorrectProduct() {
        fillStock();
        Product foundProduct = this.productStock.find(CORRECT_INDEX);
        Assert.assertEquals(foundProduct.getLabel(), LABEL_3);
        Assert.assertEquals(foundProduct.getQuantity(), QUANTITY_3);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testFindThrowExceptionIndexGreater() {
        fillStock();
        this.productStock.find(INVALID_INDEX);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testFindThrowExceptionIndexNegative() {
        fillStock();
        this.productStock.find(NEGATIVE_INDEX);
    }

    @Test
    public void testChangeQuantitySuccessfulUpdate() {
        fillStock();
        Product changedProduct = this.productStock.find(TAKE_INDEX);
        this.productStock.changeQuantity(LABEL_2, CHANGE_QUANTITY_2);
        Assert.assertEquals(changedProduct.getQuantity(), CHANGE_QUANTITY_2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChangeQuantityInvalidProduct() {
        fillStock();
        this.productStock.changeQuantity(INVALID_LABEL, INVALID_LABEL_QUANTITY);
    }

    @Test
    public void testFindByLabelReturnCorrectProduct() {
        fillStock();
        Product foundProduct = this.productStock.findByLabel(LABEL_1);
        Assert.assertEquals(foundProduct.getLabel(), LABEL_1);
        Assert.assertEquals(foundProduct.getQuantity(), QUANTITY_1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindByLabelThrowExceptionInvalidProduct() {
        fillStock();
        this.productStock.findByLabel(INVALID_LABEL);
    }

    @Test
    public void testFindFirstByAlphabeticalOrderReturnCorrectProducts() {
        fillStock();
        Iterable<Product> iterable = this.productStock.findFirstByAlphabeticalOrder(RETURN_ELEMENTS);
        int count = 0;
        for (Product product : iterable) {
            count++;
        }
        Assert.assertEquals(count, RETURN_ELEMENTS);
    }

    @Test
    public void testFindFirstByAlphabeticalOrderReturnCorrectSorted() {
        fillStock();
        List<String> expectedProducts = new ArrayList<>();
        expectedProducts.add(LABEL_1);
        expectedProducts.add(LABEL_2);
        expectedProducts.add(LABEL_3);
        expectedProducts = expectedProducts.stream().sorted().collect(Collectors.toList());
        Iterable<Product> iterable = this.productStock.findFirstByAlphabeticalOrder(RETURN_ELEMENTS);
        List<String> returnedProducts = new ArrayList<>();
        for (Product product : iterable) {
            returnedProducts.add(product.getLabel());
        }
        Assert.assertEquals(expectedProducts, returnedProducts);
    }

    @Test
    public void testFindFirstByAlphabeticalOrderThrowInvalidCount() {
        fillStock();
        Iterable<Product> iterable = this.productStock.findFirstByAlphabeticalOrder(RETURN_INVALID_ELEMENTS);
        List<Product> returnedProducts = new ArrayList<>();
        for (Product product : iterable) {
            returnedProducts.add(product);
        }
        Assert.assertTrue(returnedProducts.isEmpty());
    }

    @Test
    public void testFindAllInRangeReturnTheCorrectRange() {
        fillStock();
        Iterable<Product> iterable = this.productStock.findAllInRange(PRICE_1, PRICE_3);
        List<Product> listByPrice = new ArrayList<>();
        for (Product product : iterable) {
            listByPrice.add(product);
        }
        Collections.reverse(listByPrice);
        List<Double> listByPriceDouble = listByPrice.stream().map(Product::getPrice).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        List<Product> products = new ArrayList<>();
        for (Product product : this.productStock) {
            if (product.getPrice() > PRICE_1 && product.getPrice() <= PRICE_3) {
                products.add(product);
            }
        }
        List<Double> listByproducts = products.stream().map(Product::getPrice).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        Assert.assertEquals(listByproducts.get(0), PRICE_3, 0.00);
    }

    @Test
    public void testFindAllInRangeReturnTheCorrectRangeAndInCorrectOrder() {
        fillStock();
        Iterable<Product> iterable = this.productStock.findAllInRange(PRICE_1, PRICE_3);
        List<Product> listByPrice = new ArrayList<>();
        for (Product product : iterable) {
            listByPrice.add(product);
        }
        Collections.reverse(listByPrice);
        List<Double> listByPriceDouble = listByPrice.stream().map(Product::getPrice).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        List<Product> products = new ArrayList<>();
        for (Product product : this.productStock) {
            if (product.getPrice() > PRICE_1 && product.getPrice() <= PRICE_3) {
                products.add(product);
            }
        }
        List<Double> listByproducts = products.stream().map(Product::getPrice).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        Assert.assertEquals(listByPriceDouble, listByproducts);
    }

    @Test
    public void testFindAllInRangeShouldEmptyCollection() {
        fillStock();
        Iterable<Product> iterable = this.productStock.findAllInRange(PRICE_INVALID_LO, PRICE_INVALID_HI);
        List<Product> listByPrice = new ArrayList<>();
        for (Product product : iterable) {
            listByPrice.add(product);
        }
        List<Double> listByPriceDouble = listByPrice.stream().map(Product::getPrice).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        Assert.assertTrue(listByPriceDouble.isEmpty());
    }

    @Test
    public void testFindAllByPriceReturnTheCorrectProducts() {
        fillStock();
        Iterable<Product> iterable = this.productStock.findAllByPrice(PRICE_1);
        List<Product> listByPrice = new ArrayList<>();
        for (Product product : iterable) {
            listByPrice.add(product);
        }
        List<Double> listByPriceDouble = listByPrice.stream().map(Product::getPrice).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        Assert.assertEquals(COUNT_1, listByPriceDouble.size());
        Assert.assertEquals(PRICE_1, listByPriceDouble.get(0), 0.00);
    }

    @Test
    public void testFindAllByPriceReturnEmpty() {
        fillStock();
        List<Product> productList = new ArrayList<>();
        Iterable<Product> iterable = this.productStock.findAllByPrice(INVALID_LABEL_PRICE);
        List<Product> listByPrice = new ArrayList<>();
        for (Product product : iterable) {
            listByPrice.add(product);
        }
        List<Double> listByPriceDouble = listByPrice.stream().map(Product::getPrice).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        Assert.assertTrue(listByPriceDouble.isEmpty());
    }

    @Test
    public void testFindFirstMostExpensiveProductsReturnMostExpensive() {
        fillStock();
        List<Product> productList = new ArrayList<>();
        for (Product product : this.productStock) {
            productList.add(product);
        }
        List<Double> productDouble = productList.stream().map(Product::getPrice).sorted(Comparator.reverseOrder()).limit(COUNT_3).collect(Collectors.toList());
        double previous = Double.MAX_VALUE;
        for (double value : productDouble) {
            Assert.assertTrue(previous > value);
            previous = value;
        }
        Iterable<Product> iterable = this.productStock.findFirstMostExpensiveProducts(COUNT_3);
        List<Product> listByPrice = new ArrayList<>();
        for (Product product : iterable) {
            listByPrice.add(product);
        }
        List<Double> listByPriceDouble = listByPrice.stream().map(Product::getPrice).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        Assert.assertEquals(productDouble, listByPriceDouble);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindFirstMostExpensiveProductsFailWhenLessProductsAreInStock() {
        fillStock();
        List<Product> productList = new ArrayList<>();
        for (Product product : this.productStock) {
            productList.add(product);
        }
        this.productStock.findFirstMostExpensiveProducts(productList.size() + 1);
    }

    @Test
    public void testFindAllByQuantityReturnAllProductsWithTheSameQuantity() {
        fillStock();
        int expected = QUANTITY_1;
        Iterable<Product> iterable = this.productStock.findAllByQuantity(expected);
        List<Product> sameByQuantity = new ArrayList<>();
        for (Product product : iterable) {
            if (product.getQuantity() == expected) {
                sameByQuantity.add(product);
            }
        }
        for (Product product : sameByQuantity) {
            Assert.assertEquals(product.getQuantity(), expected);
        }
    }

    @Test
    public void testFindAllByQuantityReturnEmptyCollection() {
        fillStock();
        int expected = INVALID_LABEL_QUANTITY;
        Iterable<Product> iterable = this.productStock.findAllByQuantity(expected);
        List<Product> sameByQuantity = new ArrayList<>();
        for (Product product : iterable) {
            if (product.getQuantity() == expected) {
                sameByQuantity.add(product);
            }
        }
        for (Product product : sameByQuantity) {
            Assert.assertEquals(product.getQuantity(), expected);
        }
        Assert.assertTrue(sameByQuantity.isEmpty());
    }


    @Test
    public void testIteratorShouldReturnAllProducts() {
        fillStock();
        List<Product> expectedProductsByStock = new ArrayList<>();
        for (Product product : this.productStock) {
            expectedProductsByStock.add(product);
        }
        Iterator<Product> iterator = this.productStock.iterator();
        Assert.assertNotNull(iterator);
        List<Product> expectedProductsByIterator = new ArrayList<>();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            expectedProductsByIterator.add(product);
        }
        Assert.assertEquals(expectedProductsByStock, expectedProductsByIterator);

    }

    private void fillStock() {
        Product product1 = new Product(LABEL_1, PRICE_1, QUANTITY_1);
        Product product2 = new Product(LABEL_2, PRICE_2, QUANTITY_2);
        Product product3 = new Product(LABEL_3, PRICE_3, QUANTITY_3);
        this.productStock.add(product1);
        this.productStock.add(product2);
        this.productStock.add(product3);
    }
}