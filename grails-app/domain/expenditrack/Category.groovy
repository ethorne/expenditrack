package expenditrack

class Category {

    int id
    String name

    static constraints = {
        id nullable: false
        name maxSize: 30
    }

    String toString() {
        name
    }
}
