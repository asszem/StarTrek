package StarTrek;

import java.lang.reflect.Method;

/**
 *
 * @author Andras Olah (olahandras78@gmail.com)
 */
public class Parancsok {

	public static void help() {
		System.out.println("Kiírja a választható parancsokat");
		Method[] metodusok = Parancsok.class.getDeclaredMethods();
		for (Method m : metodusok) {
			int pont = m.toString().lastIndexOf(".");
			String str = m.toString();
			System.out.println(str.substring(pont + 1));

		}

	}

	public static void gluglu() {

	}
}
