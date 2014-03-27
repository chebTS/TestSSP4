package ua.cats

import grails.converters.JSON
import grails.plugin.springsecurity.annotation.Secured

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

class CategoryController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    @Secured(['IS_AUTHENTICATED_ANONYMOUSLY'])
    def index() {
        render Category.list() as JSON
    }

    def show(Category categoryInstance) {
        respond categoryInstance
    }

    def create() {
        respond new Category(params)
    }

}
