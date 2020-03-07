package com.huzhengxing.tree.huffman_tree;

import com.huzhengxing.array.Array;

/**
 * @Auther: Albert
 * @Date: 2020/2/21 23:36
 * @Contact: 1092144169@qq.com
 * @Description: 霍夫曼树
 */
public class HuffmanTree {

    public Node root;


    public HuffmanTree(Node root) {
        this.root = root;
    }


    public HuffmanTree(int[] arrays) {
        toHuffmanTree(arrays);
    }

    /**
     * 将数组转成哈夫曼树
     *
     * @param arrays
     */
    public void toHuffmanTree(int[] arrays) {
        //数组从小到大排序成二叉树
        Node[] nodes = orderArrayToTree(arrays);
        this.root = toHuffmanTree(nodes);
    }

    /**
     * 递归生成新的树
     *
     * @param nodes
     * @return
     */
    public Node toHuffmanTree(Node[] nodes) {
        //获取最小2元素及之和组合成二叉树
        Node newNode;
        if (nodes.length == 0) return null;
        if (nodes.length > 1) {
            newNode = plusNode(nodes[0], nodes[1]);
            //最小元素之和添加到数组中重新排序
            Node[] newNodes = orderNodes(nodes, newNode);
            return toHuffmanTree(newNodes);
        } else {
            return nodes[0];
        }
    }

    /**
     * 剔除前2位，把新的元素插入进去
     *
     * @param nodes
     * @param newNode
     * @return
     */
    private Node[] orderNodes(Node[] nodes, Node newNode) {
        Node[] newNodes = new Node[nodes.length - 1];
        //标记插入元素的位置
        boolean flag = false;
        for (int i = 0; i < newNodes.length; i++) {
            if (!flag) {
                if (newNode.value < nodes[i+2].value) {
                    newNodes[i] = newNode;
                    flag = true;
                } else {
                    newNodes[i] = nodes[i + 2];
                }
            } else {
                newNodes[i] = nodes[i + 1];
            }
        }
        return newNodes;
    }

    /**
     * 两个节点相加，组成一颗新的树
     *
     * @param var
     * @param var1
     * @return
     */
    private Node plusNode(Node var, Node var1) {
        return new Node(var.value + var1.value, var, var1);
    }

    /**
     * 数据排序
     *
     * @param arrays
     */
    private Node[] orderArrayToTree(int[] arrays) {
        Node[] nodes = new Node[arrays.length];
        for (int i = 0; i < arrays.length; i++) {
            for (int j = i + 1; j < arrays.length; j++) {
                if (arrays[i] > arrays[j]) {
                    int tmp = arrays[i];
                    arrays[i] = arrays[j];
                    arrays[j] = tmp;
                }
            }
            nodes[i] = new Node(arrays[i]);
        }
        return nodes;
    }


    public static void main(String[] args) {
        HuffmanTree huffmanTree = new HuffmanTree(new int[]{1, 2, 3, 4, 5, 6});
        System.out.println(huffmanTree.root);
    }
}
