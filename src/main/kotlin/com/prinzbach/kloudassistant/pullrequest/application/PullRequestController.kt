package com.prinzbach.kloudassistant.pullrequest.application

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class PullRequestController {

    @PostMapping("/pullrequest")
    fun prCreated(@RequestBody pullRequestEvent: PullRequestEventDto) {
        println(pullRequestEvent)
    }
}
