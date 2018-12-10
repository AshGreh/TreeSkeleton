package api.tree;

import api.tree.structures.abstracts.TreeNode;
import api.tree.structures.concrete.Ignored;
import org.powerbot.script.PollingScript;
import os.api.queries.AdvancedBotContext;

public class TreeScript extends PollingScript<AdvancedBotContext> {

    protected TreeNode rootNode;

    {
        rootNode = new Ignored(ctx);
    }

    @Override
    public final void poll() {
        TreeNode currentNode = rootNode;
        while (!currentNode.isLeaf()) {
            currentNode = currentNode.getNextNode();
        }
        currentNode.run();
    }

}
