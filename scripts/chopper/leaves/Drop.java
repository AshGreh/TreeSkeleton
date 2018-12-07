package scripts.chopper.leaves;

import api.tree.structures.abstracts.TreeLeaf;
import os.api.queries.AdvancedBotContext;

public class Drop extends TreeLeaf {

    private static final String[] AXE_NAMES = { "Bronze Axe" };

    public Drop(AdvancedBotContext ctx) {
        super(ctx);
    }

    @Override
    public void run() {
        ctx.inventory.drop(ctx.inventory().not().name(AXE_NAMES));
    }

}
