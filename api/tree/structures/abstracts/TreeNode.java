package api.tree.structures.abstracts;

import api.tree.structures.contracts.Node;
import os.api.queries.AdvancedBotContext;

public abstract class TreeNode implements Node {

    protected AdvancedBotContext ctx;

    public TreeNode(AdvancedBotContext ctx) {
        this.ctx = ctx;
    }

    public abstract TreeNode getNextNode();

    public abstract boolean isLeaf();

}
