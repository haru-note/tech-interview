package net.harunote.quiz.practice;

/**
 * @Author : CodeVillains
 * @Description : Given the root node of a binary tree, can you determine if it's also a binary search tree?
 * Complete the function in your editor below, which has  parameter: a pointer to the root of a binary tree.
 * It must return a boolean denoting whether or not the binary tree is a binary search tree.
 * You may have to write one or more helper functions to complete this challenge.
 *
 * link : https://www.hackerrank.com/challenges/ctci-is-binary-search-tree?h_r=next-challenge&h_v=zen
 */

class Node {
    int data;
    Node left;
    Node right;
}

public class CheckBinarySearchTree {

    boolean checkBST(Node root) {
        boolean leftResult = false;
        boolean rightResult = false;
        if (root.left != null) {
            leftResult = checkLeft(root);
        }

        if (root.right != null) {
            rightResult = checkRight(root);
        }

        return leftResult && rightResult;
    }

    boolean checkLeft(Node root) {
        if (root.data > root.left.data) {
            return true;
        } else {
            return false;
        }
    }


    boolean checkRight(Node root) {
        if (root.data < root.right.data) {
            return true;
        } else {
            return false;
        }
    }


}
