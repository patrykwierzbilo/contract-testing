package contracts.validate.consumer

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "should return hash of string: getHashOfMe"

    request {
        url "/string/hash/getHashOfMe"
        method GET()
    }

    response {
        status OK()
        headers {
            contentType applicationJson()
        }
        body (
                -2069022349
        )
    }
}
