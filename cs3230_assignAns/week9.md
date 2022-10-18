dfs

path1
0 -3 -6 -7
cap:10

path2
0 -1 -4 -7
cap: 9

path3
0 -2 -5 -7
cap: 5

(source situ: 9/10 5/5 10/15    sink situ: 9/10 5/10 10/10)

path4

0 -3 -6 -2 -5 -7

cap:3

(source situ: 10/10 5/5 13/15    sink situ: 9/10 9/10 10/10)

max possible: 28

2.
man -> woman

woman -> man

woman -> house


make a tripartite graph with 

M nodes W nodes and H nodes

the M nodes and W nodes will have a non directional edge iff both M and W have each other as love interest

W and H nodes will have a directional edge from W to H if H is on shopping list of W.

have all M nodes connected to src

and H nodes connected to dst

each edge have value 1

and do the edmonds karp algo on it

V * E^2

E -> [max(M*W, W*H)]
V -> [M+W+H]

b) -> E * fmax

fmax == no of H

H < max(M*W, W*H)*[M+W+H]

will be faster(?)

but worst case will still be the same
{apparently the edmonds karp is a subset of the ford-fulkerson algo so...}
-> is the same according to zechen look up clrs for it


3.

node -> stream intersect
edge -> pipes and flow direction
cap -> cross section of the pipe(dimension)

2src

idea 1
for each source, run the max cap
find min(maxsource vanilla, maxsource choc)
 wont work as there may be instance where same pipe used but in opp direction

idea2
make a megasource with capacity == sum of vanilla and choco machine initially
connect the megasource to the node representing the vanilla and choco machine, with limitable pipes -> initially set to the min(vanilla, choco) capacity

find maxflow possible to T. if maxflow == initial -> that is the ans( can be done by bin search)

runtime (V^2E * log min(vanilla, choco) capacity) -> O(V^2E * logPX)

P pipes X -> flow * min -> max flow/min -> cap = PX -> caps the min(vanilla, choco) gen/min


