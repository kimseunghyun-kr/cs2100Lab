3230 students
ramdom distribute 1 card to each student, no replacement
let X be case when a student get his own card
//proving to self
let n = 4
P(first student getting his card) = 1/4
P(not getting his card) = 3/4
P(second studnet getting his card) = 3/4 * 1/3
P(third student getting his card) = 3/4 * 2/3 * 1/2
P(nth student getting card) = (n-1)/n * (n-2)/(n-1) .... == 1/n

E(X) = 1/3230 * 1 = 1/3230
3230 students present
E(3230X) = 1 (linearity of E(X))


-> alternately
think of laying out all student card to student positions -> laying out all n! permutations to n locations. P(n card laid out in nth position in all n! permutation) = 1/n of the time

1(b)

X - > let a b c in [0,1]
if X can take (a,b,c) each with nonzero probability

p(a) > 0 p(b) > 0 p(c) > 0
 --> 1>= p(x) > 0

E(X) = ap(a) + bp(b) + cp(c)

E(x^2) = ap(a)^2 bp(b)^2 cp(c)^2

for y in [0,1], y >= y^2  -- > ㅋ
and for (0,1), y > y^2 -->ㅋㅋ

as p satisfies condition [0,1], {(0,1] is subset of [0,1]}, by definition
->
p(x) >= p(x^2)

hence E(x) >= E(x)^2

as the 3 values {a,b,c} are distinct according to the question, only 1 can have p(k) == 1
hence, E(X) != E(X^2)

E(X) > E(X^2)


2(a)
X -> method positive
Y -> machine broken
& = and | = or
P(Y) = 0. 02

P(X & Y) / P(Y) = 0.998
P(X' & Y) / P(Y) = 0.002
P(X' & Y') /P(Y') = 0. 996
P(X & Y') /P(Y') = 0. 004

P(X & Y) = 0.01996
P(X' & Y') = 0.97608
P(X' & Y) = 0.00004
P(X & Y') = 0.00392

P(X) = P(X & Y') + P(X & Y) = 0.02388

P(X & Y'|X) = 0.1641541038525963
P(X' & Y | X') = 0.00004097856820882678


3(a)
while(true) {
    a = randint[1,7]
    b = randint[1,7]
    c = (a-1) * 7 + b
    if(c < 41) {
        return a%10 + 1
    }
}

b/a 1 2  3  4  5  6  7   
1   1 8  15 22 29 36 43
2   2 9  16 23 30 37
3   3 10 17 24 31 38
4   4 11 18 25 32 39
5   5 12 19 26 33 40
6   6 13 20 27 34 41
7   7 14 21 28 35 42

final output

x    2    3     4    5    6    7
p(x) 7/40 7/40  7/40 7/40 7/40 5/40

returns a drv with the following probabilities

number of happy per cycle -> 2
let X be the probability of cycle repeat
P(X) = 9/49
2(1) + 2 x (9/49) ... 

E(X) = 2 * (9/49)^r-1 --> ㅋ

sum of ㅋ from r = 1 to infinity = a/1-r

repeating term{r} = (9/49)
starting = 1
2 * 1/40/49 = 49/20






