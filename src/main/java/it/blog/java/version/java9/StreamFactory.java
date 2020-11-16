package it.blog.java.version.java9;

import java.util.Arrays;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class StreamFactory {

	public static void main(String[] args) {
		/*
		 * Streams got a couple of additions, in the form of takeWhile, dropWhile, and
		 * iterate methods.
		 */
		String[] stream = Stream.iterate("", s -> s + "s").takeWhile(s -> s.length() < 10).toArray(String[]::new);

		System.out.println(Arrays.toString(stream));
		
		/*
		 * Optionals got the sorely missed ifPresentOrElse method.
		 */
		Optional<String> value = Arrays.stream(stream).findFirst();

		AtomicInteger successCounter = new AtomicInteger(0);
		AtomicInteger onEmptyOptionalCounter = new AtomicInteger(0);

		value.ifPresentOrElse(v -> successCounter.incrementAndGet(), onEmptyOptionalCounter::incrementAndGet);
		
		System.out.println(successCounter);

	}

}
