#include <bits/stdc++.h>
using namespace std;

long long solve(vector<int> a) {
    return 0;
}

int main() {
    int n;
    ios_base::sync_with_stdio(false); // speed up reading input
    cin >> n;
    vector<int> a(2*n);
    for(int i = 0; i < a.size(); i++) {
        cin >> a[i];
    }
    cout << solve(a);
}
