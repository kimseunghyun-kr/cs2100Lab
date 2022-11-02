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









