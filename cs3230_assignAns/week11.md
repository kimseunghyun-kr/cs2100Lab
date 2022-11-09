x is a number , can be represented in logx bits = m, hence in bits, x = 2^m
wlog, y can be represented in logy bits = n , hence in bits, y = 2^n

Distance(x,y) runs in O(abs(x-y)) time, which is polynomial in terms of x and y
however, in bits, Distance (x,y) now runs in O(2^m + 2^n), exponential to the length of representation of the input

by definition of pseudo polynomiality , (a) is pseudo polynomial

Compare(x,y) takes 
binstring = logX + logY
a, b len logX, logY respectively

min(len(a), len(b))
O(1) task 

time taken = O(max(log(X), log(Y))), polynomial as upper bounded by polynomia O(max(X,Y))

x is a number , can be represented in logx bits = m, hence in bits, x = 2^m
wlog, y can be represented in logy bits = n , hence in bits, y = 2^n

then, time taken = O(max(log(2^m), log(2^n))) -> O(max(m,n)) -> polynomial
not pseudopolynomial by definition


len(A) = N

Check(A[1] ... A[N])
S = O(N)
T = O(N/2 * N)
O(n)
O(n)

for O(n/2):
    for (n) :
        O(1)

time taken by algo approx bounded by O(N^2) , is polynomial
Integers that are inside array = k bits, where k approx max(log(A[j]))
Sum == n*2^k

-> loop = n2^k * n = n^2 * 2^k

algo is still bounded by O(2^k), which is polynomial. IS a pseudo polynomial algorithm



B can be converted into A where the edge weight of nonpresent = 0, present = 1;

total weight of all the edges  =  number of vertices

traversal of all edges = n(n-1)/2 where n = vertices
only need labelling


let the set of all graphs as X

for x in X, label each points as x1 ... xn
set l = k edges to cross
for all connected pairs xi .. xj, 

set condition xi + xj > 0 and xi + xj <2

same as labelling entire graph as either 0 or 1

will satisfy both conditions iff they are labelled diff
if same, will fail the <2 condition if both 1 and fail > 0 if both 0

(a)
true
both are equivalent forms of one another. hence there should exist a polynomial time shift

(b)
false

p is subset of NP

(c)
True. A in P$ implies A in NP$. $A$ is also NP-Hard. Thus, $A$ is NP-Complete.

(d)
true. B needs to be at least as hard as A should A be reduced to B

(e)
false (for now)
if p != np then no guarantee if p = np then np U np complete = np

(f)
True. independent set problem is NP complete which implies it is NP, so if np = P there is a polynomial solution to it

(g)
true. can be done in O(n) through a stack, up to n/2 of the word

(h)
false. if the vertices are at most 2, then the resulting graph can only be a loop or a line. then the entire graph can be traversed in O(Vertices) to find the vertex cover

(i)
false

the vertex cover can be done iteratively from the leaf to the root by deciding if the vertice should be part of the vertex cover.

can be done in O(2V) time O(2V) space Q3 assign 7


2
S is a subset of a1 to an
K is a correlated set k1 to kn

for yes instance, the certificate will be the lowest prime factor of every ai

length of input will be n log m where m is the greatest ai in list
for each pi that is the smallest prime factor of ai, finding the value of ci will be logpi

ki leq logai leq logm

max no of elem = n
for each elem n , seeing if lowest prime factor is equal to the prime factor == logm. 
then seeing if the ki th input < logai < logm

hence, total time O(n(logm)^2)

for a No instance, the certificate will be the same, but we are checking if size of S geq t which would be leq n since it is subset of S

and we are checking to ensure that there are $<t$ number of equal bits. Thus, this problem is in co-NP as well.


3.

Yes instance 

the certificate will be the subsets S1 and S2 themselves

take O(n) time where max n to see if all of the elements S1 and S2 are different(no overlap) and that they cover all of the elements in S

also, the sum of all of the elements in S1 and S2 each in total will take O(n)

verifiable in polynomial time thus NP qn


For SUBSET-SUM, we have a list of integers $S$ and a target sum $t$. I

let S = sum of all numbers in Sn -> O(n)
let t of subset sum = S/2
run SUBSET SUM = (Sn,S/2)

transformation can be done in polynomial time.

yes instance of subset sum = proof that partition possible as
there exist a set E whose sum S/2 means that the complement also has sum S/2
-> there exists a 2-partition of S, whose sum equal

in the case where there is no solution for the SUBSET-SUM problem, we will also be unable to get 2 equal sum partitions from the PARTITION problem, WLOG, from above

This shows that the SUBSET-SUM problem can be reduced to the PRTITION problem in polynomial time, and thus the PARTITION problem must be at least as hard as the SUBSET-SUM problem, which is NP-Complete. Since NP-Complete implies NP-Hard, the SUBSET-SUM problem is thus NP-Hard.