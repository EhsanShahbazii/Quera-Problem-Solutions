import React, { useState } from "react";
import Select from "./Select";
import Input from "./Input";
import { units } from "../units";

function App() {
  const [amount, setAmount] = useState(0);
  const [amount2, setAmount1] = useState(1);
  const [amount1, setAmount2] = useState(1);
  const [result, setResult] = useState(0);

  const showResult = () => {
    setResult(() => {
      return amount * (amount2 / amount1);
    });
  };

  return (
    <>
      <div className="converter-form">
        <Input
          label={"Amount"}
          onChange={(e) => {
            setAmount(e.target.value);
          }}
        />

        <div className="row">
          <Select
            label={"From"}
            items={units}
            onChange={(e) => {
              setAmount1(e.target.value);
            }}
          />
          <Select
            label={"To"}
            items={units}
            onChange={(e) => {
              setAmount2(e.target.value);
            }}
          />
          <button onClick={showResult}>Convert</button>
        </div>
      </div>

      <div id="result">
        Result is: <span data-testid="result">{result}</span>
      </div>
    </>
  );
}

export default App;
