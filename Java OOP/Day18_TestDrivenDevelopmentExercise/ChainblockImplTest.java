package Day18_TestDrivenDevelopmentExercise;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ChainblockImplTest {
    private static final int TRANSACTION_ID_1 = 1;
    private static final int TRANSACTION_ID_2 = 2;
    private static final int TRANSACTION_ID_3 = 3;
    private static final int TRANSACTION_ID_4 = 4;
    private static final int TRANSACTION_ID_5 = 5;
    private static final int TRANSACTION_INVALID_ID_100 = 100;
    private static final String TRANSACTION_SENDER_1 = "Cross Marian";
    private static final String TRANSACTION_SENDER_2 = "Froi Tiedoll";
    private static final String INVALID_TRANSACTION_SENDER = "Alan Walker";
    private static final String TRANSACTION_RECEIVER_1 = "Klaud Nine";
    private static final String TRANSACTION_RECEIVER_2 = "Winters Socalo";
    private static final String TRANSACTION_RECEIVER_3 = "Kevin Yeegar";
    private static final String INVALID_TRANSACTION_RECEIVER = "Neah Noah";
    private static final Double TRANSACTION_AMOUNT_1 = 450.50;
    private static final Double TRANSACTION_AMOUNT_2 = 350.50;
    private static final Double TRANSACTION_AMOUNT_3 = 250.50;
    private static final Double TRANSACTION_AMOUNT_4 = 150.50;
    private static final Double TRANSACTION_AMOUNT_5 = 50.50;
    private static final int TRANSACTION_COUNT_0 = 0;
    private static final int TRANSACTION_COUNT_1 = 1;
    private static final int TRANSACTION_COUNT_2 = 2;
    private static final int TRANSACTION_COUNT_3 = 3;
    private static final int TRANSACTION_COUNT_4 = 4;
    private static final Double TRANSACTION_AMOUNT_MAX = 250.50;
    private static final Double TRANSACTION_AMOUNT_MIN = 150.50;
    private static final Double TRANSACTION_AMOUNT_LO = TRANSACTION_AMOUNT_5;
    private static final Double TRANSACTION_AMOUNT_HI = TRANSACTION_AMOUNT_1;

    private static final Double TRANSACTION_AMOUNT_LO_INVALID = 10000.00;
    private static final Double TRANSACTION_AMOUNT_HI_INVALID = 20000.00;
    private static final Double TRANSACTION_AMOUNT_INVALID = 1150.50;

    private Chainblock database;
    private List<Transaction> transactions;

    @Before
    public void setup() {
        this.database = new ChainblockImpl();
        this.transactions = new ArrayList<>();
        prepareTransactionForTest();
    }

    private void prepareTransactionForTest() {
        Transaction transaction1 = new TransactionImpl(TRANSACTION_ID_1, TransactionStatus.SUCCESSFUL, TRANSACTION_SENDER_1, TRANSACTION_RECEIVER_1, TRANSACTION_AMOUNT_1);
        Transaction transaction2 = new TransactionImpl(TRANSACTION_ID_2, TransactionStatus.FAILED, TRANSACTION_SENDER_2, TRANSACTION_RECEIVER_2, TRANSACTION_AMOUNT_2);
        Transaction transaction3 = new TransactionImpl(TRANSACTION_ID_3, TransactionStatus.SUCCESSFUL, TRANSACTION_SENDER_1, TRANSACTION_RECEIVER_2, TRANSACTION_AMOUNT_3);
        Transaction transaction4 = new TransactionImpl(TRANSACTION_ID_4, TransactionStatus.SUCCESSFUL, TRANSACTION_SENDER_2, TRANSACTION_RECEIVER_3, TRANSACTION_AMOUNT_4);
        Transaction transaction5 = new TransactionImpl(TRANSACTION_ID_5, TransactionStatus.SUCCESSFUL, TRANSACTION_SENDER_2, TRANSACTION_RECEIVER_1, TRANSACTION_AMOUNT_5);
        this.transactions.add(transaction1);
        this.transactions.add(transaction2);
        this.transactions.add(transaction3);
        this.transactions.add(transaction4);
        this.transactions.add(transaction5);
    }

    @Test
    public void testAddCorrectTransaction() {
        Assert.assertEquals(TRANSACTION_COUNT_0, this.database.getCount());
        this.database.add(this.transactions.get(0));
        Assert.assertEquals(TRANSACTION_COUNT_1, this.database.getCount());
        this.database.add(this.transactions.get(1));
        Assert.assertEquals(TRANSACTION_COUNT_2, this.database.getCount());
    }

    @Test
    public void testAddExistingTransaction() {
        Transaction transaction50 = new TransactionImpl(TRANSACTION_ID_1, TransactionStatus.FAILED, TRANSACTION_SENDER_2, TRANSACTION_RECEIVER_2, TRANSACTION_AMOUNT_2);
        Assert.assertEquals(TRANSACTION_COUNT_0, this.database.getCount());
        this.database.add(this.transactions.get(0));
        Assert.assertEquals(TRANSACTION_COUNT_1, this.database.getCount());
        this.database.add(transaction50);
        Assert.assertEquals(TRANSACTION_COUNT_1, this.database.getCount());
    }

    @Test
    public void testContains() {
        Assert.assertFalse(this.database.contains(this.transactions.get(0)));
        Assert.assertFalse(this.database.contains(this.transactions.get(0).getId()));
        this.database.add(this.transactions.get(0));
        Assert.assertTrue(this.database.contains(this.transactions.get(0)));
        Assert.assertTrue(this.database.contains(this.transactions.get(0).getId()));
    }

    @Test
    public void testChangeTransactionStatus() {
        this.database.add(this.transactions.get(0));
        Assert.assertEquals(TRANSACTION_COUNT_1, this.database.getCount());
        this.database.changeTransactionStatus(TRANSACTION_ID_1, TransactionStatus.ABORTED);
        Assert.assertEquals(TransactionStatus.ABORTED, this.transactions.get(0).getStatus());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChangeTransactionStatusInvalidID() {
        this.database.add(this.transactions.get(0));
        Assert.assertEquals(TRANSACTION_COUNT_1, this.database.getCount());
        this.database.changeTransactionStatus(TRANSACTION_ID_2, TransactionStatus.ABORTED);
        Assert.assertEquals(TransactionStatus.ABORTED, this.transactions.get(0).getStatus());
    }

    @Test
    public void testRemoveTransactionById() {
        this.database.add(this.transactions.get(0));
        this.database.add(this.transactions.get(1));
        Assert.assertEquals(TRANSACTION_COUNT_2, this.database.getCount());
        this.database.removeTransactionById(this.transactions.get(0).getId());
        Assert.assertEquals(TRANSACTION_COUNT_1, this.database.getCount());
        Assert.assertFalse(this.database.contains(this.transactions.get(0).getId()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveTransactionByIThrowInvalidID() {
        this.database.add(this.transactions.get(0));
        this.database.add(this.transactions.get(1));
        Assert.assertEquals(TRANSACTION_COUNT_2, this.database.getCount());
        this.database.removeTransactionById(TRANSACTION_INVALID_ID_100);
    }

    @Test
    public void testGetById() {
        Transaction transaction = this.transactions.get(0);
        this.database.add(transaction);
        Transaction returnedTransaction = this.database.getById(transaction.getId());
        Assert.assertEquals(transaction.getId(), returnedTransaction.getId());
        Assert.assertEquals(transaction.getStatus(), returnedTransaction.getStatus());
        Assert.assertEquals(transaction.getFrom(), returnedTransaction.getFrom());
        Assert.assertEquals(transaction.getTo(), returnedTransaction.getTo());
        Assert.assertEquals(transaction.getAmount(), returnedTransaction.getAmount(), 0.00);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetByInvalidID() {
        this.database.add(this.transactions.get(0));
        this.database.getById(TRANSACTION_INVALID_ID_100);
    }

    @Test
    public void testGetByTransactionStatus() {
        List<Transaction> successfulTransaction = new ArrayList<>();
        for (Transaction transaction : this.transactions) {
            if (transaction.getStatus() == TransactionStatus.SUCCESSFUL) {
                successfulTransaction.add(transaction);
            }
        }
        this.database.add(this.transactions.get(0));
        this.database.add(this.transactions.get(1));
        this.database.add(this.transactions.get(2));
        this.database.add(this.transactions.get(3));
        this.database.add(this.transactions.get(4));
        Iterable<Transaction> byTransactionStatus = this.database.getByTransactionStatus(TransactionStatus.SUCCESSFUL);
        List<Transaction> transactionsFromChainBlock = new ArrayList<>();
        for (Transaction transactionStatus : byTransactionStatus) {
            transactionsFromChainBlock.add(transactionStatus);
        }
        Assert.assertEquals(successfulTransaction.size(), transactionsFromChainBlock.size());
        for (Transaction transaction : transactionsFromChainBlock) {
            Assert.assertEquals(transaction.getStatus(), TransactionStatus.SUCCESSFUL);
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetByTransactionInvalidStatus() {
        this.database.add(this.transactions.get(0));
        this.database.add(this.transactions.get(1));
        this.database.add(this.transactions.get(2));
        this.database.getByTransactionStatus(TransactionStatus.UNAUTHORIZED);
    }

    @Test
    public void testGetAllSendersWithTransactionStatus() {
        this.database.add(this.transactions.get(0));
        this.database.add(this.transactions.get(1));
        this.database.add(this.transactions.get(2));
        this.database.add(this.transactions.get(3));
        Iterable<String> byTransactionStatus = this.database.getAllSendersWithTransactionStatus(TransactionStatus.SUCCESSFUL);
        List<String> transactionsFromChainBlock = new ArrayList<>();
        for (String transactionStatus : byTransactionStatus) {
            transactionsFromChainBlock.add(transactionStatus);
        }
        Assert.assertEquals(TRANSACTION_COUNT_3, transactionsFromChainBlock.size());
        Assert.assertEquals(TRANSACTION_SENDER_1, transactionsFromChainBlock.get(0));
        Assert.assertEquals(TRANSACTION_SENDER_1, transactionsFromChainBlock.get(1));
        Assert.assertEquals(TRANSACTION_SENDER_2, transactionsFromChainBlock.get(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetAllSendersWithInvalidTransactionStatus() {
        this.database.add(this.transactions.get(0));
        this.database.add(this.transactions.get(1));
        this.database.add(this.transactions.get(2));
        this.database.add(this.transactions.get(3));
        this.database.getAllSendersWithTransactionStatus(TransactionStatus.ABORTED);
    }

    @Test
    public void testGetAllReceiversWithTransactionStatus() {
        this.database.add(this.transactions.get(0));
        this.database.add(this.transactions.get(1));
        this.database.add(this.transactions.get(2));
        this.database.add(this.transactions.get(3));
        this.database.add(this.transactions.get(4));
        Iterable<String> byTransactionStatus = this.database.getAllReceiversWithTransactionStatus(TransactionStatus.SUCCESSFUL);
        List<String> transactionsFromChainBlock = new ArrayList<>();
        for (String transactionStatus : byTransactionStatus) {
            transactionsFromChainBlock.add(transactionStatus);
        }
        Assert.assertEquals(TRANSACTION_COUNT_4, transactionsFromChainBlock.size());
        Assert.assertEquals(TRANSACTION_RECEIVER_1, transactionsFromChainBlock.get(0));
        Assert.assertEquals(TRANSACTION_RECEIVER_2, transactionsFromChainBlock.get(1));
        Assert.assertEquals(TRANSACTION_RECEIVER_3, transactionsFromChainBlock.get(2));
        Assert.assertEquals(TRANSACTION_RECEIVER_1, transactionsFromChainBlock.get(3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetAllReceiversWithInvalidTransactionStatus() {
        this.database.add(this.transactions.get(0));
        this.database.add(this.transactions.get(1));
        this.database.add(this.transactions.get(2));
        this.database.add(this.transactions.get(3));
        this.database.add(this.transactions.get(4));
        this.database.getAllReceiversWithTransactionStatus(TransactionStatus.ABORTED);
    }

    @Test
    public void testGetAllOrderedByAmountDescendingThenById() {
        this.database.add(this.transactions.get(0));
        this.database.add(this.transactions.get(1));
        this.database.add(this.transactions.get(2));
        this.database.add(this.transactions.get(3));
        this.database.add(this.transactions.get(4));
        Iterable<Transaction> allOrderedByAmountDescendingThenById = this.database.getAllOrderedByAmountDescendingThenById();
        List<Transaction> expected = this.transactions
                .stream()
                .sorted(Comparator.comparing(Transaction::getAmount).reversed()
                        .thenComparing(Transaction::getId)).collect(Collectors.toList());
        List<Transaction> returned = new ArrayList<>();
        for (Transaction transaction : allOrderedByAmountDescendingThenById) {
            returned.add(transaction);
        }
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void testGetBySenderOrderedByAmountDescending() {
        this.database.add(this.transactions.get(0));
        this.database.add(this.transactions.get(1));
        this.database.add(this.transactions.get(2));
        this.database.add(this.transactions.get(3));
        this.database.add(this.transactions.get(4));
        Iterable<Transaction> allBySenderOrderedByAmountDescending = this.database.getBySenderOrderedByAmountDescending(TRANSACTION_SENDER_1);
        List<Transaction> expected = this.transactions
                .stream()
                .filter(sender -> sender.getFrom().equals(TRANSACTION_SENDER_1))
                .sorted(Comparator.comparing(Transaction::getAmount).reversed()).collect(Collectors.toList());
        List<Transaction> returned = new ArrayList<>();
        for (Transaction transaction : allBySenderOrderedByAmountDescending) {
            returned.add(transaction);
        }
        Assert.assertEquals(expected, returned);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetByInvalidSenderOrderedByAmountDescending() {
        this.database.add(this.transactions.get(0));
        this.database.add(this.transactions.get(1));
        this.database.add(this.transactions.get(2));
        this.database.add(this.transactions.get(3));
        this.database.add(this.transactions.get(4));
        this.database.getBySenderOrderedByAmountDescending(INVALID_TRANSACTION_SENDER);
    }

    @Test
    public void testGetByReceiverOrderedByAmountThenById() {
        this.database.add(this.transactions.get(0));
        this.database.add(this.transactions.get(1));
        this.database.add(this.transactions.get(2));
        this.database.add(this.transactions.get(3));
        this.database.add(this.transactions.get(4));
        Iterable<Transaction> allByReceiverOrderedByAmountThenById = this.database.getByReceiverOrderedByAmountThenById(TRANSACTION_RECEIVER_1);
        List<Transaction> expected = this.transactions
                .stream()
                .filter(receiver -> receiver.getTo().equals(TRANSACTION_RECEIVER_1))
                .sorted(Comparator.comparing(Transaction::getAmount).reversed()
                        .thenComparing(Transaction::getId)).collect(Collectors.toList());
        List<Transaction> returned = new ArrayList<>();
        for (Transaction transaction : allByReceiverOrderedByAmountThenById) {
            returned.add(transaction);
        }
        Assert.assertEquals(expected, returned);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetByInvalidReceiverOrderedByAmountThenById() {
        this.database.add(this.transactions.get(0));
        this.database.add(this.transactions.get(1));
        this.database.add(this.transactions.get(2));
        this.database.add(this.transactions.get(3));
        this.database.add(this.transactions.get(4));
        this.database.getBySenderOrderedByAmountDescending(INVALID_TRANSACTION_RECEIVER);
    }

    @Test
    public void testGetByTransactionStatusAndMaximumAmount() {
        this.database.add(this.transactions.get(0));
        this.database.add(this.transactions.get(1));
        this.database.add(this.transactions.get(2));
        this.database.add(this.transactions.get(3));
        this.database.add(this.transactions.get(4));
        Iterable<Transaction> allByReceiverOrderedByAmountThenById = this.database.getByTransactionStatusAndMaximumAmount(TransactionStatus.SUCCESSFUL, TRANSACTION_AMOUNT_MAX);
        List<Transaction> expected = this.transactions
                .stream()
                .filter(transaction -> transaction.getStatus() == TransactionStatus.SUCCESSFUL)
                .filter(transaction -> transaction.getAmount() <= TRANSACTION_AMOUNT_MAX)
                .sorted(Comparator.comparing(Transaction::getAmount).reversed())
                .collect(Collectors.toList());
        List<Transaction> returned = new ArrayList<>();
        for (Transaction transaction : allByReceiverOrderedByAmountThenById) {
            returned.add(transaction);
        }
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void testGetByTransactionStatusAndMaximumAmountReturnEmptyList() {
        this.database.add(this.transactions.get(0));
        this.database.add(this.transactions.get(1));
        this.database.add(this.transactions.get(2));
        this.database.add(this.transactions.get(3));
        this.database.add(this.transactions.get(4));
        Iterable<Transaction> allByReceiverOrderedByAmountThenById = this.database.getByTransactionStatusAndMaximumAmount(TransactionStatus.ABORTED, TRANSACTION_AMOUNT_MAX);
        List<Transaction> expected = this.transactions
                .stream()
                .filter(transaction -> transaction.getStatus() == TransactionStatus.ABORTED && transaction.getAmount() <= TRANSACTION_AMOUNT_MAX)
                .sorted(Comparator.comparing(Transaction::getAmount).reversed())
                .collect(Collectors.toList());
        List<Transaction> returned = new ArrayList<>();
        for (Transaction transaction : allByReceiverOrderedByAmountThenById) {
            returned.add(transaction);
        }
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void testGetBySenderAndMinimumAmountDescending() {
        this.database.add(this.transactions.get(0));
        this.database.add(this.transactions.get(1));
        this.database.add(this.transactions.get(2));
        this.database.add(this.transactions.get(3));
        this.database.add(this.transactions.get(4));
        Iterable<Transaction> allBySenderAndMinimumAmountDescending = this.database.getBySenderAndMinimumAmountDescending(TRANSACTION_SENDER_1, TRANSACTION_AMOUNT_MIN);
        List<Transaction> expected = this.transactions
                .stream()
                .filter(transaction -> transaction.getFrom().equals(TRANSACTION_SENDER_1) && transaction.getAmount() > TRANSACTION_AMOUNT_MIN)
                .sorted(Comparator.comparing(Transaction::getAmount).reversed())
                .collect(Collectors.toList());
        List<Transaction> returned = new ArrayList<>();
        for (Transaction transaction : allBySenderAndMinimumAmountDescending) {
            returned.add(transaction);
        }
        Assert.assertEquals(expected, returned);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetBySenderAndMinimumAmountDescendingEmpty() {
        this.database.add(this.transactions.get(0));
        this.database.add(this.transactions.get(1));
        this.database.add(this.transactions.get(2));
        this.database.add(this.transactions.get(3));
        this.database.add(this.transactions.get(4));
        this.database.getBySenderAndMinimumAmountDescending(TRANSACTION_SENDER_1, TRANSACTION_AMOUNT_INVALID);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetByInvalidSenderAndMinimumAmountDescending() {
        this.database.add(this.transactions.get(0));
        this.database.add(this.transactions.get(1));
        this.database.add(this.transactions.get(2));
        this.database.add(this.transactions.get(3));
        this.database.add(this.transactions.get(4));
        this.database.getBySenderAndMinimumAmountDescending(INVALID_TRANSACTION_SENDER, TRANSACTION_AMOUNT_MIN);
    }


    @Test
    public void testGetByReceiverAndAmountRange() {
        this.database.add(this.transactions.get(0));
        this.database.add(this.transactions.get(1));
        this.database.add(this.transactions.get(2));
        this.database.add(this.transactions.get(3));
        this.database.add(this.transactions.get(4));
        Iterable<Transaction> allBySenderAndMinimumAmountDescending = this.database.getByReceiverAndAmountRange(TRANSACTION_RECEIVER_2, TRANSACTION_AMOUNT_LO, TRANSACTION_AMOUNT_HI);
        List<Transaction> expected = this.transactions
                .stream()
                .filter(transaction -> transaction.getTo().equals(TRANSACTION_RECEIVER_2) && transaction.getAmount() >= TRANSACTION_AMOUNT_LO && transaction.getAmount() < TRANSACTION_AMOUNT_HI)
                .sorted(Comparator.comparing(Transaction::getAmount).reversed())
                .collect(Collectors.toList());
        List<Transaction> returned = new ArrayList<>();
        for (Transaction transaction : allBySenderAndMinimumAmountDescending) {
            returned.add(transaction);
        }
        Assert.assertEquals(expected, returned);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetByInvalidReceiverAndAmountRange() {
        this.database.add(this.transactions.get(0));
        this.database.add(this.transactions.get(1));
        this.database.add(this.transactions.get(2));
        this.database.add(this.transactions.get(3));
        this.database.add(this.transactions.get(4));
        this.database.getByReceiverAndAmountRange(INVALID_TRANSACTION_RECEIVER, TRANSACTION_AMOUNT_LO, TRANSACTION_AMOUNT_HI);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetByReceiverAndAmountRangeEmpty() {
        this.database.add(this.transactions.get(0));
        this.database.add(this.transactions.get(1));
        this.database.add(this.transactions.get(2));
        this.database.add(this.transactions.get(3));
        this.database.add(this.transactions.get(4));
        this.database.getByReceiverAndAmountRange(INVALID_TRANSACTION_RECEIVER, TRANSACTION_AMOUNT_LO_INVALID, TRANSACTION_AMOUNT_HI_INVALID);
    }

    @Test
    public void testGetAllInAmountRange() {
        this.database.add(this.transactions.get(0));
        this.database.add(this.transactions.get(1));
        this.database.add(this.transactions.get(2));
        this.database.add(this.transactions.get(3));
        this.database.add(this.transactions.get(4));
        Iterable<Transaction> allBySenderAndMinimumAmountDescending = this.database.getAllInAmountRange(TRANSACTION_AMOUNT_LO, TRANSACTION_AMOUNT_HI);
        List<Transaction> expected = this.transactions
                .stream()
                .filter(transaction -> transaction.getAmount() >= TRANSACTION_AMOUNT_LO && transaction.getAmount() <= TRANSACTION_AMOUNT_HI)
                .collect(Collectors.toList());
        List<Transaction> returned = new ArrayList<>();
        for (Transaction transaction : allBySenderAndMinimumAmountDescending) {
            returned.add(transaction);
        }
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void testGetAllInAmountRangeEmpty() {
        this.database.add(this.transactions.get(0));
        this.database.add(this.transactions.get(1));
        this.database.add(this.transactions.get(2));
        this.database.add(this.transactions.get(3));
        this.database.add(this.transactions.get(4));
        Iterable<Transaction> allBySenderAndMinimumAmountDescending = this.database.getAllInAmountRange(TRANSACTION_AMOUNT_LO_INVALID, TRANSACTION_AMOUNT_HI_INVALID);
        List<Transaction> expected = this.transactions
                .stream()
                .filter(transaction -> transaction.getAmount() >= TRANSACTION_AMOUNT_LO_INVALID && transaction.getAmount() <= TRANSACTION_AMOUNT_HI_INVALID)
                .collect(Collectors.toList());
        List<Transaction> returned = new ArrayList<>();
        for (Transaction transaction : allBySenderAndMinimumAmountDescending) {
            returned.add(transaction);
        }
        Assert.assertEquals(expected, returned);
    }
}