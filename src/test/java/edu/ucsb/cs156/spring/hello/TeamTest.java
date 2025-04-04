package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Test
    public void equals_returns_correct_for_same_object() {
        assertEquals(true, team.equals(team));
    }

    @Test
    public void equals_returns_correct_for_different_class() {
        int diff = 5;
        assertEquals(false, team.equals(diff));
    }

    @Test
    public void equals_returns_correct_for_casted_object() {
        Team similar = new Team("test-team");
        assertEquals(true, team.equals(similar));
        similar.addMember("other");
        assertEquals(false, team.equals(similar));
    }

    @Test
    public void hashCode_test() {
        int result = team.hashCode();
        assertEquals(-1226298695, result);
    }
   
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)

}
