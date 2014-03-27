package util.marshalling

/**
 * Created by Cheb on 28.03.14.
 */
class CustomObjectMarshallers {
    List marshallers = []

    def register() {
        marshallers.each{ it.register() }
    }
}
