package ua.cats

import grails.converters.JSON

/**
 * Created by Cheb on 28.03.14.
 */
class PersonMarshaler {
    void register() {
        JSON.registerObjectMarshaller( Person) { Person person ->
            return [
                    id : person.id,
                    city : person.city,
                    email : person.email,
                    familyName : person.familyName,
                    nick : person.nick,
                    phoneNumber : person.phoneNumber,
                    photo : person.photo,
                    rating : person.rating,
                    username : person.username
            ]
        }
    }
}
