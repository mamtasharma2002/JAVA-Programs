var todos = ["buy new turtle"];

var input = prompt(" WHAT WOULD YOU LIKE TO DO");

while(input !== "quit"){
  if(input === "list"){
    listTodos();
  }else if (input === "new") {
  addTodo();
  }else if (input === "delete") {
    deleteTodo();
}
  input = prompt(" WHAT WOULD YOU LIKE TO DO");
}
console.log("ok, now you are quit")
function listTodos(){
  console.log("************")
  todos.forEach(function(todo, i ){
  console. log(i +":"+todo);
  });
  console.log("************")
}
function addTodo(){
   var newTodo = prompt("Enter the new todo");
   todos.push(newTodo);
   console.log("Added Todo");
}function deleteTodo(){
  var index = prompt("enter the index of todo to delete");
  todos.splice(index, 0);
  console.log("deleted todo")
}
