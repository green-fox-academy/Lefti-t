<template>
  <div>
    <div v-bind:key="todo.title"  v-for="todo in todos">
 
    <TodoItem id="todo-container" v-bind:todo="todo"
      v-on:itemDeletion="deleteTodo(todo)"  v-on:editing="editTodo($event)" />
    </div>
  </div>
</template>

<script>
import TodoItem from "./TodoItem.vue";



export default {
  name: "Todo",
  components: {
    TodoItem,

  },
  props: ["todos"],
  methods: {
    deleteTodo(todo) {
      const todoIndex = this.todos.indexOf(todo);
      this.todos.splice(todoIndex, 1);
    },
    editTodo(todo,todoEdited){
      const indexedTodo = this.todos.indexOf(todo);
      this.todos[indexedTodo]=todoEdited;
      }
  },

};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h3 {
  margin: 40px 0 0;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
#todo-container {
  margin-left: auto;
  margin-right: auto;
  height: 150px;
  width: 350px;
  border: 2px solid black;
  background: linear-gradient(white, rgb(224, 223, 223) 80%);
  border-radius: 10px;
  margin-top: 25px;
  margin-bottom: 10px;
  box-shadow: 0px 0px 10px 1px grey;
}
</style>
