# Java Control Structures

## Description

In this lab we practice Java control structures:

- regular `for` loop
- `if` / `else if` / `else`

We use them in two helper classes named `Grade` and `FizzBuzz`.

## Control Structures

### Regular For Loop

```java
// 🇺🇸 grades  <==> 🇫🇷 notes (d'un exam par ex)

double[] grades = {9, 12, 15, 17.5};

// grades[0]     // ==> 9
// grades[1]     // ==> 12
// grades[2]     // ==> 15
// grades[3]     // ==> 17.5

// grades.length // ==> 4

// Loop over each element of the `grades` array from 0 up to 4
for (int index = 0;  index < grades.length;  index++) {
    System.out.println( grades[index]);
}
```

Let's break down the control structure.
The `for` control structure contains 3 instructions. 
Let s call them `A`, `B` , and `C` for short.
They are separated by a semicolon (`;`), and are between parentesis: `(A; B; C)`.

```java
for (A; B; C) {
    // Do something with each loop cycle
}
```

Let's break down what the `for` loop does behind the curtain
The above `for` loop is equivalent to this `while` loop:

```java
A;
while (B) {
    // Do something with each loop cycle
    C;
}
```


- `A;`  
  Run the `A` instruction **once** when entering the loop for the very first time. 
  A common use case is to use `A` to initialize something (like an array index).
- `while (B == true) { ...}`  
  while the `B` instruction evaluates to `true`, then execute the instructions between the curly braces `{ ... }`.
  `B` is a boolean condition. The loop continues as long as `B` is true.
- `// Do something with each loop cycle`
  This denotes the instructions that you run each time you enter the loop.
- `C;`   
  Run the `C` instruction at the end of each loop cycle.
  A common use case for `C` is to increment an array index.
  or make any change so that we do not end up in an infinite loop, 
  and `B` becomes false when expected.

Remmber our initial `for` loop?

```java
for (int index = 0;  index < grades.length;  index++) {
    System.out.println( grades[index]);
}
```

Now, here is the `while` equivalent:

```java
int index = 0;

while (index < grades.length) {
    System.out.println( grades[index]);
    index++;
}
```

### Foreach Loop

The foreach loop iterates over an array
```java
int[] numbers = {1,2,3,4,5};

for (int number: numbers) {
    System.out.println(number);
}
```

This is equivalent to:

```java
int number;

for (int i=0; i < numbers.length; i++) {
    number = numbers[i];
    System.out.println(number);  
}
```