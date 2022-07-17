package nsh.codility;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public abstract class AbstractJurassicCode2022Test {
	abstract JurassicCode2022Interface getTestObject();

	JurassicCode2022Interface testObject;

	@BeforeEach
	void setup() {
		testObject = getTestObject();
	}

	@ParameterizedTest
	@MethodSource
	void test_samples(int E, int[] X, int[] Y, String colors) {
		assertEquals(E, testObject.solution(X, Y, colors));
	}

	static Stream<Arguments> test_samples() {
		return Stream.of( //
				Arguments.of(2, new int[] {4, 0, 2, -2}, new int[] {4, 1, 2, -3}, "RGRR"), //
				Arguments.of(4, new int[] {1, 1, -1, -1}, new int[] {1, -1, 1, -1}, "RGRG"), //
				Arguments.of(0, new int[] {1, 0, 0}, new int[] {0, 1, -1}, "GGR"), //
				Arguments.of(2, new int[] {5, -5, 5}, new int[] {1, -1, -3}, "GRG"), //
				Arguments.of(2, new int[] {3000, -3000, 4100, -4100, -3000},
						new int[] {5000, -5000, 4100, -4100, 5000}, "RRGRG"));
	}


	@ParameterizedTest
	@MethodSource
	void test_corner(int E, int[] X, int[] Y, String colors) {
		assertEquals(E, testObject.solution(X, Y, colors));
	}

	static Stream<Arguments> test_corner() {
		return Stream.of( //
				Arguments.of(4, new int[] {0, 1, 0, -1}, new int[] {1, 0, -1, 0}, "RGRG"),
				Arguments.of(0, new int[] {0, 1, 0, -1}, new int[] {1, 0, -1, 0}, "GGGG"),
				Arguments.of(0, new int[] {0, 1, 0, -1}, new int[] {1, 0, -1, 0}, "RRRR"),
				Arguments.of(0, new int[] {0, 1, 0, -1}, new int[] {1, 0, -1, 0}, "GGGR"),
				Arguments.of(0, new int[] {0, 0, 0, 0, 0}, new int[] {1, 2, 3, 4, 5}, "RRRRR"),
				Arguments.of(0, new int[] {-20000}, new int[] {20000}, "G"));
	}

	@ParameterizedTest
	@MethodSource
	void test_balance(int E, int[] X, int[] Y, String colors) {
		assertEquals(E, testObject.solution(X, Y, colors));
	}

	static Stream<Arguments> test_balance() {
		return Stream.of( //
				Arguments.of(4, new int[] {4, 0, 2, -2}, new int[] {4, 1, 2, -3}, "RGRG"), //
				Arguments.of(4, new int[] {4, 0, 2, -2}, new int[] {4, 1, 2, -3}, "GRGR") //
		);
	}

	@ParameterizedTest
	@MethodSource
	void test_imbalance(int E, int[] X, int[] Y, String colors) {
		assertEquals(E, testObject.solution(X, Y, colors));
	}

	static Stream<Arguments> test_imbalance() {
		return Stream.of( //
				Arguments.of(0, new int[] {4, 0, 2, -2}, new int[] {4, 1, 2, -3}, "RRRR"), //
				Arguments.of(0, new int[] {4, 0, 2, -2}, new int[] {4, 1, 2, -3}, "GGGG") //
		);
	}

	@ParameterizedTest
	@MethodSource
	void test_bug(int E, int[] X, int[] Y, String colors) {
		assertEquals(E, testObject.solution(X, Y, colors));
	}

	static Stream<Arguments> test_bug() {
		return Stream.of( //
				Arguments.of(6, new int[] {1, 1, 2, 3, 4, 6, 1, 2, 2, 3, 3, 4, 5},
						new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, "GGGGGGRRRRRRR"));
	}
}
