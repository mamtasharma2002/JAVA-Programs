//function Is_Even(num){
//  if(num % 2 == 0){
//    return true;
//  }else{
//    return false;
//  }
//}
function Is_Even(num){
  return num % 2 === 0;
}
function factorial(num){
  if(num === 0){
    return 1;
  }
  var result = num;
  for(var i = num-1; i>=1 ;i--){
    result *= i;
  }
  return result;
}
function kebabToSnake(str){
  var newStr =str.replace(/-/g ,"_");
  return newstr;
}
