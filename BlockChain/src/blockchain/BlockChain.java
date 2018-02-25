/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blockchain;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author ismailu
 */
public class BlockChain {

    /**
     * @param args the command line arguments
     */
    ArrayList<Block> BlockChain = new ArrayList<>();

    public static void main(String[] args) {
//        String[] list1 = {"a", "b", "c"};
//        String[] list2 = {"aa", "b", "b"};
//
//        System.err.println(Arrays.hashCode(list1));
//        System.err.println(Arrays.hashCode(list2));

        String[] GenisisTranstions = {"raju sent 10 bit coin to shakiLLl", "tq send 10 bit coin to shakil"};

        Block GenisisBlock = new Block(0, GenisisTranstions);
        System.err.println(GenisisBlock.getBlockHash());
        String[] Block2Transtion = {"raju sent 10 bit coin to shakil", "tq send 10 bit coin to shakil"};

        Block Block2 = new Block(GenisisBlock.getBlockHash(), Block2Transtion);
        System.err.println(Block2.getBlockHash());

    }

}
