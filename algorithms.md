1. String Reversal 
  - For loop length-1 to 0 loop create new string.
  - Similar to stack ? Push from first to last and pop which will give last to first?
  
2. Palindrom 
  - Two pointers one points to start and another one to end and compare chars till we reach the middle (n/2)

3. Reverse of Int 
  - output = 0
  - while (input > 0 )
  - output = output * 10 + input % 10
  - input = input/10
  - Solution 2 - Make it string and reverse the string
4. Find max char in a string
  - create a map of char to count and found the max (run time - 2n, Storage - 2n)
5. Fizzbuzz write fizz for divisible by 3 and buzz for divisible by 5 and fizzbuzz for divisible by 3 and 5
  - if n%5==0 && n%3==0 then fizzbuzz elseif n%3==0 print fizz elseif n%5==0 print buzz else print n
6. Array Chunking - [1,2,3,4] chunk into 2x2 arrays [[1,2],[3,4]]
  - For length of array run a loop and if current index + chunk < length then run inner loop to chunk it
  - When  current index + chunk is greater than lenght break the loop and check if there are any elements left 
  - if yes make last chunk which will be smaller than chunk.
 7. Can these random text pattern would form a Palindrom. 
  - create a map of char and count. check if each char is exactly twice. zero or one char could be once.
 8. Are the two string Anagram. Number of chars shoud match.
  - Solution 1 - create map of char to count without white space(space, tab, new line) and these maps should match.
  - Solution 2 - Sort the string and start comparating char by char if no difference then Anagram
 9. Capitalize first letter of each word in a sentence.
  - Solution 1 - Spit sentence by space Stringtokenizer then upper each first letter. 
  - Solution 2 - Loop through each char, check if on left there is space if yes capitalize it, else copy same letter
 10. Steps - input is integer, print those many # in output. for 2 show '# ' '##'. 
  - two for loops outer for line number inner for each # check outer index and inner index and prince # or space.
  - if i <= j prince # else pring space. create string and print
 11. 
