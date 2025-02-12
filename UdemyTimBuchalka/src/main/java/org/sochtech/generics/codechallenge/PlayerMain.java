package org.sochtech.generics.codechallenge;

import org.sochtech.generics.FootballPlayer;

public class PlayerMain
{
    public static void main(String[] args)
    {
        League<Team<FootballPlayer>> footballLeague = new League<>("AFL");
        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        Team<FootballPlayer> hawthorne = new Team<>("Hawthorne");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");
        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");

        hawthorne.matchResult(fremantle, 1, 0);
        hawthorne.matchResult(adelaideCrows, 3, 8);
        adelaideCrows.matchResult(fremantle, 2, 1);

        footballLeague.add(adelaideCrows);
        footballLeague.add(melbourne);
        footballLeague.add(hawthorne);
        footballLeague.add(fremantle);

        footballLeague.showLeagueTable();
    }
}
