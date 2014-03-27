package ua.cats

import grails.plugin.springsecurity.annotation.Secured

class HelloController {

    @Secured(['ROLE_USER'])
    def index() {
        render "Hello World!"
    }
}
