Here is a simple `README.md` for your Tic Tac Toe project. It explains the project, how to run it, and basic usage.

```markdown
# Tic Tac Toe

A simple command-line Tic Tac Toe game implemented in Java.

## Features

- Play Tic Tac Toe in the terminal
- Supports undo functionality
- Customizable board size (default: 3x3)
- Human vs Human gameplay (Bot support is also added)
- Difficulty levels for bot players
- Detects win conditions and draws
- Multiple winning strategies
- Easy to extend for additional features


## Getting Started

### Prerequisites

- Java 8 or above

### Build and Run

1. Clone the repository:
   ```
git clone <your-repo-url>
cd <repo-directory>
   ```

2. Go to the project directory:
   ```
you can run main class from your IDE or use the command line:
   ```
   javac src/main/java/org/lld/tictaktoe/*.java
   java org.lld.tictaktoe.TicTacToeGame
   ```

## How to Play

- The game will prompt each player to enter their move.
- After each move, you can choose to undo the last move.
- The game ends when a player wins or the board is full (draw).

## Project Structure

- `src/main/java/org/lld/tictaktoe/` - Main application code
- `src/main/java/org/lld/tictaktoe/models/` - Game models (Board, Player, Move, etc.)
- `src/main/java/org/lld/tictaktoe/strategies/` - Winning strategies
