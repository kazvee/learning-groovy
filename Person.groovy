import groovy.transform.Canonical

@Canonical
class Person implements Serializable {
    String firstName
    String lastName
    int age
}

// Previous Learning Notes

// import groovy.transform.Canonical

// @Canonical
// class Person {
//     String firstName
//     String lastName
//     int age
// }
