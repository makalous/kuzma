package pl.makalous.sierpien.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.makalous.sierpien.mvc.model.Team;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TeamService {
    private List<Team> teams;

    @Autowired
    TeamService(List<Team> teams) {
        this.teams = teams;
    }

    public List<Team> getById(int id) {
        if (teams.size() < 1) return List.of(Team.builder().build());
        return teams.stream().filter(p -> p.getId() == id).collect(Collectors.toList());
    }

    public void setTeam(Team e) {
        teams.add(e);
    }

    public void updateName(int id, String name) {
        teams.stream().filter(p->p.equals(getById(id).get(0))).findAny().get().setName(name);
    }
}
