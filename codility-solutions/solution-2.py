def solution(X, Y, colors):
    n = len(X)
    ans = 0
    tab = []
    for i in range(n):
        r2 = X[i]**2 + Y[i]**2
        tab.append((r2, colors[i] == 'R'))
        tab.sort()

        cnt = red = 0
    for i in range(n):
        # r2 = tab[i][0]
        cnt += 1
        red += tab[i][1]
        if(red*2 == cnt and 
               (i == n-1 or tab[i][0] != tab[i+1][0])):
            ans = max(ans, cnt)
    return ans

assert 2==solution( [4, 0, 2, -2],  [4, 1, 2, -3], "RGRR")
assert 4==solution( [1, 1, -1, -1],  [1, -1, 1, -1], "RGRG")
assert 0==solution( [1, 0, 0],  [0, 1, -1], "GGR")
assert 2==solution( [5, -5, 5],  [1, -1, -3], "GRG")
assert 2==solution( [3000, -3000, 4100, -4100, -3000],  [5000, -5000, 4100, -4100, 5000], "RRGRG")
