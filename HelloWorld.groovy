class HelloWorld {
    static void main(String[] args) {
        Person johnDoe = new Person("John", "Doe", 40)
        Person maryHill = new Person("Mary", "Hill", 30)
        Person thomasMarks = new Person("Thomas", "Marks", 21)

        // Create a new list of persons
        def allPersons = [johnDoe, maryHill, thomasMarks]

        // Querying Collections
        assert allPersons instanceof java.util.List
        assert allPersons.size() == 3
        assert allPersons[2] == thomasMarks

        // Iterate over elements
        allPersons.each {
            println it
        }

        // Iterate over elements and using an index
        allPersons.eachWithIndex { person, index ->
            println index + ": " + person
        }

        // Filtering a specific element
        assert allPersons.find { it.lastName == 'Hill' } == maryHill

        // Transforming elements into something else
        assert allPersons.collect { it.age <= 30 } == [false, true, true]

        // Sorting elements based on a criterion
        assert allPersons.sort { it.age } == [thomasMarks, maryHill, johnDoe]
    }
}

// Previous Learning Notes

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