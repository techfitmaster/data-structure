package com.huzhengxing.tree.binary_tree;

/**
 * @Auther: Albert
 * @Date: 2020/2/20 15:43
 * @Contact: 1092144169@qq.com
 * @Description: 树的节点
 */
public class TreeNode {

    private int value;

    private TreeNode leftNode;

    private TreeNode rightNode;

    /**
     * 标记左右指针的类型区分是子节点或前驱节点/后级节点，默认0，代表子节点的位置
     */
    private int leftFlag;
    private int rightFlag;

    public TreeNode(int value) {
        this.value = value;
    }

    public TreeNode(int value, TreeNode leftNode, TreeNode rightNode) {
        this.value = value;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }


    public int getLeftFlag() {
        return leftFlag;
    }

    public void setLeftFlag(int leftFlag) {
        this.leftFlag = leftFlag;
    }

    public int getRightFlag() {
        return rightFlag;
    }

    public void setRightFlag(int rightFlag) {
        this.rightFlag = rightFlag;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
