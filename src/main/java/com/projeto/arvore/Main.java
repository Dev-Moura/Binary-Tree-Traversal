package com.projeto.arvore;

import javax.swing.JOptionPane;

class Node {
    int num;
    Node left, right;

    public Node(int num) {
        this.num = num;
        this.left = this.right = null;
    }
}

class BinaryTree {
    Node root;

    public void inOrder (Node node) {
        if (node != null)
        {
            inOrder(node.left);
            visit(node);
            inOrder(node.right);
        }
    }
    
    public void preOrder(Node node) {
        if (node != null)
        {
            visit(node);
            preOrder(node.left);
            preOrder(node.right);
        }
    }
    
    public void posOrder(Node node) {
        if (node != null) 
        {
            posOrder(node.left);
            posOrder(node.right);
            visit(node);
        }
    }

    public void visit(Node node) {
        System.out.println(node.num + " ");
    }
}
   





public class Main {
    public static int menu() {
        String msg = "";
    
        msg += "type 1 for in Order\n";
        msg += "type 2 for in PreOrder\n";
        msg += "type 1 for in PosOrder\n";
        msg += "Digite 0 ou 4 para sair do sistema\n";
    
        return Integer.parseInt(JOptionPane.showInputDialog(msg));
       
    }
    public static void main(String[] args) {
        BinaryTree node = new BinaryTree();
        node.root = new Node(10);
        node.root.left = new Node(5);
        node.root.right = new Node(15);

        int op;

        do {
            op = menu();
            
            switch (op) {
                case 1 :
                System.out.println("Scrolling in order:");
                node.inOrder(node.root);
                System.out.println();
                break;
                case 2 :
                System.out.println("Going through in pre order:");
                node.preOrder(node.root);
                System.out.println();
                break;
                case 3 :
                System.out.println("Going through in post order");
                node.posOrder(node.root);
                System.out.println();
                break;
                case 0:
                System.out.println("Encerrando o pragama...");
                break;
                default:
                    System.out.println("Opção inválida");
                }
        } while (op != 0);
        System.exit(0);
    }

}