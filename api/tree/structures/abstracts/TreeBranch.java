package api.tree.structures.abstracts;

import os.api.queries.AdvancedBotContext;

public abstract class TreeBranch extends TreeNode {

    private TreeNode leftNode, rightNode;

    public TreeBranch(AdvancedBotContext ctx) {
        super(ctx);
    }

    @Override
    public final boolean isLeaf() {
        return false;
    }

    public TreeBranch setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
        return this;
    }

    public TreeBranch setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
        return this;
    }

    @Override
    public TreeNode getNextNode() {
        if(valid()) {
            return rightNode;
        }
        return leftNode;
    }

    @Override
    public final void run() {

    }

}
