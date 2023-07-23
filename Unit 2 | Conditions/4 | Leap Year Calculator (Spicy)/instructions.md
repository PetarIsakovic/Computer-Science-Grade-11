# Leap Year Calculator (Spicy)  

A leap year is a year where February has 29 days instead of 28 (an extra day added to the year). This is done to ensure that our normal seasons "stay in sync" with what we expect to see because an actual year is not exactly 365 days but actually 365.25 days. So every 4 years, we need to add in an extra day to make up for the amount we miss every year! 

Create a program that will allow the user to enter in a year and it will determine if that year is a leap year or not. 

While there is no leap year formula, there is a simple algorithm that can be followed to determine if a given year is a leap year or a common year. The algorithm consists of the following steps:

- Check if the year can be divided by 4 without a remainder. If it cannot, it is not a leap year. Otherwise, proceed to the next step.
- Check if the year can be divided by 100 without a remainder. If it cannot, then it is a leap year. Otherwise, proceed to the next step.
- Check if the year can be divided by 400 without a remainder. If it cannot, then it is not a leap year. Otherwise, it is a leap year. 

<br>

## Sample Output 1

Please enter a date to determine if it is a leap year or not

```2000```

2000 is a leap year

<br>

## Sample Output 2

Please enter a date to determine if it is a leap year or not

```1900```

1900 is not a leap year
  