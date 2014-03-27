package ua.cats

import grails.converters.JSON
import grails.plugin.springsecurity.annotation.Secured

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional


class AnnouncementController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    @Secured(['ROLE_USER'])
    def index() {
        render Announcement.list() as JSON
    }

    def show(Announcement announcementInstance) {
        respond announcementInstance
    }

    def create() {
        respond new Announcement(params)
    }
}