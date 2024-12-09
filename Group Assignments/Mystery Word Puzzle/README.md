
# Hangman Game

## Description
This project is a classic implementation of the Hangman game written in Java. The game utilizes a predefined word list, allowing players to guess letters to complete the hidden word. It features core game mechanics such as tracking incorrect guesses and revealing correct letters.

## Authors
- **Ian Lundy**
- **Jan Salafia**

## How It Works
### Class Overview
1. **`WordReader`**
   - Handles the reading and processing of words from the file `basic_english_850.txt`.
   - Ensures the game has a diverse selection of words for each playthrough.

2. **`Hangman`**
   - Implements the core game logic, such as tracking guessed letters, checking for game completion, and managing game state (e.g., win/lose conditions).

3. **`Main`**
   - Serves as the entry point of the program.
   - Facilitates interaction between the user and the game by utilizing the `Hangman` and `WordReader` classes.

### Resource File
- **`basic_english_850.txt`**
  - Contains a list of words used in the game.
  - Loaded by the `WordReader` class to supply words for gameplay.

## Features
- Random word selection from a predefined list.
- Tracks guessed letters and displays the current state of the word.
- Provides feedback for incorrect guesses and limits the number of attempts.

Enjoy playing this timeless game while exploring Java programming concepts!
