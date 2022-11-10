package io.robusta.team.controller

import io.robusta.team.controller.payload.TeamPayload
import io.robusta.team.service.TeamService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import javax.websocket.server.PathParam

@RestController
class TeamController(
        private val service: TeamService
) {

    @GetMapping("/teams")
    fun listTeams(): List<TeamPayload> {
        return service.getAllTeams().map { TeamPayload(it.name) }
    }

    @GetMapping("/teams/{id}")
    fun teamById(@PathVariable id: Long): TeamPayload {
        return service.getTeamById(id)?.let { TeamPayload(it.name) } ?: throw RuntimeException("Team not found")
    }
}
