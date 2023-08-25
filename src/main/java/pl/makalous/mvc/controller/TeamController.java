package pl.makalous.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.makalous.mvc.model.Team;
import pl.makalous.mvc.service.TeamService;

@RestController
@RequestMapping(path = "/root/team")
public class TeamController {
    private TeamService teamService;

    @Autowired
    TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @RequestMapping(path = "/get", method = RequestMethod.GET)
    public ResponseEntity<String> returnTeam(@RequestParam int id) {
        return ResponseEntity.ok(teamService.getById(id).toString());
    }

    @RequestMapping(path = "/set", method = RequestMethod.POST)
    public ResponseEntity<Boolean> setTeam(@RequestBody Team team) {
        teamService.setTeam(team);
        return ResponseEntity.ok(true);
    }

    @RequestMapping(path = "/patch", method = RequestMethod.PATCH)
    public ResponseEntity<Boolean> updateTeamName(@RequestParam int id, @RequestParam String name) {
        teamService.updateName(id, name);
        return ResponseEntity.ok(true);
    }

    /*@RequestMapping(path = "/put", method = RequestMethod.PUT)
    public ResponseEntity<Boolean> putTeam(@RequestBody Team team) {
        teamService.setTeam(team);
        return ResponseEntity.ok(true);
    }*/
}
