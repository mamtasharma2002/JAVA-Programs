console.log("PRINT ALL THE NUMBERS BETWEEN -10 AND 19");
var counter = -10;
while (counter < 20) {
  console.log(counter);
  counter++;
}

console.log("PRINT ALLTHE EVEN NUMBERS BETWEEN 10 AND 40");
var counter = 10;
while (counter <= 40) {
  console.log(counter);
  counter+=2;
}

console.log("PRINT ALLTHE ODD NUMBERS BETWEEN 100 AND 400");
var counter = 100;
while (counter <= 400) {
  if(counter % 2 !== 0){
  console.log(counter);
  }
  counter+=1;
}
