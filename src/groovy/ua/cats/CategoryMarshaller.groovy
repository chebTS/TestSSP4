package ua.cats

import grails.converters.JSON

/**
 * Created by Cheb on 28.03.14.
 */
class CategoryMarshaller {

    void register() {
        JSON.registerObjectMarshaller( Category) { Category category ->
            return [
                    id : category.id,
                    name : category.name,
                    photo : category.photo,
                    description : category.description
            ]
        }
    }
}
