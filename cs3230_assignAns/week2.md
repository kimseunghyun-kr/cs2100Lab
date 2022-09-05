1.(a)

transitivity:
f(n) == O(g(n)) && g(n) == O(h(n))
above means
f(n) is an element of set of functions O(g(n)) 
{ where the definition of O means that for all functions g' in g(n), there exist a n0 and c st for k > n0, f(k) <= g'(k)
 } 
 
and g(n) is a set of functions that is a subset of O(h(n));

this means that f(n) is an element of O(h(n)),

as such f(n) = O(h(n));


OR

{f(n) : there exist constants c > 0, n0 > 0 such that 0 <= f(n) <= cg(n) for all n  n0 }

f(n) == O(g(n)) : 0 <= f(n) <= cg(n)
g(n) == O(h(n)) : 0 <= g(n) <= ch(n)
f(n) <= ch(n) (by inequality transitivity);
by definition,
f(n) = O(h(n));



1.(b)

{ W = big omega, T = theta }

f(n) = T(g(n));

by definition of theta 
T(g(n)) = O(g(n)) && W(g(n);

which means 

{ there exist positive constants c1, c2 and n0 such that 
0 <= c1g(n) <= f(n) <= c2g(n)   -- 1
for all n >= n0 }

c1g(n) <= f(n)
f(n) <= 1/c1 g(n)

f(n) <= c2g(n)
1/c2 f(n) <= g(n)

by above

1/c2 f(n) <= g(n)  <=  1/c1g(n);

where as f(n) >= 0 from -- 1
hence

0 <= 1/c2 f(n) <= g(n)  <=  1/c1g(n);

by definition

T(f(n)) = g(n);


1(c)

f(n) = o(g(n)) ⇒ g(n) = ω(f(n))

o(g(n)) = { f(n) : for any constant c > 0, there is a constant n0 > 0 such that 0 < f(n) < cg(n) for all n >= n0 }

0 < f(n) < cg(n)

=== 

0 <= 1/c f(n) < g(n)   ::c > 0;

above, by definition of w(g(n))


w(g(n)) = { f(n) : for any constant c > 0, 
there is a constant n0 > 0
such that 0 < = cg(n) < f(n) 
for all n >= n0 

trivially proves 

g(n) = w(f(n));


2(a)
 f6 < f2 <f8 <f7 == f(3) < f1 < f5 <f4

 2(b)(i)

 lim ((2^log(log(n)) / (3230n - log(log(n))))) = 0;

 f(6) < f(7);

 2(b)(ii)

 lim( n^3+3n+sin(n) / (n^2logn!)) = 0

 f(1) < f(5);



3(a)

ALICE: n + n*n^2 + log(n)*n + log(n);
BOB : n + logn*(n * n^2 + n) + logn

Bob asymptotically bigger at O(n^3logn) then ALICE at O(N^3);
