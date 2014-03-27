package ua.cats

import grails.converters.JSON

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional
import grails.plugin.springsecurity.annotation.Secured

class PersonController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    @Secured(['ROLE_USER'])
    def index() {
        render Person.list() as JSON
//        params.max = Math.min(max ?: 10, 100)
//        respond Person.list(params), model: [personInstanceCount: Person.count()]
    }

    def show(Person personInstance) {
        respond personInstance
    }

    def create() {
        respond new Person(params)
    }

}
