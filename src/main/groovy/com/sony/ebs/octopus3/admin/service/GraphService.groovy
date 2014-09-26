package com.sony.ebs.octopus3.admin.service

import groovy.util.logging.Slf4j
import groovyx.net.http.HTTPBuilder
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

/**
 * @author trbabalh
 */
@Component
@Slf4j
@org.springframework.context.annotation.Lazy
class GraphService {

    @Value('${service.repo.fileattr.url}') def fileAttrServiceUrl
    @Value('${service.repo.file.url}') def fileServiceUrl

    def getGraphData() {
        def result = getFileAttributesData()
        result
    }

    def getFileAttributesData() {
        def http = new HTTPBuilder(fileAttrServiceUrl)
        http.request( fileAttrServiceUrl, GET, TEXT ) {
            response.success = { resp, reader ->
                reader.text
            }
        }

    }
}
