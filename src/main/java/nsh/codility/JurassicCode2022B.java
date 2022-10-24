package nsh.codility;

import java.util.ArrayList;
import java.util.Comparator;

public class JurassicCode2022B implements JurassicCode2022Interface {

	class Point {
		int r;
		boolean isRed;

		Point(int r, boolean isRed) {
			this.r = r;
			this.isRed = isRed;
		}
	}

	public int solution(int[] X, int[] Y, String colors) {
		int n = X.length;
		int ans = 0;
		ArrayList<Point> tab = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			int r2 = X[i] * X[i] + Y[i] * Y[i];
			tab.add(new Point(r2, colors.charAt(i) == 'R'));
		}
		tab.sort(new Comparator<Point>() {

			@Override
			public int compare(Point o1, Point o2) {
				return o1.r - o2.r;
			}

		});

		int cnt = 0;
		int red = 0;

		for (int i = 0; i < n; i++) {
			// r2 = tab[i][0]
			cnt++;
			if (tab.get(i).isRed)
				red++;
			if (red * 2 == cnt && (i == n - 1 || tab.get(i).r != tab.get(i + 1).r))
				ans = Math.max(ans, cnt);
		}
		return ans;

	}
}
