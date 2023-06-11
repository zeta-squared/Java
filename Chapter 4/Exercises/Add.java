public class Add {
	public static Object add(Object first, Object second) {
		if (first instanceof Number fNumber && second instanceof Number sNumber) {
			return fNumber.doubleValue() + sNumber.doubleValue();
		} else if (first instanceof Boolean fBoolean && second instanceof Boolean sBoolean) {
			if (fBoolean.booleanValue() == true || sBoolean.booleanValue() == true)
				return Boolean.TRUE;
		} else {
			return first.toString() + second.toString();
		}
	}
}
