import java.util.*;

//Treasure Hunt Project
//Michael Considine, Erin Goodling, and Ryan Woodzell

public class TreasureGame {
    public void run () {
        HashMap<String, ArrayList<String>> locations = new HashMap<String, ArrayList<String>>();
        locations.put("Beach", new ArrayList<>(Arrays.asList("Look under the palm tree", "Dig in the sand", "Walk along the shore", "Head north")));
        locations.put("Mountain", new ArrayList<>(Arrays.asList("Find the summit", "Search the bushes", "Go into the hut", "Walk to the Ocean", "Enter a Cave")));
        locations.put("Cave", new ArrayList<>(Arrays.asList("Inspect the glowing rock", "There is a fork in the road, take the right path", "Take the left path","Mine some rock", "Take the high road to the Mountains")));
        locations.put("Ocean", new ArrayList<>(Arrays.asList("Look at the sea turtles", "Investigate for mermaids", "Look for cool seashells", "Look up high")));

        // Configure outcomes for each action
        HashMap<String, String> outcomes = new HashMap<>();
        outcomes.put("Look under the palm tree", "You found a map pointing to the Mountain!");
        outcomes.put("Dig in the sand", "You found a golden coin!");
        outcomes.put("Walk along the shore", "You discovered an old boat washed ashore.");
        outcomes.put("Find the summit", "You find a treasure chest on top of the mountains. Congratulations!");
        outcomes.put("Search the bushes", "You found an old compass.");
        outcomes.put("Go into the hut", "The hut is empty.");
        outcomes.put("Inspect the glowing rock", "You uncovered a gemstone and clues to gold. CLUE: The pirate's booty is where air is thin.");
        outcomes.put("There is a fork in the road, take the right path", "The right path leads you to a hidden Ocean cave. You see beautiful mermaids and mermen.");
        outcomes.put("Mine some rock", "You discovered ancient carvings hinting at vast riches. The carvings show a chest floating in the sky.");
        outcomes.put("Look at the sea turtles", "You found a bottle with a pirates map inside! The map is hard to read, but their is an X drawn in the clouds.");
        outcomes.put("Investigate for mermaids", "You heard whispers pointing to the Cave.");
        outcomes.put("Look for cool seashells", "You found a rare shell with a message inside! MESSAGE: You will have good fortune for the next year!");
        outcomes.put("Take the left path", "You find a grotesque monster. Run to the Beach!");
        outcomes.put("Walk to the Ocean", "You take the scenic route to the Beach");
        outcomes.put("Enter a Cave", "You walk into a musty and mysterious Cave.");
        outcomes.put("Take the high road to the Mountains", "You walk up a steep hill to the Mountain.");
        outcomes.put("Head north", "You go on a scenic hike, and find yourself near the top of the Mountain.");
        outcomes.put("Look up high", "You see the mountains and start ascending the tallest Mountain.");

        // Start the game
        playGame(locations, outcomes);
    }
    private void playGame(HashMap<String, ArrayList<String>> locations, HashMap<String, String> outcomes) {
        Scanner scanner = new Scanner(System.in);
        Set<String> visitedLocations = new HashSet<>();
        Random random = new Random();

        String currentLocation = randomLocation(locations.size());

        System.out.println("Welcome to the Treasure Map Adventure Game!");
        System.out.println("You are an adventurer, and have heard of a mysterious island named Aboo, and recently journeyed to the island in search of fabled vast riches and treasure.");

        while (true) {
            // Display current location and options
            System.out.println("\nYou are at the " + currentLocation + ".");
            visitedLocations.add(currentLocation);

            ArrayList<String> options = locations.get(currentLocation);
            for (int i = 0; i < options.size(); i++) {
                System.out.println((i + 1) + ". " + options.get(i));
            }

            // Get user's choice
            System.out.print("Choose an action (1-" + options.size() + "): ");
            int choice = scanner.nextInt();
            String chosenAction = options.get(choice - 1);

            // Display outcome
            System.out.println("\n" + chosenAction + "...");
            String outcome = outcomes.getOrDefault(chosenAction, "Nothing happened.");
            System.out.println(outcome);

            // Check for treasure or hints for new locations
            if (outcome.contains("treasure")) {
                System.out.println("You found the treasure! Game Over!");
                break;
            } else if (outcome.contains("Mountain")) {
                currentLocation = "Mountain";
            } else if (outcome.contains("Cave")) {
                currentLocation = "Cave";
            } else if (outcome.contains("Ocean")) {
                currentLocation = "Ocean";
            } else if(outcome.contains("Beach")){
                currentLocation = "Beach";
            }
            else {
                System.out.println("You stay at the " + currentLocation + ".");
            }

            // Check if all locations have been visited
            if (visitedLocations.size() == locations.size() && !outcome.contains("treasure")) {
                System.out.println("You've explored all locations, but no treasure found. Game Over!");
                break;
            }
        }

        scanner.close();
    }
    public String randomLocation(int n) {

        //randomly generate starting location
        Random random = new Random();
        int randomLocation = random.nextInt(n);

        if (randomLocation == 0) {
            return "Beach";
        }
        if (randomLocation == 1) {
            return "Mountain";
        }
        if (randomLocation == 2) {
            return "Cave";
        }
        if (randomLocation == 3) {
            return "Ocean";
        }
        return "Unknown";
    }
    public static void main(String[] args) {
        //create game
        TreasureGame game = new TreasureGame();
        //run game
        game.run();
    }
}
