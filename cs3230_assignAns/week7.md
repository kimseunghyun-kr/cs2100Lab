q1

overlap
take 3 bit

000 -> 001 / 010 / 100 
001 -> 011 / 101
010 -> 110 / 011
100 -> 101 / 110
110 -> 111
101 -> 111
011 -> 111


should all problems be recursively be explored, there are recomputation of nodes k times by k neighbouring vertics

optimal substructure
let there be opFunc(k) which returns the path of lowest cost till the kth iteration, where the values are memoised in an array of size 2^n(n is the length of the array)

opfunc(k) = min( opfunc(k-1) + dist(k-1, k) );
for k's children
opfunc(0) = 0;

2(a)

T(n) = sum(i =  1 to n)_{ 1 + T(n-i)}
T(n) - T(n-1) =  sum(i =  1 to n)_{ 1 + T(n-i)} - sum(i =  1 to n-1)_{ 1 + T((n-1)-i)}

T(n) - T(n-1) = n - (n-1) + T(n-1)
T(n) = 2T(n-1) + 1
T(n) = 2^n

2(b)
T[n] = for(int i = 1 to n)_ {max(T[n] , T[n-i])}

2(c)

init T[entire] = int_min
for (int j = 1 to j = n) {
    T[j] = for(int i = 1 to j)_ {max(T[j] , T[j-i])}
}

runtime : O(n^2)

3.

2 cases

if curroot covered
if curroot uncovered

2 base case
if curroot covered -> 1
if curroot uncovered ->0
at leaves

covered[n] = 1 + uncovered[Lchild] + uncovered[Rchild]
uncovered[n] = max( covered[Lchild] + covered[Rchild] , covered[Lchild] + uncovered[Rchild], uncovered[Lchild] + covered[Rchild])

goal

max(covered[n], uncovered[n]);



proof of correctness

init : both states of subtrees being covered/ uncovered present, where the value is the max no of nodes in the subtree being covered present.

maint : if curr root covered -> then both of its child root needs to be uncovered
       if curr root uncovered -> inclusive or of child root being covered
       -> shown by the above steps

term: if curr node covered -> true as 1 + maxL + maxR
      if curr node uncovered -> true as max of all permutation of child nodes


memoisation : having 2 arrays are suffice as the coveredmax/ uncoveredmax are related to the shape of the tree , which are constant at every level

best case : T(n) = T(Left) + T(Right) + 3;
            -----> 2T(n/2) + 3 -> if balanced
            ==> Theta(n)

worst case ; T(n) = T(n-1) + T(1) + 1
            ==> O(n)

            (straight line graph);



