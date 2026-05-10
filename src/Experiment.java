public class Experiment {

    public void runTraversals(Graph g) {

        System.out.println("BFS Traversal:");

        long startBfs = System.nanoTime();

        g.bfs(0);

        long endBfs = System.nanoTime();

        System.out.println("BFS Execution Time: "
                + (endBfs - startBfs) + " ns");

        System.out.println();

        System.out.println("DFS Traversal:");

        long startDfs = System.nanoTime();

        g.dfs(0);

        long endDfs = System.nanoTime();

        System.out.println("DFS Execution Time: "
                + (endDfs - startDfs) + " ns");

        System.out.println("-----------------------------------");
    }

    public void runMultipleTests() {

        int[] sizes = {10, 30, 100};

        for (int size : sizes) {

            System.out.println("\n===============================");
            System.out.println("GRAPH SIZE: " + size);
            System.out.println("===============================");

            Graph graph = new Graph();

            for (int i = 0; i < size; i++) {

                graph.addVertex(new Vertex(i));
            }

            for (int i = 0; i < size - 1; i++) {

                graph.addEdge(i, i + 1);

                if (i + 2 < size) {

                    graph.addEdge(i, i + 2);
                }
            }

            if (size == 10) {

                System.out.println("\nGraph Structure:");

                graph.printGraph();

                System.out.println();
            }

            runTraversals(graph);
        }
    }

    public void printResults() {

        System.out.println("\nAll experiments completed successfully.");
    }
}