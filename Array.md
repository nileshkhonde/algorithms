#### Array
###### Ordered Collection of items
###### Array size is fixed. If larger size is needed later then, we have to recontruct the array.
###### e.g. String[] strArr = new String[10] is array of strings. Employee[] empArr = new Employee[20] is array of employee class objects
###### If we define a very large array than we need, then that memory is blocked/reserved and never used & Computer has to find large contiguous memory.
###### Array of size n has indexes from 0 to n-1. 
###### Array access is O(1), as it can be accessed by index directly.
###### Array insert/update is O(1), as it can be accessed by index directly.
###### Array search would be O(n) as we need to look each element unless we have index.
###### Array delete is O(1), but it creates hole in array unless we compact it.
###### Array of primitives will have their default values when initialized, int will be 0 boolean will be false etc.
###### Array of Objects will have all elements null by default.
###### for(int i=0;i<n;i++) index loop when we need index for calculations
###### for(int id: ids) when we want to loop and doesnt need index but just value.
###### If Array is accessed outside range then we get ArrayIndexOutofBound
###### Array.length would give total size of the Array but not how many elements in it, we need to keep track of count of elements.
###### Inserting new element at the start of array would need to move all elements on right. 
###### Inserting new element at the next available slot is simple and O(1) operation
###### Inserting new element at the middle would need to shift the elements on right
###### inserting new element when array size is reached would need to copy array into new with twice size and save.
###### Deleting last element of an Array is easy and just reduce the current index
###### Deleting first element is shifting of all elements the left.
###### Search in array, if index is known then its constant time of O(1)
###### Search in array, if index is not known then it is linear search of O(n)
###### Search in array, if index is unknown, but array is sorted then we can use Binary search which gives O(log n) performance.
###### If we need to search only once then linear search is fine, if we need repeated searched then we should sort and do binary search.
###### Array problem types:
1. Remove Duplicates - i & j pointer - compare i & j if same increment j, when is not same as i then increment i and copy j to i
2. Rotate Array - rotate array of n elements by k time. reverse entire array, then reverse first k elements then reverse k to n-1 elements.
3. Has Duplicates - use set to keep the track
4. Intersection of two arrays - build map with element and its count, iterate second array to find common elements
5. Plus one - add one to number represented by array of integer. user / to see if we have carry and use % to get remainder
6. Move zero to right - two pointers one stops at zero and one as nonzero and then swap. both increments. if no swap increment nonzero.
7. Two sum - find pairs of numbers where sum is given target. Use map to keep visited numbers and find if it matches with target-current.
8. Three Sum - one loop put all values in map. then two loops to find 3 number combination.
9. Validate sudoku - navigate two dimensional matrix define 9 verticle, 9 horizonal, 9 block Set. add numbers and check if duplicate. i*3/3+j/3
10. Rotate Matrix - in place. two for loops, rotate 4 elements of matrix.


