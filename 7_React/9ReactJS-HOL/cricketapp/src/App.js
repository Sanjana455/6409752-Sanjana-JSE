import React from 'react';
import ListofPlayers from './components/ListofPlayers';
import ScoreBelow70 from './components/ScoreBelow70';
import { OddPlayers } from './components/OddPlayers';
import { EvenPlayers } from './components/EvenPlayers';
import ListofIndianPlayers from './components/ListofIndianPlayers';

export default function App() {
  const players = [
    { name: "Virat", score: 80 },
    { name: "Rohit", score: 65 },
    { name: "Dhawan", score: 72 },
    { name: "Pant", score: 60 },
    { name: "Iyer", score: 50 },
    { name: "Hardik", score: 90 },
    { name: "Jadeja", score: 68 },
    { name: "Ashwin", score: 55 },
    { name: "Bumrah", score: 85 },
    { name: "Shami", score: 45 },
    { name: "Siraj", score: 78 }
  ];

  const T20Players = ["First Player", "Second Player", "Third Player"];
  const RanjiTrophyPlayers = ["Fourth Player", "Fifth Player", "Sixth Player"];
  const IndianPlayers = [...T20Players, ...RanjiTrophyPlayers];

  const IndianTeam = ["First", "Second", "Third", "Fourth", "Fifth", "Sixth"];

  let flag = false; // ⬅ For the "flag=false" output

  if (flag === true) {
    return (
      <div>
        <h1>List of Players</h1>
        <ListofPlayers players={players} />
        <hr />
        <h1>List of Players having Scores Less than 70</h1>
        <ScoreBelow70 players={players} />
      </div>
    );
  } else {
    return (
      <div>
        <div>
          <h1>Indian Team</h1>

          <h1>Odd Players</h1>
          {/* Passing array directly to match screenshot structure */}
          {OddPlayers(IndianTeam)}

          <hr />

          <h1>Even Players</h1>
          {EvenPlayers(IndianTeam)}
        </div>

        <hr />

        <div>
          <h1>List of Indian Players Merged:</h1>
          <ListofIndianPlayers IndianPlayers={IndianPlayers} />
        </div>
      </div>
    );
  }
}
