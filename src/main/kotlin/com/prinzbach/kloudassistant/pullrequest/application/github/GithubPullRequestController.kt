package com.prinzbach.kloudassistant.pullrequest.application.github

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class GithubPullRequestController {

    @PostMapping("/pullrequest")
    fun prCreated(@RequestBody pullRequestEvent: PullRequestEventDto) {
        println(pullRequestEvent)
    }
}
