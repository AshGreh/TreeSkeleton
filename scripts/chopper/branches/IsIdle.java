package scripts.chopper.branches;

import api.tree.structures.abstracts.TreeBranch;
import os.api.queries.AdvancedBotContext;

public class IsIdle extends TreeBranch {

    private static final int NO_ANIMATION = -1;

    public IsIdle(AdvancedBotContext ctx) {
        super(ctx);
    }

    @Override
    public boolean valid() {
        return ctx.players.local().animation() == NO_ANIMATION;
    }

}
