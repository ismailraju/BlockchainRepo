/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blockchain;

import java.util.Arrays;

/**
 *
 * @author ismailu
 */
public class Block {

    private int previousHash;
    private String[] transactions;

    private int BlockHash;

    public Block(int previousHash, String[] transactions) {
        this.previousHash = previousHash;
        this.transactions = transactions;

        Object[] content = {Arrays.hashCode(transactions), previousHash};
        this.BlockHash = Arrays.hashCode(content);
    }

    public int getPreviousHash() {
        return previousHash;
    }

    public String[] getTransactions() {
        return transactions;
    }

    public int getBlockHash() {
        return BlockHash;
    }

}
