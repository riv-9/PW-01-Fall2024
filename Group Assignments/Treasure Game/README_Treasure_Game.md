
# Treasure Map Adventure Game

## Description
The Treasure Map Adventure Game is a text-based Java game that takes players on an exciting treasure hunt across various locations. Players explore locations, choose actions, and uncover hints, riches, and hidden treasures. The game is designed to be engaging with randomized outcomes and a dynamic storyline.

## Authors
- **Michael Considine**
- **Erin Goodling**
- **Ryan Woodzell**

## How It Works

### **Core Functionalities**
1. **Explore Locations**:
   - Players start in a random location and can choose actions to perform.
   - Locations include:
     - Beach
     - Mountain
     - Cave
     - Ocean

2. **Perform Actions**:
   - Each location offers unique actions like "Dig in the sand" or "Inspect the glowing rock."
   - Actions lead to outcomes such as discovering clues, treasures, or even monsters.

3. **Find the Treasure**:
   - Players aim to uncover the ultimate treasure hidden on the island.
   - The game ends when the treasure is found or all locations are explored.

4. **Dynamic Storyline**:
   - Outcomes of actions influence the next steps, guiding players to new locations or keeping them in the current one.

### **Key Components**
- **Locations and Actions**:
  - Managed using a `HashMap<String, ArrayList<String>>`, where each location maps to a list of possible actions.
- **Outcomes**:
  - Defined using a `HashMap<String, String>`, mapping actions to outcomes (e.g., "Find the summit" → "You find a treasure chest on top of the mountains.").
- **Visited Locations**:
  - Tracked using a `HashSet<String>` to ensure each location is explored.

## Example Gameplay
1. **Start the Game**:
   - A random location is assigned, e.g., "You are at the Beach."
2. **Choose Actions**:
   - Example:
     ```
     1. Look under the palm tree
     2. Dig in the sand
     3. Walk along the shore
     4. Head north
     ```
   - Enter a choice, and the corresponding outcome is displayed.
3. **Uncover Clues**:
   - Example outcome: "You found a map pointing to the Mountain!"
4. **Find the Treasure**:
   - Example: "You find a treasure chest on top of the mountains. Congratulations!"

## Features
- Randomized starting location for replayability.
- Engaging text-based interface with interactive choices.
- Diverse locations and unique outcomes for each action.
- Dynamic game flow based on user actions and discovered clues.

Embark on an adventurous treasure hunt and discover the hidden riches of Aboo Island!
