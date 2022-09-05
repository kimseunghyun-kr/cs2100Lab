1.
P(head) = 0.5
P(1 throw) = 0.5
P(2 throw) = 0.25
...

let k be the number of throws

P(k throw to meet head) = 0.5^k
P(possibility of getting head to infinite) = sum{1 to infinity} (0.5)^k 
= 0.5/0.5 = 1


let S = E(number of unbiased coins before it comes up to head) = sum{1 to infinity} (k * 0.5^k)

S = sum{1 to infinity} (k * 0.5^k)
S = 0.5 + sum{2 to infinity} (k * 0.5^k)
S = 0.5 + 2* 0.5^2 + 3 * 0.5^3 ... --> 1
S = 0.5(1 + 2 * 0.5 + 3 * 0.5^2)....
S/2 = 0.5^2 + 2 * 0.5^3 + 3 * 0.5^4 --> 2
comparing 2 with 1
S/2 = S - (0.5 + Sum { k = 2 to infinity} (0.5)^k))
S - S/2 =  0.5 + Sum { k = 2 to infinity} (0.5)^k)
S/2 = 0.5 + 0.5^2 / 0.5 = 1
S = 2;


2.
P(getting 1 on 6 side die) = 1/6
P(1st try) = 1/6
P(2nd try) = 1/6 ^ 2
...
P(kth try) = 1/6^k
E(number of tries before getting 1)
= sum{1 to infinity} (k * (1/6)^k)
let S = sum{1 to infinity} (k * (1/6)^k)
S = 1/6 + 2*(1/6)^2 + 3*(1/6)^3...
S = 1/6(1 + 2*(1/6) + 3*(1/6)^2 ...)
6S = 1 + 2*(1/6) + 3*(1/6)^2 ...
6S - S = 1 -1/6 + 2*(1/6)  -2*(1/6)^2 + 3*(1/6)^2 ...
5S = 1 + sum{1 to infinity)}(1/6)^k
5S = 1 + (1/6)/(5/6) = 1 + 1/5 
5S = 6/5 
S = 6



3.
P(1 prepared) = (1- k/n)
P(all m prepared) = (1-k/n)^m


4.
p(not studied) = k/n
E(m number of students who had prepped before not prepp comes out) = 1 * (k/n) + 2 *(1-k/n)*(k/n)
+ 3 *(1-k/n)^2*(k/n)

... =Sum{1 to infinity}((m) x (1-k/n)^(m-1) x k/n)

let S = Sum{1 to infinity}((m) x (1-k/n)^(m-1) x k/n)
S = (k/n) Sum{1 to infinity}(m x (1-k/n)^(m-1))
by geometric distribution
E[x] = 1/p = n/k



5
P(first new student being picked) = 1
P(second new student being picked) = n-1/n
...
P(nth new student being picked) = 1/n

let T represent number of throws since last new student

the total number of throws = E[T1+ T2 ... Tn]
== E[T1] + E[T2] ... E[Tn] -->1
by linearity of E(x)

E[Ti] = 1/P(Ti) since each picking(trial) is independent where, P(Ti) = (n-(i-1))/n

eqan(1) = n/n + n/n-1 + ..
 = n(1/n + 1/n-1 + 1/n-2 ....)
 = n . Hn -> nlogn


coupon collector
-> same as the above


T -> number of questions answered by students that prepared in between 2 non prepped students

E[T1 .... Tq] q<k  -> 1
= E[Ti] = 1/p

P(Ti) = (k-(i-1)/n)

eqn(1) = n/k + n/k-1 + n/k-2 ... n/k-q + 1
== n(1/k + 1/k-1 + 1/k-2 ... 1/k-q+1)

== n ( sum{1 to k} -> (k-(i-1)/n) - sum{1 to k-q} -> (k-(i-1)/n) )

<= n * (1 + lgk - (1 + lg(k-q)))
<= n* lg(k/k-q)



