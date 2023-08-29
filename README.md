# Managing an election campaign during the Corona period

> The project was built in Java


### `Description `
---
The project involves managing an election system during the Corona period in an anonymous country in the Middle East. The goal is to computerize and streamline the system for managing election rounds. The system requires storing data for each election round, including the month and year of the election, the voter register, candidate parties, and ballot boxes. Special types of ballot boxes are introduced, namely Corona polling stations and military polling stations, to handle specific voting scenarios during the pandemic.






### `How It Works` 
---
#### functionalities:

1. Adding a ballot: Enables the addition of a new ballot to the system.
2. Adding a citizen: Allows the inclusion of a new citizen in the voter register.
3. Adding a party: Facilitates the addition of a new political party participating in the election round.
4. Adding a citizen as a candidate: Enables assigning a citizen as a candidate on behalf of a specific party.
5. Displaying all ballot boxes: Shows the details of all the ballot boxes, including their associated citizens and voting percentages.
6. Presentation of all citizens: Displays information about all the citizens registered for voting.
7. Presentation of all parties: Shows details of all the political parties participating in the election.
8. Elections: Initiates the voting process, allowing each citizen to cast their vote and choose a party.
9. Showing election results: Presents the vote counts for each party from each ballot box and the overall total.
<br />

<img width="983" alt="Screenshot 2023-08-29 at 15 31 15" src="https://github.com/tamer98/Election_Campaign_P2/assets/72464761/9375d328-f65b-4762-a454-a5a9e5bd8f94">

<img width="983" alt="Screenshot 2023-08-29 at 15 23 48" src="https://github.com/tamer98/Election_Campaign_P2/assets/72464761/406758d1-48d8-4889-944b-51c86c26adbd"><br />

<img width="983" alt="Screenshot 2023-08-29 at 15 26 47" src="https://github.com/tamer98/Election_Campaign_P2/assets/72464761/db819fb0-0e3e-431e-a2bc-35640a43755a"><br />

### `Updated` 
---
- Citizen's Identity Card Validation:
A validation has been added to ensure that a citizen's identity card has exactly 9 digits.
If a citizen's identity card does not meet this requirement, an exception will be thrown during its creation, and appropriate handling of the exception will be implemented.
- Age Verification:
A new verification step has been introduced to validate the year of birth of a citizen during registration.
The system now checks if the citizen's age is over 18 based on their year of birth.
If a citizen's age is below 18, an exception will be thrown during their creation, and appropriate handling of the exception will be implemented.
- Additional Data for Corona Patients and Soldiers:
The system's implementation has been updated to include the number of days a corona patient has been sick.
For soldiers, a new action called "carryWeapon" has been added to their profile.
- Generic Polling Station:
The implementation now includes a polling station that can handle multiple types of citizens, such as regular citizens, corona patients, and soldiers.
This polling station is defined using a generic type, allowing flexibility in the types of citizens who can vote in it.
- Military-Corona Ballot:
A new type of ballot, called "military-corona ballot," has been introduced.
Only soldiers who are in isolation are allowed to vote using this specific type of ballot.
- Generic Set Data Structure:
A custom implementation of the Set data structure has been created.
The Set data structure maintains the order of insertion and prevents duplicate values.
Although a similar class already exists, you are required to implement it yourself.
The data of all citizens is stored within this Set class.
Any attempt to add an object of an unauthorized type to the Set will result in a compilation error.



### `Main subjects` 
---
- Exceptions: Exception handling is implemented to ensure the validity of citizen data. Exceptions are thrown and appropriately handled during the creation of citizens, such as when the identity card has an incorrect number of digits or when the year of birth indicates that the citizen is under 18 years old.
- Interfaces: A generic polling station interface is introduced, allowing flexibility in handling different types of citizens (regulars, corona patients, and soldiers) who can vote in a polling station. This interface defines the common methods and behavior required for managing the voting process.
- Generics: A generic set data structure is developed to store the citizen data. This set enforces uniqueness of objects and maintains the order of insertion. It is implemented to prevent adding objects of unauthorized types, resulting in compilation errors.



---
### Changes will be made ...


