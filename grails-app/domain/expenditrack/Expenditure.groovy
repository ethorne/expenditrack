package expenditrack

class Expenditure {

    int id
    double amount
    Category category
    Date created
    String description


    static constraints = {
        id nullable: false
        amount nullable: false
        category nullable: false
        created nullable: false
        description nullable: false, maxSize: 255
    }

    String toString() {
        "\$$amount spent on $category on $created"
    }
}
