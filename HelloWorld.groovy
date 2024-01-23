class HelloWorld {
  static void main(String[] args) {
    println "Hello World! 🌎"

    // Define a typed variable
    int age = 20

    // Print variable value
    println age

    // Print variable type
    println age.getClass()

    // Define a variable with dynamic typing
    def name = "Jane"

    // Print variable value
    println name

    // Print variable type
    println name.getClass()

    // Create new Person class and instantiate it
    Person janeSmith = new Person()
    janeSmith.setFirstName("Jane")
    janeSmith.setLastName("Smith")
    janeSmith.setAge(20)

    // Print the full name and age of the Person instance
    println janeSmith.getFullName()
    println janeSmith.getAge()

        // Identify if Person is middle-aged using a conditional
    if (janeSmith.getAge() >= 45 && janeSmith.getAge() <= 65) {
      println janeSmith.getFullName() + " is middle-aged"
    } else {
      println janeSmith.getFullName() + " is " + janeSmith.getAge() + " years old"
    }

    // Define a list of Persons
    def persons = [janeSmith, new Person(firstName: "Mary", lastName: "Johnson", age: 40)]

    // Iterate over Person instances in list
    for (Person p : persons) {
      println p.getFullName()
    }    
  }
}