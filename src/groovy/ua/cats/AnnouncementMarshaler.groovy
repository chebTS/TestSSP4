package ua.cats

import grails.converters.JSON

/**
 * Created by Cheb on 28.03.14.
 */
class AnnouncementMarshaler {
    void register() {
        JSON.registerObjectMarshaller( Announcement) { Announcement announcement ->
            return [
                    id : announcement.id,
                    name : announcement.name,
                    cat_id : announcement.category.id,
                    lat : announcement.lat,
                    lng : announcement.lng,
                    is_lost : announcement.isLost,
                    photo : announcement.photo,
                    date : announcement.dateCreated,
                    description : announcement.description
            ]
        }
    }
}
