package ua.cats

class Category {
    static expose = 'cat'
    static hasMany = [announcement : Announcement]
    String name
    String photo
    String description

    static constraints = {
        name blank: false, unique: true
        photo nullable: true
        description nullable: true
    }
}
