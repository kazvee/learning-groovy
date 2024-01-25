class HelloWorld {
    static void main(String[] args) {
        // Create a file and populate contents
        File textFile = new File("resources/mary-hill.txt")
        textFile.withWriter('UTF-8') { writer ->
            writer.writeLine("Mary")
            writer.writeLine("Hill")
            writer.writeLine("30")
        }

        // Appending contents to a file
        textFile.append("1")
        textFile << "2"

        // Serializing an object to a file
        Person thomasMarks = new Person("Thomas", "Marks", 21)
        File binFile = new File("resources/thomas-marks.bin")

        binFile.withObjectOutputStream { out ->
            out.writeObject(thomasMarks)
        }
    }
}

// Previous Learning Notes

// class HelloWorld {
//     static void main(String[] args) {
//         Person janeSimons = new Person()

//         // Read full contents of file
//         File file = new File("resources/jane-simons.txt")
//         String content = file.getText('UTF-8')
//         println content

//         // Iterate over each line of file
//         file.eachLine { line, no ->
//             if (no == 1) {
//                 janeSimons.setFirstName(line)
//             } else if (no == 2) {
//                 janeSimons.setLastName(line)
//             } else if (no == 3) {
//                 janeSimons.setAge(line.toInteger())
//             } else {
//                 throw new RuntimeException("☹️ Error: A person text file should only have 3 lines")
//             }
//         }

//         println janeSimons
//     }
// }

// class HelloWorld {
//     static void main(String[] args) {
//         Person johnDoe = new Person("John", "Doe", 40)
//         Person maryHill = new Person("Mary", "Hill", 30)
//         Person thomasMarks = new Person("Thomas", "Marks", 21)

//         // Create a new list of persons
//         def allPersons = [johnDoe, maryHill, thomasMarks]

//         // Querying Collections
//         assert allPersons instanceof java.util.List
//         assert allPersons.size() == 3
//         assert allPersons[2] == thomasMarks

//         // Iterate over elements
//         allPersons.each {
//             println it
//         }

//         // Iterate over elements and using an index
//         allPersons.eachWithIndex { person, index ->
//             println index + ": " + person
//         }

//         // Filtering a specific element
//         assert allPersons.find { it.lastName == 'Hill' } == maryHill

//         // Transforming elements into something else
//         assert allPersons.collect { it.age <= 30 } == [false, true, true]

//         // Sorting elements based on a criterion
//         assert allPersons.sort { it.age } == [thomasMarks, maryHill, johnDoe]
//     }
// }

// class HelloWorld {
//     static void main(String[] args) {
//         Person johnDoe = new Person()
//         johnDoe.setFirstName("John")
//         johnDoe.setLastName("Doe")
//         johnDoe.setAge(40)

//         // Create Closure that prints String representation of a person
//         Closure personToString = { Person person ->
//             println person.toString()
//         }

//         // Create Closure that prints full name of a person
//         Closure personFullName = { Person person ->
//             println person.firstName + " " + person.lastName
//         }

//         // Pass Closure to a method and execute it
//         handlePerson(personToString, johnDoe)
//         handlePerson(personFullName, johnDoe)
//     }

//     static void handlePerson(Closure c, Person p) {
//         if (p == null) {
//             throw new RuntimeException("A person instance cannot be null")
//         }

//         c(p)
//     }
// }

// class HelloWorld {
//     static void main(String[] args) {
//         Person johnDoe = new Person()
//         johnDoe.setFirstName("John")
//         johnDoe.setLastName("Doe")
//         johnDoe.setAge(40)

//         assert johnDoe.toString() == "Person(John, Doe, 40)"
//         assert johnDoe.equals(johnDoe)
//         assert !johnDoe.equals(new Person(firstName: "Mary", lastName: "Hill", age: 30))
//         assert new Person("Mary", "Hill", 30).toString() == "Person(Mary, Hill, 30)"
//     }
// }

// class HelloWorld {
//     static void main(String[] args) {
//         println "Hello World! 🌎"

//         // Define a typed variable
//         int age = 20

//         // Print variable value
//         println age

//         // Print variable type
//         println age.getClass()

//         // Define a variable with dynamic typing
//         def name = "Jane"

//         // Print variable value
//         println name

//         // Print variable type
//         println name.getClass()

//         // Create new Person class and instantiate it
//         Person janeSmith = new Person()
//         janeSmith.setFirstName("Jane")
//         janeSmith.setLastName("Smith")
//         janeSmith.setAge(20)

//         // Print the full name and age of the Person instance
//         println janeSmith.getFullName()
//         println janeSmith.getAge()

//         // Identify if Person is middle-aged using a conditional
//         if (janeSmith.getAge() >= 45 && janeSmith.getAge() <= 65) {
//             println janeSmith.getFullName() + " is middle-aged"
//         } else {
//             println janeSmith.getFullName() + " is " + janeSmith.getAge() + " years old"
//         }

//         // Define a list of Persons
//         def persons = [janeSmith, new Person(firstName: "Mary", lastName: "Johnson", age: 40)]

//         // Iterate over Person instances in list
//         for (Person p : persons) {
//             println p.getFullName()
//         }

//         // Catch unchecked exception and handle it by printing a message
//         try {
//             // Convert a String into a Long data type
//             janeSmith.getFirstName().toLong()
//         } catch (NumberFormatException e) {
//             assert e instanceof NumberFormatException
//             println "☹️ Error: Cannot convert a String into a Long"
//         }

//         // Create new Person class and instantiate it
//         Person maryHill = new Person()
//         maryHill.setFirstName("Maryann")
//         maryHill.setLastName("Hill")
//         maryHill.setAge(40)

//         // Use dropRight method to remove the last 3 characters
//         println maryHill.getFirstName().dropRight(3)
//     }
// }