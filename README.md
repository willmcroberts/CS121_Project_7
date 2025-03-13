# Java Number Guesser w/ Computer "Guesser"
```
Create a number guesser that allows the user to try and guess a random number
and a number guesser that allows the computer to guess a number made by the user
```

## Algorithm

```
void main()
string menu()
void humanGuesser()
void computerGuesser()
```

### main()
```
Calls Menu()

gets return value from Menu()
calls hummanGuesser() if 1 
calls computerGuesser() if 2


compare values with .equals()
while(keepGoing):
	if return value == 0:
		Quit
	if return value == 1:
		HumanGuesser()
	if return value == 2:
		computerGuesser()
```

### menu()
```
print:
	0) Quit
	1) Human Guesser
	2) Computer Guesser

input num as string
return num to main
```

### humanGuesser()
```
Generate a random number between 0 and 99
Get user input as guess
Say if it too high, too low, or correct
```

### computerGuesser()
```
gives a computer "guess"
gets user input, if the computer is too low, too high, or correct

max = 99
min = 0
while(keepGoing):
	guess = (max + min) / 2
	if guess is too low:
		min = guess
	elif guess is too high:
		maax = gess
	else:
		keepGoing = false
```
