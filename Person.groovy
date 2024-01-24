import groovy.transform.ToString

@ToString
class Person {
    String firstName
    String lastName
    int age
}

// Previous Learning Notes

// import groovy.transform.Canonical
// import groovy.transform.ToString
// import groovy.transform.EqualsAndHashCode
// import groovy.transform.TupleConstructor

// Declare convenience annotations on class-level
// @Canonical
// The Canonical annotation aggregates the functionality of these other annotations:
// @ToString
// @EqualsAndHashCode
// @TupleConstructor

// class Person {
//     String firstName
//     String lastName
//     int age
// }

    // Person() {
    // }

    // Person(String firstName, String lastName, int age) {
    //     this.firstName = firstName
    //     this.lastName = lastName
    //     this.age = age
    // }

  // @Override
  // boolean equals(o) {
  //     if (this.is(o)) {
  //         return true
  //     }
  //     if (!(o instanceof Person)) {
  //         return false
  //     }

  //     Person person = (Person) o

  //     if (age != person.age) {
  //         return false
  //     }
  //     if (firstName != person.firstName) {
  //         return false
  //     }
  //     if (lastName != person.lastName) {
  //         return false
  //     }

  //     return true
  // }

    // @Override
    // int hashCode() {
    //     int result
    //     result = (firstName != null ? firstName.hashCode() : 0)
    //     result = 31 * result + (lastName != null ? lastName.hashCode() : 0)
    //     result = 31 * result + age
    //     return result
    // }

    // @Override
    // String toString() {
    //     return "Person(" +
    //             firstName + ", " +
    //             lastName + ", " +
    //             age +
    //             ")"
    // }

// class Person {
//   String firstName
//   String lastName
//   int age

//   String getFullName() {
//     firstName + ' ' + lastName
//   }
// }