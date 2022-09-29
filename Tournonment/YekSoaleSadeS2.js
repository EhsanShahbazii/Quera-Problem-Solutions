var readline = require("readline");
var rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
  terminal: false,
});

rl.on("line", function (line) {
  var tmp = line.split(" ");
  n = parseInt(tmp[0]);

  for (let i = 0; i < n; i++) {
    console.log("man khoshghlab hastam");
  }
});

// </Ctrl+Z>
