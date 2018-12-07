package scripts.chopper;

import api.tree.TreeScript;
import api.tree.structures.abstracts.TreeBranch;
import api.tree.structures.abstracts.TreeNode;
import scripts.chopper.branches.IsIdle;
import scripts.chopper.branches.IsInventoryFull;
import scripts.chopper.leaves.Chop;
import scripts.chopper.leaves.Drop;
import api.tree.structures.concrete.Ignored;

public class SimpleChopperTE extends TreeScript {

    @Override
    public void start() {
        TreeBranch isIdle = new IsIdle(ctx), isInventoryFull = new IsInventoryFull(ctx);
        TreeNode chop = new Chop(ctx), drop = new Drop(ctx), ignored = new Ignored(ctx);
        isInventoryFull.setRightNode(drop).setLeftNode(ignored);
        isIdle.setRightNode(chop).setLeftNode(isInventoryFull);
    }

    @Override
    public void poll() {

    }

}
