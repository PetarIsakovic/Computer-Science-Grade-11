# Instructions  

 This question came from the 2023 Canadian Computing Competition from the University of Waterloo

## Problem Description

In the game, Deliv-e-droid, a robot droid has to deliver packages while avoiding obstacles. At the end of the game, the final score is calculated based on the following point system:

- Gain 50 points for every package delivered.
- Lose 10 points for every collision with an obstacle.
- Earn a bonus 500 points if the number of packages delivered is greater than the number of collisions with obstacles.

Your job is to determine the final score at the end of a game.

### Input Specification

The input will consist of two lines. The first line will contain a non-negative integer P, representing the number of packages delivered. The second line will contain a non-negative integer C, representing the number of collisions with obstacles.

### Output Specification

The output will consist of a single integer F, representing the final score.

<br>

### Sample Input 1

```5```

```2```

### Output for Sample Input 1

730

### Explanation of Output for Sample Input 1

There are 5 packages delivered, so 5 × 50 = 250 points are gained. There are 2 collisions, so 2 × 10 = 20 points are lost. Since 5 > 2, a bonus 500 points are earned. Therefore, the final score is 250 − 20 + 500 = 730.

<br>

### Sample Input 2

```0```

```10```

### Output for Sample Input 2

-100

### Explanation of Output for Sample Input 2

There are 0 packages delivered, so 0 × 50 = 0 points are gained. There are 10 collisions, so 10 × 10 = 100 points are lost. Since 0 ≤ 10, no bonus points are earned. Therefore, the final score is 0 − 100 + 0 = −100.