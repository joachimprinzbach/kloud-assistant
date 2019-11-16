package com.prinzbach.kloudassistant.pullrequest.application

import com.fasterxml.jackson.annotation.JsonCreator

data class PullRequestEventDto@JsonCreator constructor(
        val action: String,
        val number: Number,
        var pull_request: PullRequestDto
)

data class PullRequestDto@JsonCreator constructor(
        val url: String
)