```or (thanks to Lin Zechen)

This problem can be expressed as a max flow problem with 2 sources (2 tanks) and 1 sink (mixing machine), with the edges being the pipes and capacity being the capacity of the pipes. Since Dinic's algorithm works by labelling nodes by layers, this will work in our problem here.

Algorithm:

From the network of pipes, tanks, mixing machine and welding points, construct a graph with tanks as nodes (not source, since we will be constructing source in the next step), mixing machine as the sink node $T$, welding points as nodes and pipes as edges. (Runtime: $O(VE)$)
Create an additional source node $S$ that has an edge connecting to each of the 2 tanks with capacity $C$. (Runtime: $O(1)$)
Set the initial capacity of each of those edges to be $C_\text{initial} = NX/2$ where $N$ is the number of pipes connecting to the sink node. This ensures that the starting iteration to find the max amount of perfectly balanced ice-cream produced is not limited by these 2 edges. (Runtime: $O(1)$)
Set initial upper bound $C_\text{upper}$ to $C_\text{initial}$ and lower bound $C_\text{lower}$ to 0.
Run Dinic's algorithm from $S$ to $T$, and obtain the max flow $f$. (Runtime: $O(V^2E)$)
If $2C = f$, it means that we have fully utilized the current configuration. Else if $2C > f$, then the max amount of ice-cream we can produce should be less than $2C$ since we require a perfect mix of equal parts. Thus, we can utilize the concept of binary search to find the max capacity $C_\max$ such that $2C_\max = f_\max$.
Thus, we repeat the Dinic's algorithm with $C_\text{mid} = \frac{C_\text{lower} + C_\text{upper}}{2}$ to find the max capacity $C_\max$ such that $2C_\max = f_\max$ and $2C_{\max + 1} > f_{\max + 1}$. If $2C_\text{mid} = f$, update $C_\text{lower} = C_\text{mid}$. Else if $2C_\text{mid} > f$, update $C_\text{upper} = C_\text{mid}$. Repeat until $C_\text{upper} - C_\text{lower} \leq 1$. (Expected number of loops: $\log(C_\text{initial})$, expected runtime for all loops: $O(V^2E\log(C_\text{initial}))$)
Return $2C_\text{lower}$ as the max liters of ice cream the factory can produce each minute. (Since $2C_\text{lower} =f_\text{lower}$ and $2C_\text{upper} > f_\text{upper}$)
Proof of correctness:

We know that in order for the 2 separate creaming machines to produce ice cream to be mixed in equal parts, the total flow coming out of those 2 tanks should be equal. However, there might be several pipes coming out from those 2 sources and it is hard to easily account for the total flow out of the 2 tanks. Furthermore, having 2 sources makes it hard to find the max flow using Dinic's algorithm. Instead, we make use of the property of flow conservation and create a source node pointing to those 2 tanks, and use equal capacities for those 2 edges linking them. This ensures that the total flow out of those 2 tanks can be easily accounted for by the flow into the tanks.

Now, we just need to ensure that the flow into each tank is equal and maximized.

The first thing we notice is that the max flow into the sink node must be less than or equal to the sum of capacities of the edges flowing into the sink node. The minimum flow into the sink node is 0 when there is no flow at all. Thus, we know that the max amount of ice creams we can produce must be a number between 0 and the max flow.

When we find the max amount of equal parts ice-cream produced, we should have the flow out of each tank being the same too. Thus, max amount of equal parts ice-cream produced should be equal to 2 times the flow out of each tank when that happens. Using our definition in the algorithm, we are looking for $C_\max$, and at $C_\max$, we should have $2C_\max = f_\max$.

For values $C_x < C_\max$, we can simply reduce the the flow out from each of the tanks by an amount $C_\max - C_x$. The max flow in that case will be reduced by $f_\max - 2(C_\max - C_x)$. This means that $C_x$ will also satisfy the equation $2C_x = f_x$.

​ Proof: $$ \begin{align} 2C_x &= 2(C_\max - (C_\max - C_x)) \ &= 2C_\max - 2(C_\max - C_x) \ &= f_\max - 2(C_\max - C_x) \ &= f_x \end{align} $$ The reducing of flow can always be executed since there won't be anything limiting us from doing so, and we will be using a flow less than the current flow which is also less than the capacity of each pipe.

However, for values $C_y > C_\max$, we cannot simply increase the flow from each of the tanks by the same amount. This is because we define $C_\max$ to be the maximum possible flow out from each of the tanks such that the flows out of the tanks are equal. If we have a $C_y$ that is capable to increase the max flow out of both tanks, then $C_y = C_\max$. (proved by contradiction with $C_y > C_\max$) Thus, $C_y$ should only be able to improve flow out from at most 1 tank, if not none. Thus, we have: $$ \begin{align} f_y &\leq 2C_\max + C_\max - C_y\ 2C_y &= 2C_\max + 2(C_\max - C_y) \ &> f_y \end{align} $$ Using this property, we can then perform a binary search for $C_\max$ between 0 and $C_\text{initial}$, which is the max possible $C$ such that we can obtain the max flow of the flow network. We know we have found $C_\max$ if $C_\text{upper} - C_\text{lower} \leq 1$ and $2C_\text{lower} = f_\text{lower}, 2C_\text{upper} > f_\text{upper}$, then $C_\text{lower} = C_\max$ since any other $C > C_\text{lower}$ will have property of $C_y$.

Runtime analysis:

From the runtime of the different steps shown above, runtime of the algorithm is $O(V^2E\log(C_\text{initial}))$. This can also be obtain by seeing the algorithm as a binary search for the value $C_\max$ between 0 and $C_\text{initial}$, and each checking for the value requires running the Dinic's algorithm which has runtime $O(V^2E)$, thus the overall runtime $O(V^2E\log(C_\text{initial}))$.

Since we have at most $P$ pipe and capacity of each pipe being less than $X$, we can deduce that

$E = O(P), V = O(P), C_\text{initial} = O(XP)$.

Thus, overall runtime will be $O(P^3\log(XP))$.
```


