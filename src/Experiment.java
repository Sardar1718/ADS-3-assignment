public class Experiment {

    private Sorter sorter;
    private Searcher searcher;

    public Experiment(Sorter sorter, Searcher searcher) {
        this.sorter = sorter;
        this.searcher = searcher;
    }

    public long measureSortTime(int[] arr, String type) {
        int[] copy = arr.clone();

        long start = System.nanoTime();

        if (type.equals("basic")) {
            sorter.basicSort(copy);
        } else {
            sorter.advancedSort(copy);
        }

        long end = System.nanoTime();
        return end - start;
    }

    public long measureSearchTime(int[] arr, int target) {
        long start = System.nanoTime();

        searcher.search(arr, target);

        long end = System.nanoTime();
        return end - start;
    }

    public void runAllExperiments() {
        int[] sizes = {10, 100, 1000};

        for (int size : sizes) {
            System.out.println("\nArray size:" + size);

            int[] randomArray = sorter.generateRandomArray(size);
            int[] sortedArray = randomArray.clone();
            sorter.advancedSort(sortedArray);

            long basicTime = measureSortTime(randomArray, "basic");
            long advancedTime = measureSortTime(randomArray, "advanced");

            long searchTime = measureSearchTime(sortedArray, sortedArray[size / 2]);

            System.out.println("Insertion Sort time:" + basicTime);
            System.out.println("Merge Sort time:" + advancedTime);
            System.out.println("Binary Search time:" + searchTime);
        }
    }
}