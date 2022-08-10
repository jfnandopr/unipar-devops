package my.grails.app

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class MessageControllerSpec extends Specification implements ControllerUnitTest<MessageController> {

    def setup() {
    }

    def cleanup() {
    }

    void "Test index"() {
        when:"The index action is invoked"
        controller.index()

        then:"Welcome message is returned"
        response.text == 'Welcome Grails App!'
    }
}
