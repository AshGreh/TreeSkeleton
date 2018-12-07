package scripts.chopper.leaves;

import api.tree.structures.abstracts.TreeLeaf;
import os.api.queries.AdvancedBotContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Chop extends TreeLeaf {

    private static final String TREE_INTERACTION = "Chop down";

    private List<String> treeNames;

    public Chop(AdvancedBotContext ctx) {
        super(ctx);
        treeNames = new ArrayList<>();
    }

    @Override
    public void run() {
        ctx.objects(5).name(treeNames.toArray(new String[0])).nearest().limit(3).nearest().poll().interact(TREE_INTERACTION);
    }

    public void addTreeNames(String... names) {
        treeNames.addAll(Arrays.asList(names));
    }

}
