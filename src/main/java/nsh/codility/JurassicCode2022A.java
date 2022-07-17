package nsh.codility;

import java.util.ArrayList;
import java.util.Collections;

public class JurassicCode2022A implements JurassicCode2022Interface {

	public int solution(int[] X, int[] Y, String colors) {
		ArrayList<Integer> green = new ArrayList<>(X.length);
		ArrayList<Integer> red = new ArrayList<>(X.length);

		for (int i = 0; i < X.length; i++) {
			int l = X[i] * X[i] + Y[i] * Y[i];

			if (colors.charAt(i) == 'G')
				green.add(l);
			else
				red.add(l);
		}
		if (green.size() == red.size())
			return X.length;
		Collections.sort(green);
		Collections.sort(red);
		int R = Math.min(green.size(), red.size());
		for (int j = R - 1; j >= 0; j--) {
			int m = 0;
			int gl = green.get(j);
			int rl = red.get(j);

			if ((j < green.size() - 1) && ((gl >= green.get(j + 1) || rl >= green.get(j + 1))))
				m++;
			if ((j < red.size() - 1) && ((gl >= red.get(j + 1) || rl >= red.get(j + 1))))
				m++;

			if (m == 0)
				return j + j + 2;
		}
		return 0;
	}
}
