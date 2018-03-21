## Homework 2
### Kanchanok Kannee (5910545639)

A simple recursive function for this is:
```
public static long fibonacci(int n) {
 // the base case
 if (n < 2) return 1;
 // the recursive step
 return fibonacci(n-1) + fibonacci(n-2);
}
```
Explain why this function is so slow, even for fairly small values of n (like n=45 or n=50). 

Answer : Every time we enter to the function it will perform a double recursive opearation.
