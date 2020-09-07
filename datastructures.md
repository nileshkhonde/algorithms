###### Array
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
- Array of primitives will have their default values when initialized, int will be 0 boolean will be false etc.
- Array of Objects will have all elements null by default.
- for(int i=0;i<n;i++) index loop when we need index for calculations
- for(int id: ids) when we want to loop and doesnt need index but just value.
- If Array is accessed outside range then we get ArrayIndexOutofBound
- Array.length would give total size of the Array. 
- but if we want to know how many elements in array that we have to keep track 
- Inserting new element at the start of array would need to move all elements on right. 
- Inserting new element at the next available slot is simple and O(1) operation
- Inserting new element at the middle would need to shift the elements on right
- inserting new element when array size is reached would need to copy array into new with twice size and save.




