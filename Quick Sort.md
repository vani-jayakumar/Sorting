# Quick Sort

## Overview

Quick Sort is an efficient and widely-used sorting algorithm that follows the divide-and-conquer paradigm. It works by selecting a 'pivot' element from the array and partitioning the other elements into two sub-arrays, according to whether they are less than or greater than the pivot. The sub-arrays are then sorted recursively.

## How It Works

1. **Choose a Pivot:** Select an element from the array as the pivot. Various methods can be used to choose the pivot, such as picking the first element, the last element, the middle element, or using a random choice.
2. **Partition:** Reorder the array so that elements less than the pivot come before it and elements greater than the pivot come after it. The pivot is then placed in its correct position.
3. **Recursively Apply:** Recursively apply the above steps to the sub-arrays of elements with values less than and greater than the pivot.
4. **Terminate:** The recursion terminates when the base case is reached, i.e., when the sub-arrays have one or zero elements.

## Characteristics

- **Performance:** Quick Sort has an average-case time complexity of O(n log n) and a worst-case time complexity of O(n²). The worst case occurs when the smallest or largest element is always chosen as the pivot.
- **Space Complexity:** It has a space complexity of O(log n) due to the stack space used by recursion.
- **Stability:** Quick Sort is not a stable sort. Equal elements may not maintain their relative order.

## Use Cases

- **General Purpose Sorting:** Quick Sort is often used in practice for its efficiency and performance, especially with large datasets.
- **In-Place Sorting:** Because it sorts the array in place, Quick Sort requires only a small amount of additional memory.

## Limitations

- **Worst-Case Performance:** The worst-case time complexity of O(n²) can be problematic for certain inputs. Using techniques like random pivots or the median-of-three method can help mitigate this issue.

## Conclusion

Quick Sort is a highly efficient sorting algorithm that leverages the divide-and-conquer approach to achieve impressive performance on average. While it is not stable and has a potential for poor worst-case performance, its average-case efficiency and in-place sorting capability make it a popular choice for many sorting tasks.
