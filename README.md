# Number Guessing Game (Java)

A console-based **Number Guessing Game** built in **Java**, where players try to guess a randomly generated number between **1 and 100**. The game tracks attempts, awards points based on performance, and measures the total time taken to guess correctly.

---

## About This Project

This is a **beginner-friendly Java project** with **no frameworks or external libraries**, making it easy to understand and implement for newcomers.  
It helped me **practice core Java concepts**, such as loops, conditionals, user input, random number generation, and basic game logic.  
Even as a simple console program, it provides a **fun and interactive way to improve problem-solving skills**.  

---

## Features

- Random number generation between 1 and 100.  
- User input for guesses using the Scanner class.  
- Feedback for each guess:  
  - `"High"` if the guess is too high  
  - `"Low"` if the guess is too low  
  - `"Correct"` if the guess matches the number  
- Maximum of 5 attempts per game.  
- **Score system** based on the number of attempts:  
  - 1st attempt → 100 points  
  - 2nd attempt → 70 points  
  - 3rd attempt → 50 points  
  - 4th attempt → 30 points  
  - 5th attempt → 10 points  
- **Timer** to track total time taken.  
- Displays a message if the user exceeds the maximum attempts.  

---

## How to Play

1. Run the program in a Java environment (JDK required).  
2. Enter your guesses when prompted.  
3. Try to guess the number in as few attempts as possible to earn a higher score.  
4. Check your total score and time taken at the end of the game.  

---

## Technologies Used

- Java (Core)  
- Scanner class for input  
- Math.random() for random number generation  

---

## Example Output
Enter Number From 1-100: 
45
Low
Enter Number From 1-100: 
84
The Number Matches Correctly
Score = 70
Total Score: 70
Time taken: 7.723 seconds
