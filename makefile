run: NumGuess.class
	java NumGuess

prog: NumGuess.java
	javac -g NumGuess.java

clean:
	rm *.class

debug:
	jdb NumGuess.class
