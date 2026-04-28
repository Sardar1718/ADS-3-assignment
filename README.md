# ADS-3 Assignment: Sorting and Searching

##  Overview

This project implements and compares sorting and searching algorithms using Java.
The goal is to analyze their performance using execution time and Big-O complexity.



##  Algorithms

Insertion Sort (Basic)
Merge Sort (Advanced)
Binary Search (Searching)



## Description

**Insertion Sort**
Simple algorithm that inserts elements into the correct position.
Time: O(n²)

**Merge Sort**
Divide-and-conquer algorithm that splits and merges arrays.
Time: O(n log n)

**Binary Search**
Searches in a sorted array by dividing it in half.
Time: O(log n)



## Experiments

Tested on arrays:

* Small (10)
* Medium (100)
* Large (1000)

Used:

* Random arrays
* Sorted arrays
* `System.nanoTime()` for timing


## Results

* Merge Sort is faster on large arrays
* Insertion Sort is slow for big data
* Binary Search is very fast
* Insertion Sort works faster on sorted arrays

---

## Answers

**Which sorting is faster?**
→ Merge Sort (O(n log n))

**Effect of size?**
→ Bigger array = slower performance (especially O(n²))

**Sorted vs unsorted?**
→ Insertion Sort is faster on sorted arrays

**Why Binary Search needs sorted array?**
→ It divides the array in half

---

## Structure

```
src/
 ├── Sorter.java
 ├── Searcher.java
 ├── Experiment.java
 └── Main.java
```

## Run

Run `Main.java` in IntelliJ IDEA.



## Conclusion

Efficient algorithms like Merge Sort and Binary Search perform much better on large datasets.
