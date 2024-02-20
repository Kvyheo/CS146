### Homework 5 Solution

## Problem 1
1. T(N) = 2T(N-1) + 1:
   * The recurrence is linear, the theorem does not directly apply.
   * Solved using the recursive tree method, the solution is T(N) = O(2^N), it is an exponential.
2. T(N) = 3T(N-1) + N:
   * The recurrence is linear, the theorem does not directly apply.
   * Solved using the recursive tree method, the solution is T(N) = O(N!), it is an factorial.
3. T(N) = 9T(N/2) + N^2:
   * Theorem applied, a = 9, b = 2, and f(N) = N^2
   * The solution is T(N) = Θ(N^log_2(9)) = Θ(N^~3.17)
4. T(N) = 100T(N/2) + N^log_2(cN+1) (c is a constant)
   * Theorem case 1 applied, the solution is T(N) = Θ(N^log_2(100)) = Θ(N^~6.64)
5. T(N) = 4T(N/2) + N^2logN:
   * Theorem applied, a = 4, b = 2, and f(N) = N^2logN
   * The solution is T(N) = Θ(N^2log^2N)
6. T(N) = 5T(N/2) + N^2/log N:
   * Theorem applied, a = 5, b = 2, and f(N) = N^2/logN.
   * The solution is T(N) = Θ(N^2/logN)

  
## Problem 2
Recurrence relation for `yetAnotherFunc`: T(n)= 20n + 2T(n/2)

Using the recursion tree method, at
1. First Level:
   * Cost at the root: 20n
   * Two recursive calls on n/2 each with cost T(n/2)
2. Second Level
   * Cost at the second level: 20(n/2) + 2T(n/4)
   * Each recursive call on n/4 leads to two more recursive calls on n/8 each with cost T(n/8)
3. Generalizing to k Levels
   * Cost at each level: 20(n/2^k)
   * The recursion stops when n/2^k = 1 => k = log_2 (n)

=> T(n) = 20n + 20(n/2) + 20(n/2^2) + ... + 20(n/2^log_2 n) + 2T(1)
=> T(n) = 20n (1 + 1/2 + 1/2^2 + ... + 1/2log_2 n) + 2T(1)
The parentheses is a geometric series with a sum of (2 - 1/2log_2 n), which converges to 2 as n approaches infinity.
=> T(n) = O(n)
