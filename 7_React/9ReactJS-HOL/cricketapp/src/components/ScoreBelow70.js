import React from 'react';

export default function ScoreBelow70({ players }) {
  // Filter using arrow function ES6
  const players70 = players.filter(item => item.score < 70);

  return (
    <div>
      {players70.map((item) => (
        <div key={item.name}>
          <li>Mr. {item.name} <span>{item.score}</span></li>
        </div>
      ))}
    </div>
  );
}
