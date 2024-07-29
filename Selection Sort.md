# Selection Sort

## Overview

Selection Sort is a straightforward and intuitive sorting algorithm that sorts an array by repeatedly finding the minimum (or maximum) element from the unsorted portion and moving it to the beginning (or end) of the sorted portion. It is known for its simplicity but is less efficient compared to more advanced algorithms for large datasets.

## How It Works

1. **Start at the Beginning:** Begin with the first element of the array.
2. **Find the Minimum (or Maximum):** Search through the unsorted portion of the array to find the smallest (or largest) element.
3. **Swap:** Swap this smallest (or largest) element with the first element of the unsorted portion.
4. **Move the Boundary:** Move the boundary of the sorted portion one element to the right.
5. **Repeat:** Continue the process for the remaining unsorted portion until the entire array is sorted.

## Characteristics

- **Simplicity:** Selection Sort is easy to understand and implement, making it useful for educational purposes.
- **Performance:** It has a time complexity of O(n²) in the worst, average, and best cases. This means it is inefficient for large datasets compared to algorithms with better average-case performance.
- **Stability:** Selection Sort is not a stable sort, meaning that it may not preserve the relative order of equal elements.

## Use Cases

- **Educational Purposes:** Ideal for teaching basic sorting principles and algorithm design.
- **Small Datasets:** Suitable for small arrays where its simplicity is more beneficial than its inefficiency.

## Limitations

- **Inefficiency with Large Datasets:** Due to its O(n²) time complexity, Selection Sort is not practical for large datasets where more efficient algorithms like Quick Sort or Merge Sort are preferred.

## Conclusion

Selection Sort is a simple and educational sorting algorithm that demonstrates basic sorting concepts through iterative selection and swapping. While its O(n²) time complexity limits its practicality for large-scale data, it remains a useful tool for understanding fundamental sorting principles and for small-scale applications.

