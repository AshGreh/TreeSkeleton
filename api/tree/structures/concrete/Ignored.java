package api.tree.structures.concrete;

import api.tree.structures.abstracts.TreeLeaf;
import os.api.queries.AdvancedBotContext;

public class Ignored extends TreeLeaf {


    public Ignored(AdvancedBotContext ctx) {
        super(ctx);
    }

    @Override
    public void run() {

    }
}
