def solution(X, Y, colors):
    n = len(X)
    ans = 0
    for i in range(n):
        r2 = X[i]**2 + Y[i]**2
        cnt = red = 0
        for j in range(n):
            if X[j]**2 + Y[j]**2 <= r2:
                cnt += 1
                red += colors[j] == 'R'
        if red*2 == cnt:
            ans = max(ans, cnt)
    return ans

assert 2==solution( [4, 0, 2, -2],  [4, 1, 2, -3], "RGRR")
assert 4==solution( [1, 1, -1, -1],  [1, -1, 1, -1], "RGRG")
assert 0==solution( [1, 0, 0],  [0, 1, -1], "GGR")
assert 2==solution( [5, -5, 5],  [1, -1, -3], "GRG")
assert 2==solution( [3000, -3000, 4100, -4100, -3000],  [5000, -5000, 4100, -4100, 5000], "RRGRG")
