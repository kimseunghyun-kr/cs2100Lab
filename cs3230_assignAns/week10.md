A linear program is said to be in standard form if
• it is a maximization program,
• there are only equalities (no inequalities) and
• all variables are restricted to be nonnegative.


a)

x = 45/60 A + 25/60 B
y = 21/60 A + 0.5B
sum of all x and y <= 42A + 38B
-> sum of all x and y + c = 42A +38B
for some c >= 0;
max(x+y);


b)

 The carpenter can afford to spend up to 40 hours per week
working and takes six hours to make a table and three hours to make a chair.

T = 6
C = 3
T + C <=40

Customer
demand requires that he makes at least three times as many chairs as tables.
T + s = 3C for some s >=0

Tables
take up four times as much storage space as chairs and there is room for at most four
tables each week.
T = 4C
sum(T+C) + k = 4T for some k >= 0

max(30T + 10C)

c)

let f(u,v) represent if the edge is selected
f(u,v) = 1 if selected, 0 if not
f(v,u) = f(u,v) iff the u and the v used are the same
let d(u,v) represent distance between towns


minimise(sum(d(u,v) dotPdt f(u,v))
-> maximise(-sum((d(u,v) dotPdt f(u,v))))
for all vertices, 0<= SUM(f(u,v)) <= 2;


min(dist)

(d)
NO. $f$ and $g$ are not necessarily linear.

2.

bh + s = 300
cr + k = 200
bh + cr + g = 600 - 200x 0<=x<=1

max(3cr + 4bh)

ans = max possible earning = 300 * 4 + 200 * 3 = 1800
formula( 2100 - 600*max(x, 0.5)) )


3.

knapsack = kn
knapsack weight = W
weight-value pair = wp
weight = w
value = v


Assume that fractions of items can be taken and the value of the item is uniform -> that is the value is vtotal * weight-taken /weight-total always

for all k in kn
w1a1 + w2a2 + .... wnan < Wk where ap [0,1]


for all k in kn
max(sum for p [1,n] {vpap})
as when the value in each knapsack is maximised, the total value in n knapsacks will be maximised


This method is inefficient as we will have to go through LP first to obtain the max value before knowing the weight of each item to be packed for each knapsack. Instead, we can try to pack each knapsack starting with the item with the highest value per unit weight, and perform this until all knapsacks are filled. The maximum total value of all items in knapsacks can then be easily deduced also.