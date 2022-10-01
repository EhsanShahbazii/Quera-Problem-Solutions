let index_L = 0,
  index_R = 0;
let leftPart = "1",
  rightPart = "1",
  temp = "";

let array = readline().split(" ");
index_L = parseInt(array[0]);
index_R = parseInt(array[1]);

for (let i = 0; leftPart.length < index_R; i++) {
  if (i == 0) {
    leftPart = "10";
    rightPart = "01";
  }

  temp = rightPart.concat(leftPart);
  leftPart = leftPart.concat(rightPart);
  rightPart = temp;
}

console.log(leftPart.substring(index_L - 1, index_R));

// </Ctrl+Z>
