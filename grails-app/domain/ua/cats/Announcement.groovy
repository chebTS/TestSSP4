package ua.cats

class Announcement {
    Category category
    String name
    Boolean isLost;
    String photo;
    String description
    Date dateCreated
    Double lat
    Double lng

    static constraints = {
        category nullable: false
        name blank: false, nullable: false
        isLost nullable: true
        photo nullable: true
        description nullable: true
        dateCreated nullable: true
        lat nullable: true
        lng nullable: true
    }
}
