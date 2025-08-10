import React, { useState } from "react";

function CurrencyConvertor() {
  const [amount, setAmount] = useState("");
  const [currency, setCurrency] = useState("Euro");

  const handleSubmit = (e) => {
    e.preventDefault();
    if (currency === "Euro") {
      let converted = amount * 80; // Example: 1 Euro = 80 INR
      alert(`Converting to ${currency}. Amount is ${converted}`);
    }
  };

  return (
    <div>
      <h2 style={{ color: "green" }}>Currency Convertor!!!</h2>
      <form onSubmit={handleSubmit}>
        <div>
          <label>Amount: </label>
          <input
            type="number"
            value={amount}
            onChange={(e) => setAmount(e.target.value)}
          />
        </div>
        <div>
          <label>Currency: </label>
          <select
            value={currency}
            onChange={(e) => setCurrency(e.target.value)}
          >
            <option value="Euro">Euro</option>
          </select>
        </div>
        <button type="submit">Submit</button>
      </form>
    </div>
  );
}

export default CurrencyConvertor;
