Example of RPG using Java. 

You can extend elements by implementing interfaces GameCharacter, Food and Weapon. 

To create new maps, you just need to create new yml files describing the maps e put it into the resources/maps folder. 

To run, you need Maven and Java 8 installed; type "mvn clean package" command to build and, then, in the target folder, type "java -jar rpg-game-0.0.1.jar".

To see test coverage, run "mvn cobertura:cobertura"; it will be generated a html report in the folder target/site/cobertura.