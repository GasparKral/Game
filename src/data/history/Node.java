package data.history;

import models.enums.Biome;
import data.AdventureSt;

import java.util.HashSet;
import java.util.Optional;

public class Node {

    public boolean isRoot = false;
    public HashSet<Node> childs = new HashSet<Node>();
    public Node parent;
    public Integer depth = null;

    private Biome biome;
    private AdventureSt data = new AdventureSt();

    public Node(Biome biome) {
        this.biome = biome;
    }

    public Biome getBiome() {
        return biome;
    }

    public void setBiome(Biome biome) {
        this.biome = biome;
    }

    public boolean isRoot() {
        return isRoot;
    }

    public void setRoot(boolean isRoot) {
        this.isRoot = isRoot;
    }

    public AdventureSt getData() {
        return data;
    }

    public void setData(AdventureSt data) {
        this.data = data;
    }

    public Optional<Node> findNode(Node nodeToFind) {

        if (nodeToFind == null) {
            return Optional.empty();
        }

        if (this == nodeToFind) {
            return Optional.of(this);
        }

        Optional<Node> foundNode = Optional.empty();

        for (Node child : childs) {
            if (child != null) {
                foundNode = child.findNode(nodeToFind);
                if (foundNode.isPresent()) {
                    return foundNode;
                }
            }
        }

        return foundNode;
    }

    public void createNode(Node node) {

        if (node == null) {
            return;
        }

        childs.add(node);
        this.depth = this.depth + 1;
        node.parent = this;
    }

    public static Node createRoot(Biome biome, AdventureSt data) {

        Node root = new Node(biome);
        root.data = data;
        root.depth = 0;
        root.isRoot = true;
        return root;

    }

    public void addChild(Node node) {

        if (node == null) {
            return;
        }

        childs.add(node);
    }

    public Node returnToNode(int depth) {

        if (depth > 0) {
            return null;
        }

        if (depth == this.depth) {
            return this;
        } else {

            return parent.returnToNode(depth);
        }

    }

}
