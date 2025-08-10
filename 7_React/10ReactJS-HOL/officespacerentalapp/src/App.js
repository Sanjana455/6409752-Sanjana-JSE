import React from 'react';
import './App.css';

function App() {
  const element = "Office Space";
  const sr = "https://via.placeholder.com/150"; // replace with actual image link

  const officeList = [
    { Name: "DBS", Rent: 50000, Address: "Chennai" },
    { Name: "WeWork", Rent: 75000, Address: "Bangalore" },
    { Name: "Regus", Rent: 60000, Address: "Mumbai" }
  ];

  return (
    <div className="App">
      <h1>{element}, at Affordable Range</h1>
      <img src={sr} width="25%" height="25%" alt="Office Space" />

      {officeList.map((item, index) => {
        let colors = [];
        if (item.Rent <= 60000) {
          colors.push('textRed');
        } else {
          colors.push('textGreen');
        }

        return (
          <div key={index}>
            <h1>Name: {item.Name}</h1>
            <h3 className={colors.join(' ')}>Rent: Rs. {item.Rent}</h3>
            <h3>Address: {item.Address}</h3>
          </div>
        );
      })}
    </div>
  );
}

export default App;
