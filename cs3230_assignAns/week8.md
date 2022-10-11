q1 . set cover theory

file:///C:/Users/USER/Downloads/CS3230_Assignment_08_Q1_Solution(online).pdf

Since the optimal solution uses k sets, there must some set that covers at least a 1/k fraction of the total amount of numbers to cover == m.

The algorithm chooses the set that covers the most points, so it covers at
least that many. Therefore, after the first iteration of the algorithm, there are at most m(1 − 1/k) points left.

Again, since the optimal solution uses k sets, there must some set that covers at least a 1/k fraction of the remainder (if we got lucky we might have chosen one of the sets used by the optimal solution and so there are actually k − 1 sets covering the remainder, but we can’t count
on that necessarily happening). 

So, again, since we choose the set that covers the most points
remaining, after the second iteration, there are at most m(1 − 1/k)
2 points left. More generally,
after t rounds, there are at most m(1 − 1/k)^t 
uncovered numbers left. After t = n rounds
the algorithm terminates , containing all elements

m(1- 1/k)^n leq 1

(1- 1/k)^n leq 1/m

n log( 1- 1/k ) leq -log(m)
n geq -log(m) / log(1-1/k)
n geq log(m) / log(k/k-1)

n/k geq log(m)/(k * log(k/k-1))

(k * log(k/k-1)) leq 2

hence

n/k geq log(m)/2



q2.

create a hashmap that sorts items from lowest to highest based on the multiplication rate O(nlogn)

and buy from the lowest multiplication first


