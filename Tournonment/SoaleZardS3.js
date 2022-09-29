var readline = require("readline");
var rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
  terminal: false,
});

rl.on("line", function (line) {
  var tmp = line.split(" ");
  n = parseInt(tmp[0]);
  let result = "";

  for (let i = 0; i < n; i++) {
    result += "o";
  }

  console.log(`W${result}w!`);
});

// </Ctrl+Z>
