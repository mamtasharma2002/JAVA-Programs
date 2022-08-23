//create secret number
var secretNumber = 4;
//ask user for Guessing
var guess = prompt("Guess the Number:");
//Check if the guess is Right
if(Number(guess) === secretNumber){
  alert("You Got the Number");
}
// otherwise you guess the wrong
//else{
//  alert("Wrong !");
//
else if (Number(guess) > secretNumber) {
  alert("Too high..... Try again");
}
else{
  alert("Too low...... Try again");
}
