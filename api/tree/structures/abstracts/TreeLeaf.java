package api.tree.structures.abstracts;

import os.api.queries.AdvancedBotContext;

public abstract class TreeLeaf extends TreeNode {

    public TreeLeaf(AdvancedBotContext ctx) {
        super(ctx);
    }

    @Override
    public final TreeNode getNextNode() {
        return null;
    }

    @Override
    public final boolean isLeaf() {
        return true;
    }

    @Override
    public final boolean valid() {
        return false;
    }

}
