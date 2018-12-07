package scripts.chopper.branches;

import api.tree.structures.abstracts.TreeBranch;
import os.api.queries.AdvancedBotContext;

public class IsInventoryFull extends TreeBranch {

    public IsInventoryFull(AdvancedBotContext ctx) {
        super(ctx);
    }

    @Override
    public boolean valid() {
        return ctx.inventory.isFull();
    }

}
