### Lab 3 Solutions

## Problem 1:
1. 10000000000n^2 vs n^3: n^3 is asymptotically greater since n^3 is greater because it has a higher degree. \
2. n^2 log(n) vs n(log(n))^10: n(log(n))^10 is asymptomatically greater since the logarithmic term is raised to a higher power, which makes the function grorw faster.
3. n^(log(n)) vs 2^root(n): The comparison will depends on the value of n. However, generally n^logn has higher potential for growth than 2^root(n). 
4. 2^n vs 2^2n: 2^2n is asymptomatically greater since it has higher exponent.

## Problem 2: 
* Best Case: The best case time complexity is O(1). This will occur when n is not divisible by any number from 2 to root(n), the loop will only run once.
* Worst Case: The worst case time complexity is O(root(n)). This will occur when n is a prime number, the loop will runs until i=root(n).
* Average Case: The average case time comeplexity is O(root(n)). The same as worst case which is n is prime number.
