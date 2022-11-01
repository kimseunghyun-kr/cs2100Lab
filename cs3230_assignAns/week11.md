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
Integers that are inside array = 32 / 64 bits
by representation of the numbers, in terms of bits
X = 32n or 64n

algo is still bounded by O(X^2), which is polynomial. NOT a pseudo polynomial algorithm




