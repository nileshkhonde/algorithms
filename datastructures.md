###### Arraylist
- Collection of items
- Array size is fixed. If larger size is needed later then, we have to recontruct the array.
e.g. 
String[] strArr = new String[] is array of strings.
Employee[] empArr = new Employee[] is array of employee class objects
- If we define a very large array than we need, then that memory is blocked/reserved and never used
& Computer has to find large contiguous memory.  

- Array of size n has indexes from 0 to n-1. 
- Array access is O(1), as it can be accessed by index directly.
- Array insert/update is O(1), as it can be accessed by index directly.
- Array search would be O(n) as we need to look each element unless we have index.
- Array delete is O(1), but it creates hole in array unless we compact it.



